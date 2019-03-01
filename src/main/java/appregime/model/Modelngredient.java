package appregime.model;

import javax.print.DocFlavor;
import java.awt.*;

public class Modelngredient {

    private String name;
    private Double calories;
    private Double lipides;
    private Double glucides;
    private Double proteines;
    private String imagePath;

    public Modelngredient(String name, Double calories, Double lipides, Double glucides, Double proteines, String imagePath) {
        this.name = name;
        this.calories = calories;
        this.lipides = lipides;
        this.glucides = glucides;
        this.proteines = proteines;
        this.imagePath = imagePath;
    }

    public Double getCalories() {
        return calories;
    }

    public Double getLipides() {
        return lipides;
    }

    public Double getGlucides() {
        return glucides;
    }

    public Double getProteines() {
        return proteines;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }
}