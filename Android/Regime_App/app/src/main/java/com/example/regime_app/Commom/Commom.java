package com.example.regime_app.Commom;

import com.example.regime_app.Interface.ObjectifInterface;
import com.example.regime_app.Models.ObjectifsModel.Objectif;
import com.example.regime_app.Models.ObjectifsModel.TypeObjectif;

import java.util.Date;

public class Commom {
    public static ObjectifInterface objectifSelected = new Objectif(TypeObjectif.AmeliorationSilhouette, new Date(), false);
}
