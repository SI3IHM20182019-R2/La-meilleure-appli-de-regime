package appregime.controller;

import appregime.Main;

import appregime.model.UserModel;
import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class UtilisateurAcceuilController extends Controller {
    private ArrayList<UserModel> userList = new ArrayList<>();
    private UserModel currentUser;

    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;



    public UtilisateurAcceuilController() {
        super("/appregime/view/utilisateur_acceuil.fxml");

        initializeUserList();
        this.currentUser = this.userList.get(0);
        this.fxml.getStylesheets().add("/appregime/css/acceuil.css");
        addUserButton.setOnAction(event -> addUser());
        currentUserButton.setOnAction(event -> clique());
    }

    private void initializeUserList() {
        String path = Main.class.getResource("/appregime/json/users.json").getPath().replaceAll("%20", " ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            ArrayList json = gson.fromJson(bufferedReader, ArrayList.class);
            for (Object obj : json) {
                String str = gson.toJson(obj);
                UserModel user = gson.fromJson(str, UserModel.class);
                userList.add(user);
                System.out.println("Added --> " + user.toString());
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private void addUser() {
        ConnexionController inscription = new ConnexionController();
        inscription.showInPrimaryStage();
    }

    private void clique() {
        UtilisateurCliqueController clique = new UtilisateurCliqueController(this.currentUser);
        clique.showInPrimaryStage();
    }

    public UserModel getCurrentUser() {
        return currentUser;
    }
}
