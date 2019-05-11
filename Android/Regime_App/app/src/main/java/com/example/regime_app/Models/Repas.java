package com.example.regime_app.Models;

public class Repas {
    private Plat entree;
    private Plat plat;
    private Plat dessert;
    private String pathImage;
    private String heure;
    public Repas( Plat entree, Plat plat, Plat dessert, String pathImage, String heure) {
        this.entree = entree;
        this.plat = plat;
        this.dessert = dessert;
        this.heure = heure;
        this.pathImage = pathImage ;

    }

    public Plat getDessert() {
        return dessert;
    }

    public Plat getEntree() {
        return entree;
    }

    public Plat getPlat() {
        return plat;
    }

    public String getPathImage() {
        return pathImage;
    }

    public String getHeure() {
        return heure;
    }
}
