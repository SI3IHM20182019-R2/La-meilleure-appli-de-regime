package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UtilisateurAcceuilController extends Controller {
    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;

    public UtilisateurAcceuilController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/utilisateur_acceuil.fxml");
        addUserButton.setOnAction(event -> addUser());
        currentUserButton.setOnAction(event -> clique());
    }

    private void addUser() {
        ConnexionController inscription = new ConnexionController(primaryStage);
        inscription.showInPrimaryStage();
    }

    private void clique() {
        UtilisateurCliqueController clique = new UtilisateurCliqueController(primaryStage);
        clique.showInPrimaryStage();
    }
}
