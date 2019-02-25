package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UtilisateurCliqueController extends Controller {
    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;
    @FXML
    private Button connexionButton;
    @FXML
    private TextField passwordField;

    public UtilisateurCliqueController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/utilisateur_clique.fxml");
        addUserButton.setOnAction(event -> addUser());
        connexionButton.setOnAction(event -> connexion());
    }

    private void addUser() {
        ConnexionController inscription = new ConnexionController(primaryStage);
        inscription.showInPrimaryStage();
    }

    private void connexion() {
        AccueilController acceuil = new AccueilController(primaryStage);
        acceuil.showWithMenu();
    }
}