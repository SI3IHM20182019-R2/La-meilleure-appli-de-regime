package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreerRepasController extends Controller {
    @FXML
    private Button retour;

    public CreerRepasController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/creer_repas.fxml");
        retour.setOnAction(event -> retour());
    }

    /**
     * retour à l'écran "Créer un régime"
     */
    private void retour() {
        CreerRegimeController creerRegimeController = new CreerRegimeController(primaryStage);
        creerRegimeController.showWithMenu();
    }
}
