package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.HashMap;

public class IngredientList {
    private ObservableMap<String, IngredientModel> ingredientMap;

    public IngredientList() {
        // A rajouter les bonnes valeurs des valeurs nutritionnelles et verifier les paths.
        ingredientMap = FXCollections.observableMap(new HashMap<String, IngredientModel>() {
        });
        ingredientMap.put("huileOlive", new IngredientModel("huile d'olive", 884.0, 100.0, 0.0, 0.0, "/appregime/images/ingredients/huile_olive.jpg"));
        ingredientMap.put("tomate", new IngredientModel("tomate", 18.4, 0.0, 2.26, 0.0, "/appregime/images/ingredients/tomate.jpg"));
        ingredientMap.put("pommeDeTerre", new IngredientModel("pomme de terre",  85.0, 0.1, 18.3, 1.5, "/appregime/images/ingredients/pomme_de_terre.jpg"));
        ingredientMap.put("ail", new IngredientModel("ail", 149, 0.34, 30, 5.0, "/appregime/images/ingredients/ail.jpg"));
        ingredientMap.put("poivre", new IngredientModel("poivre", 0.0, 0.0, 2.9, 0.0, "/appregime/images/ingredients/poivre.jpg"));
        ingredientMap.put("sel", new IngredientModel("sel", 0.0, 1.2, 0.0, 0.0, "/appregime/images/ingredients/sel.jpeg"));
        ingredientMap.put("eau", new IngredientModel("eau", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/eau.jpg"));
        ingredientMap.put("sucre", new IngredientModel("sucre", 400.0, 0.0, 100.0, 0.0, "/appregime/images/ingredients/sucre.jpg"));
        ingredientMap.put("concombre", new IngredientModel("concombre", 21.0, 1.2, 2.0, 1.0, "/appregime/images/ingredients/concombre.jpg"));
        ingredientMap.put("oignon", new IngredientModel("oignon", 39.0, 0.6, 6.25, 1.1, "/appregime/images/ingredients/oignon.jpg"));
        ingredientMap.put("menthe", new IngredientModel("menthe", 49.0, 0.84, 5.3, 3.5, "/appregime/images/ingredients/menthe.jpg"));
        ingredientMap.put("persil", new IngredientModel("persil", 40.0, 0.6, 3.5, 3.6, "/appregime/images/ingredients/persil.jpg"));
        ingredientMap.put("semoule", new IngredientModel("semoule", 360.0, 1.1, 72.8, 12.7, "/appregime/images/ingredients/semoule.jpg"));
        ingredientMap.put("citron", new IngredientModel("citron", 15.0, 0.4, 8, 1, "/appregime/images/ingredients/citron.jpg"));
        ingredientMap.put("poulet", new IngredientModel("poulet", 121.0, 1.8, 0.0, 26.2, "/appregime/images/ingredients/poulet.jpg"));
        ingredientMap.put("parmesan", new IngredientModel("parmesan", 431.0, 28.0, 4.1, 38.0, "/appregime/images/ingredients/parmesan.jpg"));
        ingredientMap.put("moutarde", new IngredientModel("moutarde", 65.00, 4.0, 5.0, 4.0, "/appregime/images/ingredients/moutarde.jpg"));
        ingredientMap.put("viandeHachee", new IngredientModel("viande hachee", 332.0, 30.0, 0.0, 14.0, "/appregime/images/ingredients/boeufHache.jpg"));
        ingredientMap.put("biscotte", new IngredientModel("biscotte", 407.0, 7.0, 72.0, 13.0, "/appregime/images/ingredients/biscotte.jpg"));
        ingredientMap.put("oeuf", new IngredientModel("oeuf", 155.0, 11.0, 1.1, 13.0, "/appregime/images/ingredients/oeuf.jpg"));
        ingredientMap.put("pain", new IngredientModel("pain", 265.0, 1.2, 17.7, 2.7, "/appregime/images/ingredients/pain.jpg"));
        ingredientMap.put("mayonnaise", new IngredientModel("mayonnaise", 680.0, 75.0, 0.6, 1.0, "/appregime/images/ingredients/mayo.jpg"));
        ingredientMap.put("cornichons", new IngredientModel("cornichons", 16.0, 0.2, 2.3, 0.3, "/appregime/images/ingredients/cornichon.jpg"));
        ingredientMap.put("fraise", new IngredientModel("fraise", 35.0, 0.18, 6.14, 0.65, "/appregime/images/ingredients/fraise.jpg"));
        ingredientMap.put("framboise", new IngredientModel("framboise", 53.0, 0.7, 12.0, 1.2, "/appregime/images/ingredients/framboise.jpg"));
        ingredientMap.put("myrtille", new IngredientModel("myrtille", 63.0, 0.7, 13.0, 1.2, "/appregime/images/ingredients/myrtille.jpg"));
        ingredientMap.put("chocolat", new IngredientModel("chocolat", 546.0, 31.0, 61.0, 5.0, "/appregime/images/ingredients/chocolat.jpg"));
        ingredientMap.put("sucreVanille", new IngredientModel("sucre vanille", 400.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/vanille.jpg"));
        ingredientMap.put("laitue", new IngredientModel("laitue", 15.0, 0.2, 2.9, 1.4, "/appregime/images/ingredients/laitue.jpg"));

    }

    public ObservableMap<String, IngredientModel> getIngredientMap() {
        return ingredientMap;
    }

    public void add(String nomIngredient, IngredientModel ingredient) {
        ingredientMap.put(nomIngredient, ingredient);
    }

    public ObservableList<IngredientModel> getIngredientList() {
        ObservableList<IngredientModel> l = FXCollections.observableList(new ArrayList<>());
        l.addAll(ingredientMap.values());
        return l;
    }
}