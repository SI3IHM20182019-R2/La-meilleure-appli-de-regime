package appregime.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ModelPlat {

    private StringProperty nomPlat;
    private StringProperty cheminImage;
    private Modelngredient[] listeIngredient;
    private Double[] pourcentageIngredient;

    public ModelPlat(String nomPlat, String cheminImage, Modelngredient[] listeIngredient, Double[] pourcentageIngredient) {
        this.nomPlat = new SimpleStringProperty(nomPlat);
        this.cheminImage = new SimpleStringProperty(cheminImage);
        this.listeIngredient = listeIngredient;
        this.pourcentageIngredient = pourcentageIngredient;

    }


    public Double getCalories() {
        double quantiteCalories = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.length; numIngredient++){
            quantiteCalories += this.pourcentageIngredient[numIngredient] * this.listeIngredient[numIngredient].getCalories();
        }
        return quantiteCalories;
    }

    public Double getLipides() {
        double quantiteLipides = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.length; numIngredient++){
            quantiteLipides += this.pourcentageIngredient[numIngredient] * this.listeIngredient[numIngredient].getLipides();
        }
        return quantiteLipides;
    }

    public Double getGlucides() {
        double quantiteGlucides = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.length; numIngredient++){
            quantiteGlucides += this.pourcentageIngredient[numIngredient] * this.listeIngredient[numIngredient].getGlucides();
        }
        return quantiteGlucides;
    }

    public Double getProteines() {
        double quantiteProteine = 0;
        for (int numIngredient = 0; numIngredient<this.listeIngredient.length; numIngredient++){
            quantiteProteine += this.pourcentageIngredient[numIngredient] * this.listeIngredient[numIngredient].getProteines();
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