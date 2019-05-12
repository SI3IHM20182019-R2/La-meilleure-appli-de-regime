package com.example.regime_app.Models;

import android.graphics.Bitmap;

public class Ingredient {
    private String nom;
    private Bitmap image;
    private float glucides;
    private float lipides;
    private float proteines;
    private float calories;

    public Ingredient(String nom, Bitmap image, float glucides, float lipides, float proteines, float calories) {
        this.nom = nom;
        this.image = image;
        this.glucides = glucides;
        this.lipides = lipides;
        this.proteines = proteines;
        this.calories = calories;
    }

    public String getNom() {
        return nom;
    }

    public Bitmap getImage() {
        return image;
    }

    public float getGlucides() {
        return glucides;
    }

    public float getLipides() {
        return lipides;
    }

    public float getProteines() {
        return proteines;
    }

    public float getCalories() {
        return calories;
    }
}
