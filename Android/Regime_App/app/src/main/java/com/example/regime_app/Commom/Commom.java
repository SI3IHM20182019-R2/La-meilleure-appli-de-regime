package com.example.regime_app.Commom;

import com.example.regime_app.Interface.ObjectifInterface;
import com.example.regime_app.Models.ObjectifsModel.Objectif;
import com.example.regime_app.Models.ObjectifsModel.ObjectifPerteDePoids;
import com.example.regime_app.Models.ObjectifsModel.TypeObjectif;

import java.util.Date;

public class Commom {
    public static ObjectifInterface objectifSelected = new ObjectifPerteDePoids(new Date(), new Date(), 4);
    public static String ipLocal = "192.168.1.77";
}
