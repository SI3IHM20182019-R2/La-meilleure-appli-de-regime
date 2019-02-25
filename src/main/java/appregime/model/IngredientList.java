package appregime.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class IngredientList {

    private static List<Ingredient> ingredientList = new ArrayList<Ingredient>();

    public void initialiser() {

        // A rajouter les bonnes valeurs des valeurs nutritionnelles et verifier les paths.

        ingredientList.add(new Ingredient("huile d'olive", 0.0, 100.0, 0.0, 0.0, "resources/images/huile_olive"));
        ingredientList.add( new Ingredient("tomate", 18.4, 0.0, 2.26, 0.0, "resources/images/tomate"));
        ingredientList.add(new Ingredient("pomme de terre",  0.0, 0.1, 18.3, 0.0, "resources/images/pomme de terre"));
        ingredientList.add( new Ingredient("ail", 0.0, 0.34, 0.0, 5.0, "resources/images/ail"));
        ingredientList.add( new Ingredient("poivre", 0.0, 0.0, 2.9, 0.0, "resources/images/poivre"));
        ingredientList.add( new Ingredient("sel", 0.0, 1.2, 0.0, 10.0, "resources/images/sel"));
        ingredientList.add( new Ingredient("eau", 0.0, 0.0, 0.0, 0.0, "resources/images/eau"));
        ingredientList.add( new Ingredient("sucre", 0.0, 0.0, 200.0, 0.0, "resources/images/sucre"));
        ingredientList.add( new Ingredient("concombre", 0.0, 1.2, 0.0, 10.0, "resources/images/concombre"));
        ingredientList.add(  new Ingredient("oignon", 0.0, 0.0, 0.0, 0.0, "resources/images/oignon"));
        ingredientList.add( new Ingredient("menthe", 0.0, 0.0, 200.0, 0.0, "resources/images/su"));
        ingredientList.add( new Ingredient("persil", 0.0, 1.2, 0.0, 10.0, "resources/images/persil"));
        ingredientList.add(  new Ingredient("semoule", 0.0, 0.0, 0.0, 0.0, "resources/images/semoule"));
        ingredientList.add( new Ingredient("citron", 0.0, 0.0, 200.0, 0.0, "resources/images/citron"));
        ingredientList.add( new Ingredient("poulet", 0.0, 1.2, 0.0, 10.0, "resources/images/persil"));
        ingredientList.add( new Ingredient("parmesan", 0.0, 0.0, 0.0, 0.0, "resources/images/semoule"));
        ingredientList.add( new Ingredient("moutarde", 0.0, 0.0, 200.0, 0.0, "resources/images/citron"));
        ingredientList.add( new Ingredient("viande_hachee", 0.0, 1.2, 0.0, 10.0, "resources/images/viande_hachee"));
        ingredientList.add(  new Ingredient("biscotte", 0.0, 0.0, 0.0, 0.0, "resources/images/biscotte"));
        ingredientList.add( new Ingredient("oeuf", 0.0, 0.0, 200.0, 0.0, "resources/images/oeuf"));
        ingredientList.add( new Ingredient("pain", 0.0, 1.2, 0.0, 10.0, "resources/images/pain"));
        ingredientList.add(  new Ingredient("mayonnaise", 0.0, 1.2, 0.0, 10.0, "resources/images/mayonnaise"));
        ingredientList.add(  new Ingredient("cornichons", 0.0, 1.2, 0.0, 10.0, "resources/images/cornichon"));
        ingredientList.add( new Ingredient("fraise", 0.0, 0.0, 200.0, 0.0, "resources/images/fraise"));
        ingredientList.add(  new Ingredient("framboise", 0.0, 1.2, 0.0, 10.0, "resources/images/framboise"));
        ingredientList.add(  new Ingredient("myrtille", 0.0, 0.0, 0.0, 0.0, "resources/images/myrtille"));
        ingredientList.add(  new Ingredient("chocolat", 0.0, 0.0, 200.0, 0.0, "resources/images/chocolat"));
        ingredientList.add(   new Ingredient("sucre_vanille", 0.0, 1.2, 0.0, 10.0, "resources/images/sucre_vanille"));

    }

    public static List<Ingredient> getIngredientList() {
        return ingredientList;
    }
}