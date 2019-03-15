package appregime.controller;


import appregime.Main;
import appregime.model.UserList;
import appregime.model.UserModel;
import com.google.gson.Gson;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class UtilisateurCliqueController extends Controller {
    private ArrayList<UserModel> userList = UserList.getUserList();
    private UserModel first_user = userList.get(0);

    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;
    @FXML
    private Button connexionButton;
    @FXML
    private TextField passwordField;

    public UtilisateurCliqueController(UserModel user) {
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
        AccueilController acceuil = new AccueilController(first_user);
        acceuil.showWithMenu(first_user);
    }


}