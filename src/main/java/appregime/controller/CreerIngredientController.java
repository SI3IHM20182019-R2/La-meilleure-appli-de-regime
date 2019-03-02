package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerIngredientController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    public CreerIngredientController() {
        super("/appregime/view/creer_ingredient.fxml");
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    private void retour() {
        CreerPlatController creerPlatController = new CreerPlatController();
        creerPlatController.showWithMenu();
    }
}
