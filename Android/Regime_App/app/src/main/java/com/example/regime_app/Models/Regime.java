package com.example.regime_app.Models;


public class Regime {
    private String nom;
    private String note;
    private String description;
    private String imageName;

    public Regime(String nom, String description, String imagePath) {
        this.nom = nom;
        this.description = description;
        this.imageName = imagePath;
        this.note = "aucune note";
    }

    public String getNom() {
        return nom;
    }

    public String getNote() {
        return note;
    }

    public String getDescription() {
        return description;
    }

    public String getImageName() {
        return imageName;
    }
}
