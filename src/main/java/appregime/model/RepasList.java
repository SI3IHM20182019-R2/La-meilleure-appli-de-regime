package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.HashMap;

public class RepasList {

    private ObservableMap<String, RepasModel> RepasMap;

    public RepasList() {
        RepasMap = FXCollections.observableMap(new HashMap<String, RepasModel>() {
        });
        PlatList platList = new PlatList();
        ObservableMap<String, ModelPlat> mapPlat = platList.getPlatMap();
        ModelPlat[] listPlat1 = {mapPlat.get("taboulet"), mapPlat.get("saladeCesar"), mapPlat.get("hamburgerFrites")};
        ModelPlat[] listPlat2 = {mapPlat.get("saladeDeFruits"), mapPlat.get("saladeCesar")};
        ModelPlat[] listPlat3 = {mapPlat.get("soupeTomate"), mapPlat.get("hamburgerFrites"), mapPlat.get("mousseAuChocolat")};
        ModelPlat[] listPlat4 = {mapPlat.get("taboulet"), mapPlat.get("saladeCesar"), mapPlat.get("mousseAuChocolat")};
        RepasMap.put("Repas1"  , new RepasModel("Repas1", "c'est le premier ", "../resources/appregime/images/imageRepas/Repas1.jpg",listPlat1 ));
        RepasMap.put("Repas2"  , new RepasModel("Repas2", "c'est le deuxième ", "../resources/appregime/images/imageRepas/Repas2.jpg",listPlat2));
        RepasMap.put("Repas3"  , new RepasModel("Repas3", "c'est le troisème ", "../resources/appregime/images/imageRepas/Repas3.jpg",listPlat3 ));
        RepasMap.put("Repas4"  , new RepasModel("Repas4", "c'est le quatrième ","../resources/appregime/images/imageRepas/Repas4.jpg" ,listPlat4));
    }
}