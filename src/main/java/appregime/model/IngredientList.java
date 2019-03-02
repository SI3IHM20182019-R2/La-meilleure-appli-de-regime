package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.HashMap;

public class IngredientList extends Model {
    private ObservableMap<String, IngredientModel> ingredientMap;

    public IngredientList() {
        // A rajouter les bonnes valeurs des valeurs nutritionnelles et verifier les paths.
        ingredientMap = FXCollections.observableMap(new HashMap<String, IngredientModel>() {
        });
        ingredientMap.put("huileOlive", new IngredientModel("huile d'olive", 0.0, 100.0, 0.0, 0.0, "/appregime/images/ingredients/huile_olive.jpg"));
        ingredientMap.put("tomate", new IngredientModel("tomate", 18.4, 0.0, 2.26, 0.0, "/appregime/images/ingredients/tomate.jpg"));
        ingredientMap.put("pommeDeTerre", new IngredientModel("pomme de terre",  0.0, 0.1, 18.3, 0.0, "/appregime/images/ingredients/pomme_de_terre.jpg"));
        ingredientMap.put("ail", new IngredientModel("ail", 0.0, 0.34, 0.0, 5.0, "/appregime/images/ingredients/ail.jpg"));
        ingredientMap.put("poivre", new IngredientModel("poivre", 0.0, 0.0, 2.9, 0.0, "/appregime/images/ingredients/poivre.jpg"));
        ingredientMap.put("sel", new IngredientModel("sel", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/sel.jpeg"));
        ingredientMap.put("eau", new IngredientModel("eau", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/eau.jpg"));
        ingredientMap.put("sucre", new IngredientModel("sucre", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/sucre.jpg"));
        ingredientMap.put("concombre", new IngredientModel("concombre", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/concombre.jpg"));
        ingredientMap.put("oignon", new IngredientModel("oignon", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/oignon.jpg"));
        ingredientMap.put("menthe", new IngredientModel("menthe", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/menthe.jpg"));
        ingredientMap.put("persil", new IngredientModel("persil", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/persil.jpg"));
        ingredientMap.put("semoule", new IngredientModel("semoule", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/semoule.jpg"));
        ingredientMap.put("citron", new IngredientModel("citron", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/citron.jpg"));
        ingredientMap.put("poulet", new IngredientModel("poulet", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/persil.jpg"));
        ingredientMap.put("parmesan", new IngredientModel("parmesan", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/semoule.jpg"));
        ingredientMap.put("moutarde", new IngredientModel("moutarde", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/citron.jpg"));
        ingredientMap.put("viandeHachee", new IngredientModel("viande hachee", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/tomate.jpg"));
        ingredientMap.put("biscotte", new IngredientModel("biscotte", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/biscotte.jpg"));
        ingredientMap.put("oeuf", new IngredientModel("oeuf", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/oeuf.jpg"));
        ingredientMap.put("pain", new IngredientModel("pain", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/pain.jpg"));
        ingredientMap.put("mayonnaise", new IngredientModel("mayonnaise", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/mayo.jpg"));
        ingredientMap.put("cornichons", new IngredientModel("cornichons", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/cornichon.jpg"));
        ingredientMap.put("fraise", new IngredientModel("fraise", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/fraise.jpg"));
        ingredientMap.put("framboise", new IngredientModel("framboise", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/framboise.jpg"));
        ingredientMap.put("myrtille", new IngredientModel("myrtille", 0.0, 0.0, 0.0, 0.0, "/appregime/images/ingredients/myrtille.jpg"));
        ingredientMap.put("chocolat", new IngredientModel("chocolat", 0.0, 0.0, 200.0, 0.0, "/appregime/images/ingredients/sucre.jpg"));
        ingredientMap.put("sucreVanille", new IngredientModel("sucre vanille", 0.0, 1.2, 0.0, 10.0, "/appregime/images/ingredients/sucre.jpg"));
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