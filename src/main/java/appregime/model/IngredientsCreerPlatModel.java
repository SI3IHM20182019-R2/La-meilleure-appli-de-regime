package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class IngredientsCreerPlatModel extends Model {
    private ObservableList<IngredientQuantiteModel> ingredients;

    public IngredientsCreerPlatModel() {
        ingredients = FXCollections.observableList(new ArrayList<>());
    }

    public void addIngredient(IngredientQuantiteModel ingredient) {
        ingredients.add(ingredient);
    }

    public ObservableList<IngredientQuantiteModel> getListIngredients() {
        return ingredients;
    }
}
