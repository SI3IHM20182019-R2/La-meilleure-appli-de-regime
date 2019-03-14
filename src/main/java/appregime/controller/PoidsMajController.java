package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PoidsMajController extends Controller {

    @FXML
    private Button cancelButton;

    public PoidsMajController() {
        super("/appregime/view/poids_maj.fxml");
        cancelButton.setOnAction(event -> myStage.close());
    }

}
