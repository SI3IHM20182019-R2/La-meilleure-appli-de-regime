package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AjouterRepasController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerRepas;
    @FXML
    private Button ajouter;

    public AjouterRepasController() {
        super("/appregime/view/ajouter_repas.fxml");
        ajouter.setOnAction(event -> myStage.close());
        annuler.setOnAction(event -> myStage.close());
        creerRepas.setOnAction(event -> creerRepas());
    }

    private void creerRepas() {
        myStage.close();
        CreerRepasController creerRepasController = new CreerRepasController();
        creerRepasController.showWithMenu();
    }
}