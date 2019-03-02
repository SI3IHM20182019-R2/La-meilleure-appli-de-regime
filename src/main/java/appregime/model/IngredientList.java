package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.HashMap;

public class IngredientList extends Model {
    private ObservableMap<String, Modelngredient> ingredientMap;

    public IngredientList() {
        // A rajouter les bonnes valeurs des valeurs nutritionnelles et verifier les paths.
        ingredientMap = FXCollections.observableMap(new HashMap<String, Modelngredient>() {
        });
        ingredientMap.put("huileOlive", new Modelngredient("huile d'olive", 0.0, 100.0, 0.0, 0.0, "resources/images/huile_olive"));
        ingredientMap.put("tomate", new Modelngredient("tomate", 18.4, 0.0, 2.26, 0.0, "resources/images/tomate"));
        ingredientMap.put("pommeDeTerre", new Modelngredient("pomme de terre",  0.0, 0.1, 18.3, 0.0, "resources/images/pomme de terre"));
        ingredientMap.put("ail", new Modelngredient("ail", 0.0, 0.34, 0.0, 5.0, "resources/images/ail"));
        ingredientMap.put("poivre", new Modelngredient("poivre", 0.0, 0.0, 2.9, 0.0, "resources/images/poivre"));
        ingredientMap.put("sel", new Modelngredient("sel", 0.0, 1.2, 0.0, 10.0, "resources/images/sel"));
        ingredientMap.put("eau", new Modelngredient("eau", 0.0, 0.0, 0.0, 0.0, "resources/images/eau"));
        ingredientMap.put("sucre", new Modelngredient("sucre", 0.0, 0.0, 200.0, 0.0, "resources/images/sucre"));
        ingredientMap.put("concombre", new Modelngredient("concombre", 0.0, 1.2, 0.0, 10.0, "resources/images/concombre"));
        ingredientMap.put("oignon", new Modelngredient("oignon", 0.0, 0.0, 0.0, 0.0, "resources/images/oignon"));
        ingredientMap.put("menthe", new Modelngredient("menthe", 0.0, 0.0, 200.0, 0.0, "resources/images/su"));
        ingredientMap.put("persil", new Modelngredient("persil", 0.0, 1.2, 0.0, 10.0, "resources/images/persil"));
        ingredientMap.put("semoule", new Modelngredient("semoule", 0.0, 0.0, 0.0, 0.0, "resources/images/semoule"));
        ingredientMap.put("citron", new Modelngredient("citron", 0.0, 0.0, 200.0, 0.0, "resources/images/citron"));
        ingredientMap.put("poulet", new Modelngredient("poulet", 0.0, 1.2, 0.0, 10.0, "resources/images/persil"));
        ingredientMap.put("parmesan", new Modelngredient("parmesan", 0.0, 0.0, 0.0, 0.0, "resources/images/semoule"));
        ingredientMap.put("moutarde", new Modelngredient("moutarde", 0.0, 0.0, 200.0, 0.0, "resources/images/citron"));
        ingredientMap.put("viandeHachee", new Modelngredient("viande hachee", 0.0, 1.2, 0.0, 10.0, "resources/images/viande_hachee"));
        ingredientMap.put("biscotte", new Modelngredient("biscotte", 0.0, 0.0, 0.0, 0.0, "resources/images/biscotte"));
        ingredientMap.put("oeuf", new Modelngredient("oeuf", 0.0, 0.0, 200.0, 0.0, "resources/images/oeuf"));
        ingredientMap.put("pain", new Modelngredient("pain", 0.0, 1.2, 0.0, 10.0, "resources/images/pain"));
        ingredientMap.put("mayonnaise", new Modelngredient("mayonnaise", 0.0, 1.2, 0.0, 10.0, "resources/images/mayonnaise"));
        ingredientMap.put("cornichons", new Modelngredient("cornichons", 0.0, 1.2, 0.0, 10.0, "resources/images/cornichon"));
        ingredientMap.put("fraise", new Modelngredient("fraise", 0.0, 0.0, 200.0, 0.0, "resources/images/fraise"));
        ingredientMap.put("framboise", new Modelngredient("framboise", 0.0, 1.2, 0.0, 10.0, "resources/images/framboise"));
        ingredientMap.put("myrtille", new Modelngredient("myrtille", 0.0, 0.0, 0.0, 0.0, "resources/images/myrtille"));
        ingredientMap.put("chocolat", new Modelngredient("chocolat", 0.0, 0.0, 200.0, 0.0, "resources/images/chocolat"));
        ingredientMap.put("sucreVanille", new Modelngredient("sucre vanille", 0.0, 1.2, 0.0, 10.0, "resources/images/sucre_vanille"));
        ingredientMap.put("laitue", new Modelngredient("laitue", 15.0, 0.2, 2.9, 1.4, "appregime/images/laitue.jpg"));

    }

    public ObservableMap<String, Modelngredient> getIngredientMap() {
        return ingredientMap;
    }

    public void add(String nomIngredient, Modelngredient ingredient) {
        ingredientMap.put(nomIngredient, ingredient);
    }

    public ObservableList<Modelngredient> getIngredientList() {
        ObservableList<Modelngredient> l = FXCollections.observableList(new ArrayList<>());
        l.addAll(ingredientMap.values());
        return l;
    }
}