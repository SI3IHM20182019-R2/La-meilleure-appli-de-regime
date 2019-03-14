package appregime.controller;

import appregime.model.IngredientQuantiteModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IngredientQuantiteController extends Controller {
    @FXML
    private Label nomIngredient;
    @FXML
    private Label quantite;
    @FXML
    private ImageView imageIngredient;

    public IngredientQuantiteController() {
        super("/appregime/view/ingredient_quantite.fxml");
    }


    public void setIngredient(IngredientQuantiteModel ingredient) {
        nomIngredient.setText(ingredient.getName());
        quantite.setText(ingredient.getQuantiteGrams() + " g");
        imageIngredient.setImage(new Image(ingredient.getImagePath()));
    }
}