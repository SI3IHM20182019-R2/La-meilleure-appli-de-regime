package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreerRegimeController extends Controller {
    @FXML
    private Button ajouterRepas;

    public CreerRegimeController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/creer_regime.fxml");
        ajouterRepas.setOnAction(event -> afficheAjouterRepas());
    }

    private void afficheAjouterRepas() {
        AjouterRepasController ajouterRepasController = new AjouterRepasController(primaryStage);
        ajouterRepasController.showInNewStage("Ajouter un repas");
    }
}
