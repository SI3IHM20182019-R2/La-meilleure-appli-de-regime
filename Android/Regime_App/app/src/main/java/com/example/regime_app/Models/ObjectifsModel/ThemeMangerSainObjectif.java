package com.example.regime_app.Models.ObjectifsModel;

public enum ThemeMangerSainObjectif {
    PlusDeFibre ("Plus de fibre"),
    PlusDeFruitLegume ("Plus de fruit legume"),
    General ("Général");

    private String text;

    ThemeMangerSainObjectif(String text){
        this.text = text;
    }

    public String toString(){
        return this.text;
    }
}
