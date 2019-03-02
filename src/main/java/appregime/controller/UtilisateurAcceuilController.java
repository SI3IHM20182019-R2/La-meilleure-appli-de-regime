package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UtilisateurAcceuilController extends Controller {
    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;

    public UtilisateurAcceuilController() {
        super("/appregime/view/utilisateur_acceuil.fxml");
        addUserButton.setOnAction(event -> addUser());
        currentUserButton.setOnAction(event -> clique());
    }

    private void addUser() {
        ConnexionController inscription = new ConnexionController();
        inscription.showInPrimaryStage();
    }

    private void clique() {
        UtilisateurCliqueController clique = new UtilisateurCliqueController();
        clique.showInPrimaryStage();
    }
}
