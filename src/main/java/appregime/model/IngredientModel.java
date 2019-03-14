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

    public double getCaloriesPour100g() {
        return calories;
    }

    public double getLipidesPour100g() {
        return lipides;
    }

    public double getGlucidesPour100g() {
        return glucides;
    }

    public double getProteinesPour100g() {
        return proteines;
    }

    public double getCaloriesPour1g() {
        return calories/100;
    }

    public double getLipidesPour1g() {
        return lipides/100;
    }

    public double getGlucidesPour1g() {
        return glucides/100;
    }

    public double getProteinesPour1g() {
        return proteines/100;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }
}