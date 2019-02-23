package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreerIngredientController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    public CreerIngredientController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/creer_ingredient.fxml");
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    private void retour() {
        CreerPlatController creerPlatController = new CreerPlatController(primaryStage);
        creerPlatController.showWithMenu();
    }
}
