package appregime.controller;

import appregime.model.Modelngredient;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IngredientController extends Controller {
    @FXML
    private Label nomIngredient;

    public IngredientController() {
        super("/appregime/view/ingredient.fxml");
    }


    public void setNomIngredient(Modelngredient ingredient) {
        nomIngredient.setText(ingredient.getName());
    }
}
