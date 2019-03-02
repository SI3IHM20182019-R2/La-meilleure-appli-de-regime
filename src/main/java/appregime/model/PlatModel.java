package appregime.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.List;

public class PlatModel {

    private StringProperty nomPlat;
    private StringProperty cheminImage;
    private List<IngredientModel> listeIngredient;
    private List<Double> pourcentageIngredient;

    public PlatModel(String nomPlat, String cheminImage, List<IngredientModel> listeIngredient, List<Double> pourcentageIngredient) {
        this.nomPlat = new SimpleStringProperty(nomPlat);
        this.cheminImage = new SimpleStringProperty(cheminImage);
        this.listeIngredient = listeIngredient;
        this.pourcentageIngredient = pourcentageIngredient;

    }


    public Double getCalories() {
        double quantiteCalories = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.size(); numIngredient++){
            quantiteCalories += this.pourcentageIngredient.get(numIngredient) * this.listeIngredient.get(numIngredient).getCalories();
        }
        return quantiteCalories;
    }

    public Double getLipides() {
        double quantiteLipides = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.size(); numIngredient++){
            quantiteLipides += this.pourcentageIngredient.get(numIngredient) * this.listeIngredient.get(numIngredient).getLipides();
        }
        return quantiteLipides;
    }

    public Double getGlucides() {
        double quantiteGlucides = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.size(); numIngredient++){
            quantiteGlucides += this.pourcentageIngredient.get(numIngredient) * this.listeIngredient.get(numIngredient).getGlucides();
        }
        return quantiteGlucides;
    }

    public Double getProteines() {
        double quantiteProteine = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.size(); numIngredient++){
            quantiteProteine += this.pourcentageIngredient.get(numIngredient) * this.listeIngredient.get(numIngredient).getProteines();
        }
        return quantiteProteine;
    }

    public StringProperty getImagePath() {
        return this.cheminImage;
    }

    public StringProperty getName() {
        return this.nomPlat;
    }
}