package appregime.model;

public class IngredientQuantiteModel extends IngredientModel {
    private double quantiteGrams;

    public IngredientQuantiteModel(String name, Double calories, Double lipides, Double glucides, Double proteines, String imagePath, double quantiteGrams) {
        super(name, calories, lipides, glucides, proteines, imagePath);
        this.quantiteGrams = quantiteGrams;
    }

    public IngredientQuantiteModel(IngredientModel ingredientModel, double quantiteGrams) {
        super(ingredientModel.getName(), ingredientModel.getCalories(), ingredientModel.getLipides(), ingredientModel.getGlucides(), ingredientModel.getProteines(), ingredientModel.getImagePath());
        this.quantiteGrams = quantiteGrams;
    }

    public double getQuantiteGrams() {
        return quantiteGrams;
    }
}
