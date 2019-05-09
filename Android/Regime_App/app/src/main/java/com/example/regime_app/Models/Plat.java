package com.example.regime_app.Models;

public class Plat {
    private String nom;
    private int glucides;
    private int proteines;
    private int lipides;
    private int calories;

    public Plat (String nom, int glucides, int proteines, int lipides, int calories) {
        this.nom = nom;
        this.calories = calories;
        this.glucides = glucides;
        this.proteines = proteines;
        this.lipides = lipides;
    }

    public int getCalories() {
        return calories;
    }

    public int getLipides() {
        return lipides;
    }

    public int getGlucides() {
        return glucides;
    }

    public int getProteines() {
        return proteines;
    }

    public String getNom() {
        return nom;
    }
}
