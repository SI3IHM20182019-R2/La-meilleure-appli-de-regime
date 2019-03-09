package appregime.model;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class PlatModel {
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
            updateInfosNutritionnelles(ingredient, "+");
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

    public void addIngredient(IngredientQuantiteModel ingredient) {
        listeIngredient.add(ingredient);
        updateInfosNutritionnelles(ingredient, "+");
    }

    public void deleteIngredient(int index) {
        updateInfosNutritionnelles(listeIngredient.get(index), "-");
        listeIngredient.remove(index);
    }

    public void updateInfosNutritionnelles(IngredientQuantiteModel ingredient, String operation) {
        switch (operation) {
            case "+":
                glucides.setValue(glucides.getValue() + ingredient.getGlucidesPour1g() * ingredient.getQuantiteGrams());
                proteines.setValue(proteines.getValue() + ingredient.getProteinesPour1g() * ingredient.getQuantiteGrams());
                lipides.setValue(lipides.getValue() + ingredient.getLipidesPour1g() * ingredient.getQuantiteGrams());
                calories.setValue(calories.getValue() + ingredient.getCaloriesPour1g() * ingredient.getQuantiteGrams());
                break;
            case "-":
                glucides.setValue(glucides.getValue() - ingredient.getGlucidesPour100g()/100 * ingredient.getQuantiteGrams());
                proteines.setValue(proteines.getValue() - ingredient.getProteinesPour100g()/100 * ingredient.getQuantiteGrams());
                lipides.setValue(lipides.getValue() - ingredient.getLipidesPour100g()/100 * ingredient.getQuantiteGrams());
                calories.setValue(calories.getValue()- ingredient.getCaloriesPour100g()/100 * ingredient.getQuantiteGrams());
        }
        if (glucides.getValue() < 0) {
            glucides.setValue(0);
        }
        if (proteines.getValue() < 0) {
            proteines.setValue(0);
        }
        if (lipides.getValue() < 0) {
            lipides.setValue(0);
        }
        if (calories.getValue() < 0) {
            calories.setValue(0);
        }
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