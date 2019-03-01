package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import java.util.HashMap;

public class PlatList {

    private ObservableMap<String, ModelPlat> platMap;

    public PlatList() {
        platMap = FXCollections.observableMap(new HashMap<String, ModelPlat>() {});
        IngredientList ingredientList = new IngredientList();
        ObservableMap<String, Modelngredient> mapIngredient = ingredientList.getIngredientMap();

        Modelngredient[] listIngredient =  {mapIngredient.get("eau"), mapIngredient.get("tomate"), mapIngredient.get("pommeDeTerre"), mapIngredient.get("oignon"), mapIngredient.get("ail"), mapIngredient.get("huileOlive"), mapIngredient.get("poivre"), mapIngredient.get("sel"), mapIngredient.get("sucre")};
        Double[] listQuantite = {0.3, 0.3, 0.15, 0.1, 0.1, 0.03, 0.3, 0.2, 0.01, 0.01};
        platMap.put("soupeTomate", new ModelPlat("Soupe de tomate", "../resources/appregime/images/imagesPlat/soupeTomate.jpg", listIngredient, listQuantite));

        Modelngredient[] listIngredientTaboulet =  {mapIngredient.get("tomate"), mapIngredient.get("concombre"), mapIngredient.get("oignon"), mapIngredient.get("menthe"), mapIngredient.get("citron"), mapIngredient.get("persil"), mapIngredient.get("poivre"), mapIngredient.get("sel"), mapIngredient.get("semoule")};
        Double[] listQuantiteTaboulet = {0.275, 0.214, 0.071, 0.003, 0.143, 0.004, 0.002, 0.002, 0.286};
        platMap.put("taboulet", new ModelPlat("Taboulé", "../resources/appregime/images/imagesPlat/taboule.jpg", listIngredientTaboulet, listQuantiteTaboulet));

        Modelngredient[] listIngredientSaladeCesar = {mapIngredient.get("laitue"), mapIngredient.get("poulet"), mapIngredient.get("pain"), mapIngredient.get("parmesan"), mapIngredient.get("tomate"), mapIngredient.get("moutarde"), mapIngredient.get("huileOlive"), mapIngredient.get("citron"), mapIngredient.get("mayonnaise"), mapIngredient.get("sel"), mapIngredient.get("poivre")};
        Double[] listQuantiteSaladeCesar = {0.2, 0.2, 0.2, 0.1, 0.12, 0.02, 0.02, 0.04, 0.02, 0.04, 0.04};
        platMap.put("saladeCesar", new ModelPlat("Salade Cesar", "../resources/appregime/images/imagesPlat/SaladeCesar.jpg", listIngredientSaladeCesar, listQuantiteSaladeCesar));

        Modelngredient[] listIngredientHamburgerFrites = {mapIngredient.get("viandeHachee"), mapIngredient.get("oeuf"), mapIngredient.get("oignon"), mapIngredient.get("pain"), mapIngredient.get("poivre") ,mapIngredient.get("sel"), mapIngredient.get("parmesan"), mapIngredient.get("laitue")};
        Double[] listQuantiteHamburgerFrites = {0.36, 0.05, 0.09, 0.33, 0.02, 0.02, 0.09, 0.04};
        platMap.put("hamburgerFrites", new ModelPlat("Hamburger frites", "../resources/appregime/images/imagesPlat/hamburgerFrites.jpg", listIngredientHamburgerFrites, listQuantiteHamburgerFrites));

        Modelngredient[] listIngredientSaladeDeFruits = {mapIngredient.get("fraise"), mapIngredient.get("framboise"), mapIngredient.get("myrtille"), mapIngredient.get("citron")};
        Double[] listQuantiteSaladeDeFruits = {0.3, 0.3, 0.3, 0.1};
        platMap.put("saladeDeFruits", new ModelPlat("Salade de fruits", "../resources/appregime/images/imagesPlat/saldeDeFruits.jpg", listIngredientSaladeDeFruits, listQuantiteSaladeDeFruits));

        Modelngredient[] listIngredientMousseChocolat = {mapIngredient.get("oeuf"), mapIngredient.get("chocolat")};
        Double[] listQuantiteMousseChocolat = {0.65, 0.35};
        platMap.put("mousseAuChocolat", new ModelPlat("Mousse au chocolat", "../resources/appregime/images/imagesPlat/mousseChocolat.jpg", listIngredientMousseChocolat, listQuantiteMousseChocolat));
    }

    public ObservableMap<String, ModelPlat> getPlatMap() {
        return platMap;
    }

    public void add(String nomPlat, ModelPlat plat) {
        platMap.put(nomPlat, plat);
    }
}