package com.example.regime_app.Models;

import java.util.ArrayList;
import java.util.List;

public class Mocks {
    public static List<Regime> regimes = new ArrayList<>();
    public static List<Regime> regimeActuel = new ArrayList<>();
    public static List<Ingredient> ingredients = new ArrayList<>();
    public static void init() {
        regimes.add(new Regime("Régime 1", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime1" , new Avis("SABRI" , 1 , "Yooooooooo" , "2019") ));
        regimes.add(new Regime("Régime 2", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime2"));
        regimes.add(new Regime("Régime 3", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime3"));
        regimes.add(new Regime("Régime 4", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime4"));
        regimes.add(new Regime("Régime 5", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime5"));
        regimes.add(new Regime("Régime 6", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime6"));
        regimeActuel.add(regimes.get(0));
    }

    public static void addIngredient(Ingredient ingredient) {
        ingredients.add(0, ingredient);
    }
}
