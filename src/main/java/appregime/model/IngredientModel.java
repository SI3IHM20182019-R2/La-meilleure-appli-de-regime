package appregime.model;

public class IngredientModel {

    private String name;
    private double calories;
    private double lipides;
    private double glucides;
    private double proteines;
    private String imagePath;

    public IngredientModel(String name, double calories, double lipides, double glucides, double proteines, String imagePath) {
        this.name = name;
        this.calories = calories;
        this.lipides = lipides;
        this.glucides = glucides;
        this.proteines = proteines;
        this.imagePath = imagePath;
    }

    public double getCalories() {
        return calories;
    }

    public double getLipides() {
        return lipides;
    }

    public double getGlucides() {
        return glucides;
    }

    public double getProteines() {
        return proteines;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }
}