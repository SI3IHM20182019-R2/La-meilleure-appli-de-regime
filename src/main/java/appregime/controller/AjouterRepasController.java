package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AjouterRepasController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerRepas;
    @FXML
    private Button ajouter;

    private UserModel user;

    public AjouterRepasController(UserModel user) {
        super("/appregime/view/ajouter_repas.fxml");
        this.user = user;
        ajouter.setOnAction(event -> myStage.close());
        annuler.setOnAction(event -> myStage.close());
        creerRepas.setOnAction(event -> creerRepas());
    }

    private void creerRepas() {
        myStage.close();
        CreerRepasController creerRepasController = new CreerRepasController(this.user);
        creerRepasController.showWithMenu(this.user);
    }
}