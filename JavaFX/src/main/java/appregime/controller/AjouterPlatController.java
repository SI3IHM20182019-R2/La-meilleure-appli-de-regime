package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AjouterPlatController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerPlat;
    @FXML
    private Button ajouter;

    private UserModel user;

    public AjouterPlatController(UserModel user) {
        super("/appregime/view/ajouter_plat.fxml");
        this.user = user;
        ajouter.setOnAction(event -> myStage.close());
        annuler.setOnAction(event -> myStage.close());
        creerPlat.setOnAction(event -> creerPlat());
    }

    private void creerPlat() {
        myStage.close();
        CreerPlatController creerPlatController = new CreerPlatController(this.user);
        creerPlatController.showWithMenu(this.user);
    }
}