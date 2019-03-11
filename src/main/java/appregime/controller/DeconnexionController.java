package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DeconnexionController extends Controller {

    @FXML
    private Button oui;

    @FXML
    private Button non;

    public DeconnexionController() {
        super("/appregime/view/popupDeconnexion.fxml");
        non.setOnAction(event -> myStage.close());
        oui.setOnMouseClicked(event -> connexion());
    }

        public void connexion() {
            myStage.close();
            UtilisateurAcceuilController utilisateurAcceuilController = new UtilisateurAcceuilController();
            utilisateurAcceuilController.showInPrimaryStage();
        }


}
