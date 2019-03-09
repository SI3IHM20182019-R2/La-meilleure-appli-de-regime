package appregime.controller;

import appregime.Main;
import appregime.model.UserModel;
import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class UtilisateurCliqueController extends Controller {
    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;
    @FXML
    private Button connexionButton;
    @FXML
    private TextField passwordField;

    public UtilisateurCliqueController() {
        super("/appregime/view/utilisateur_clique.fxml");
        this.fxml.getStylesheets().add("/appregime/css/acceuil.css");
        addUserButton.setOnAction(event -> addUser());
        connexionButton.setOnAction(event -> connexion());
    }

    private void addUser() {
        ConnexionController inscription = new ConnexionController();
        inscription.showInPrimaryStage();
    }

    private void connexion() {
        String path = Main.class.getResource("/appregime/json/users.json").getPath().replaceAll("%20", " ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            ArrayList json = gson.fromJson(bufferedReader, ArrayList.class);
            String user_json = gson.toJson(json.get(0));
            UserModel first_user = gson.fromJson(user_json, UserModel.class);
            AccueilController acceuil = new AccueilController(first_user);
            acceuil.showWithMenu(first_user);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}