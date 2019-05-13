package com.example.regime_app.Models.ObjectifsModel;

public enum ZoneCorpsGraisseObjectif {
    Cuisses ("Cuisses"),
    Fesses ("Fesses"),
    Ventre ("Ventre");

    private String text;

    ZoneCorpsGraisseObjectif(String text){
        this.text = text;
    }

    public String toString(){
        return this.text;
    }
}
