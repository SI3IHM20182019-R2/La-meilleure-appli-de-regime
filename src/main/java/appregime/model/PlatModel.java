package appregime.model;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class PlatModel extends Model {
    private StringProperty nomPlat;
    private StringProperty cheminImage;
    private ObservableList<IngredientQuantiteModel> listeIngredient;
    private IntegerProperty glucides;
    private IntegerProperty proteines;
    private IntegerProperty lipides;
    private IntegerProperty calories;

    public PlatModel(String nomPlat, String cheminImage, List<IngredientQuantiteModel> listeIngredient) {
        this.nomPlat = new SimpleStringProperty(nomPlat);
        this.cheminImage = new SimpleStringProperty(cheminImage);
        this.listeIngredient = FXCollections.observableList(listeIngredient);

        for (IngredientQuantiteModel ingredient : listeIngredient) {
            addInfosNutritionnelles(ingredient);
        }

        glucides = new SimpleIntegerProperty();
        proteines = new SimpleIntegerProperty();
        lipides = new SimpleIntegerProperty();
        calories = new SimpleIntegerProperty();
    }

    public PlatModel() {
        this.nomPlat = new SimpleStringProperty();
        this.cheminImage = new SimpleStringProperty();
        this.listeIngredient = FXCollections.observableList(new ArrayList<>());

        glucides = new SimpleIntegerProperty();
        proteines = new SimpleIntegerProperty();
        lipides = new SimpleIntegerProperty();
        calories = new SimpleIntegerProperty();
    }

    public void setName(String nomPlat) {
        this.nomPlat = new SimpleStringProperty(nomPlat);;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = new SimpleStringProperty(cheminImage);;
    }

    public void addIngredient(IngredientQuantiteModel ingredient) {
        listeIngredient.add(ingredient);
        addInfosNutritionnelles(ingredient);
    }

    public void addInfosNutritionnelles(IngredientQuantiteModel ingredient) {
        glucides.setValue(glucides.getValue() + ingredient.getGlucides() * ingredient.getQuantiteGrams());
        proteines.setValue(proteines.getValue() + ingredient.getProteines() * ingredient.getQuantiteGrams());
        lipides.setValue(lipides.getValue() + ingredient.getLipides() * ingredient.getQuantiteGrams());
        calories.setValue(calories.getValue() + ingredient.getCalories() * ingredient.getQuantiteGrams());
    }

    public ObservableList<IngredientQuantiteModel> getListIngredients() {
        return listeIngredient;
    }

    public StringProperty getImagePath() {
        return this.cheminImage;
    }

    public StringProperty getName() {
        return this.nomPlat;
    }

    public IntegerProperty getGlucides() {
        return glucides;
    }

    public IntegerProperty getProteines() {
        return proteines;
    }

    public IntegerProperty getLipides() {
        return lipides;
    }

    public IntegerProperty getCalories() {
        return calories;
    }
}