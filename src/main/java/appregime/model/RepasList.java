package appregime.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepasList {


    private ObservableMap<String, RepasModel> RepasMap;

    public RepasList() {
        RepasMap = FXCollections.observableMap(new HashMap<String, RepasModel>() {
        });
        ListPlats platList = new ListPlats();
        ObservableMap<String, PlatModel> mapPlat = platList.getPlatMap();


        List<PlatModel> listPlat1 = new ArrayList<PlatModel>()
        {{ add(mapPlat.get("taboulet")); add(mapPlat.get("saladeCesar")); add(mapPlat.get("hamburgerFrites"));}};
        List<PlatModel> listPlat2 = new ArrayList<PlatModel>() { {add(mapPlat.get("saladeDeFruits"));add(mapPlat.get("saladeCesar")); add(mapPlat.get("mousseAuChocolat"));}};
        List<PlatModel> listPlat3 = new ArrayList<PlatModel>() { {add(mapPlat.get("soupeTomate")); add(mapPlat.get("hamburgerFrites")); add(mapPlat.get("mousseAuChocolat"));}};
        List<PlatModel> listPlat4 = new ArrayList<PlatModel>() { {add(mapPlat.get("taboulet")); add(mapPlat.get("saladeCesar")); add(mapPlat.get("mousseAuChocolat"));}};
        RepasMap.put("Repas1"  , new RepasModel("Repas1", "c'est le premier ", "appregime/images/imageRepas/Plat1.jpg",listPlat1 ));
        RepasMap.put("Repas2"  , new RepasModel("Repas2", "c'est le deuxième ", "appregime/images/imageRepas/Plat2.jpg",listPlat2));
        RepasMap.put("Repas3"  , new RepasModel("Repas3", "c'est le troisème ", "appregime/images/imageRepas/Plat3.jpg",listPlat3 ));
        RepasMap.put("Repas4"  , new RepasModel("Repas4", "c'est le quatrième ","appregime/images/imageRepas/Plat4.jpg" ,listPlat4));
    }

    public ObservableMap<String, RepasModel> getPlatMap() {
        return RepasMap;
    }


    public ObservableList<RepasModel> getRepasList() {
        ObservableList<RepasModel> l = FXCollections.observableList(new ArrayList<>());
        l.addAll(RepasMap.values());
        return l;
    }

}