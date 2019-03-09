package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerIngredientController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    private UserModel user;

    public CreerIngredientController(UserModel user) {
        super("/appregime/view/creer_ingredient.fxml");
        this.user = user;
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    private void retour() {
        CreerPlatController creerPlatController = new CreerPlatController(this.user);
        creerPlatController.showWithMenu(this.user);
    }
}
