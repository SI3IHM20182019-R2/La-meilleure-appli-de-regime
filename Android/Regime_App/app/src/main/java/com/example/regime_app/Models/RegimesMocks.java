package com.example.regime_app.Models;

import java.util.ArrayList;
import java.util.List;

public class RegimesMocks {
    public static List<Regime> regimes = new ArrayList<>();
    public static List<Regime> regimes2 = new ArrayList<>();
    public static void init() {
        regimes.add(new Regime("Régime 1", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime1" , new Avis("SABRI" , 1 , "Yooooooooo" , "2019") ));
        regimes.add(new Regime("Régime 2", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime2"));
        regimes.add(new Regime("Régime 3", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime3"));
        regimes.add(new Regime("Régime 4", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime4"));
        regimes.add(new Regime("Régime 5", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime5"));
        regimes.add(new Regime("Régime 6", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime6"));
        regimes2.add(regimes.get(0));
    }
}
