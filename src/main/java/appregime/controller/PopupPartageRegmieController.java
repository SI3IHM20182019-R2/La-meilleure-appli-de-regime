package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import static java.lang.Thread.sleep;

public class PopupPartageRegmieController extends Controller {

    @FXML
    private Button oui;

    @FXML
    private Button non;

    private UserModel user;

    public PopupPartageRegmieController(UserModel user) {
        super("/appregime/view/popUpPartageRegime.fxml");
        this.user=user;
        non.setOnMouseClicked(event -> retour());
        oui.setOnMouseClicked(event -> retour());
    }
    public void retour() {
        myStage.close();
        MesRegimesController mesRegimesController = new MesRegimesController(this.user);
        mesRegimesController.showWithMenu(this.user);
    }
}
