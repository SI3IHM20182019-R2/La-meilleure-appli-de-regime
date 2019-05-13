package com.example.regime_app.Models.ObjectifsModel;

import com.example.regime_app.R;

public enum IntensiteObjectif {
    Faible ("Faible"),
    Modéré ("Modéré"),
    Maximal ("Maximal");

    private String text;

    IntensiteObjectif(String text){
        this.text = text;
    }

    public String toString(){
        return this.text;
    }
}
