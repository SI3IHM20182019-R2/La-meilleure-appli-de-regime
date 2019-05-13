package com.example.regime_app.Models;

import java.util.ArrayList;
import java.util.List;

public class Mocks {
    public static List<Regime> regimes = new ArrayList<>();
    public static List<Regime> regimeActuel = new ArrayList<>();
    public static List<Ingredient> ingredients = new ArrayList<>();
    public static void init() {
        regimes.add(new Regime("Régime IG", "Le Nouveau Régime IG, accompagné d’une activité physique régulière vise à limiter les pics d’insuline dans le sang afin de pouvoir brûler les graisses, perdre du poids et le stabiliser.", "regime1" , new Avis("SABRI" , 1 , "Yooooooooo" , "2019") ));
        regimes.add(new Regime("régime Low-carb", "Le régime Low-Carb fait fureur outre-Atlantique. En France, il rencontre un succès grandissant.", "regime2"));
        regimes.add(new Regime("Régime Soft", "Le nouveau régime IG a été écrit par une diététicienne d’origine française ainsi qu’un ingénieur, spécialiste de l’alimentation.", "regime3"));
        regimes.add(new Regime("Le Fasting", "Ce type de régime consiste à s’alimenter de manière saine et équilibrée mais en limitant le nombre de calories ingérées par jours et par repas.", "regime4"));
        regimes.add(new Regime("Le chrono régime", "C’est un régime qui consiste à s’alimenter à des heures précises en prenant seulement trois repas équilibrés par jour et s’en tenir uniquement à cela", "regime5"));
        regimes.add(new Regime("La micronutrition", "S’alimenter de micro nutriments signifie : s’alimenter en se contentant du strict minimum ", "regime6"));
        regimeActuel.clear();
        regimeActuel.add(new Regime("La micronutrition", "S’alimenter de micro nutriments signifie : s’alimenter en se contentant du strict minimum ; ", "regime6"));
    }

    public static void addIngredient(Ingredient ingredient) {
        ingredients.add(0, ingredient);
    }
}
