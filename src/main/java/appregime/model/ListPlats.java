package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListPlats {

    private ObservableMap<String, PlatModel> platMap;

    public ListPlats() {
        platMap = FXCollections.observableMap(new HashMap<String, PlatModel>() {});
        IngredientList ingredientList = new IngredientList();
        ObservableMap<String, IngredientModel> mapIngredient = ingredientList.getIngredientMap();

        //Declaration du plat soupe tomate
        ArrayList<IngredientQuantiteModel> ingredientQuantiteListSoupeTomate = new ArrayList<IngredientQuantiteModel>();
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("eau"), 30));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("tomate"), 30));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("pommeDeTerre"), 10));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("oignon"), 10));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("ail"), 10));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("huileOlive"), 3));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("poivre"), 3));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("sel"), 2));
        ingredientQuantiteListSoupeTomate.add(new IngredientQuantiteModel(mapIngredient.get("sucre"), 2));
        platMap.put("soupeTomate", new PlatModel("Soupe de tomate", "../resources/appregime/images/imagesPlat/soupeTomate.jpg", ingredientQuantiteListSoupeTomate));

        //Declaration du plat taboulet
        ArrayList<IngredientQuantiteModel> ingredientQuantiteListTaboulet = new ArrayList<IngredientQuantiteModel>();
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("tomate"), 30));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("concombre"), 10));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("oignon"), 5));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("menthe"), 3));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("citron"), 15));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("persil"), 4));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("poivre"), 1));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("sel"), 2));
        ingredientQuantiteListTaboulet.add(new IngredientQuantiteModel(mapIngredient.get("semoule"), 30));
        platMap.put("taboulet", new PlatModel("Taboulet", "../resources/appregime/images/imagesPlat/taboule.jpg", ingredientQuantiteListTaboulet));

        //Declaration du plat saladeCesar
        ArrayList<IngredientQuantiteModel> ingredientQuantiteListSaladeCesar = new ArrayList<IngredientQuantiteModel>();
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("laitue"), 20));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("poulet"), 20));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("pain"), 20));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("parmesan"), 10));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("tomate"), 12));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("moutarde"), 2));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("huileOlive"), 2));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("citron"), 4));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("mayonnaise"), 2));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("sel"), 4));
        ingredientQuantiteListSaladeCesar.add(new IngredientQuantiteModel(mapIngredient.get("poivre"), 4));
        platMap.put("saladeCesar", new PlatModel("Salade Cesar", "../resources/appregime/images/imagesPlat/SaladeCesar.jpg", ingredientQuantiteListSaladeCesar));

        //Declaration du plat hamburgerFrites
        ArrayList<IngredientQuantiteModel> ingredientQuantiteListHamburgerFrites = new ArrayList<IngredientQuantiteModel>();
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("viandeHachee"), 20));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("oeuf"), 10));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("oignon"), 5));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("pain"), 11));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("poivre"), 2));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("sel"), 2));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("parmesan"), 5));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("laitue"), 5));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("pommeDeTerre"), 30));
        ingredientQuantiteListHamburgerFrites.add(new IngredientQuantiteModel(mapIngredient.get("huileOlive"), 10));
        platMap.put("hamburgerFrites", new PlatModel("Hamburger frites", "../resources/appregime/images/imagesPlat/hamburgerFrites.jpg", ingredientQuantiteListHamburgerFrites));


        //Declaration du plat saladeDeFruits
        ArrayList<IngredientQuantiteModel> ingredientQuantiteListSaladeDeFruits = new ArrayList<IngredientQuantiteModel>();
        ingredientQuantiteListSaladeDeFruits.add(new IngredientQuantiteModel(mapIngredient.get("fraise"), 30));
        ingredientQuantiteListSaladeDeFruits.add(new IngredientQuantiteModel(mapIngredient.get("framboise"), 30));
        ingredientQuantiteListSaladeDeFruits.add(new IngredientQuantiteModel(mapIngredient.get("myrtille"), 30));
        ingredientQuantiteListSaladeDeFruits.add(new IngredientQuantiteModel(mapIngredient.get("citron"), 10));
        platMap.put("saladeDeFruits", new PlatModel("Salade de fruits", "../resources/appregime/images/imagesPlat/saldeDeFruits.jpg", ingredientQuantiteListSaladeDeFruits));

        //Declaration du plat mousseAuChocolat
        ArrayList<IngredientQuantiteModel> ingredientQuantiteListMouseAuChocolat = new ArrayList<IngredientQuantiteModel>();
        ingredientQuantiteListMouseAuChocolat.add(new IngredientQuantiteModel(mapIngredient.get("oeuf"), 65));
        ingredientQuantiteListMouseAuChocolat.add(new IngredientQuantiteModel(mapIngredient.get("chocolat"), 35));
        platMap.put("mousseAuChocolat", new PlatModel("Mousse au chocolat", "../resources/appregime/images/imagesPlat/mousseChocolat.jpg", ingredientQuantiteListMouseAuChocolat));
    }

    public ObservableMap<String, PlatModel> getPlatMap() {
        return platMap;
    }

    public void add(String nomPlat, PlatModel plat) {
        platMap.put(nomPlat, plat);
    }
}