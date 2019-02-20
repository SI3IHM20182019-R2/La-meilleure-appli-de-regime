package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AjouterRepasController extends Controller {
    @FXML
    private Button annuler;

    public AjouterRepasController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/ajouter_repas.fxml");
        annuler.setOnAction(event -> myStage.close());
    }
}