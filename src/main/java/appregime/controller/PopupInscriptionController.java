package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PopupInscriptionController extends Controller{

    @FXML
    private Button popupInscriptionButton;

    public PopupInscriptionController() {
        super("/appregime/view/popupInscription.fxml");
        popupInscriptionButton.setOnAction(event -> myStage.close());
    }
}
