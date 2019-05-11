package com.example.regime_app.Models;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Regime implements Parcelable {
    private String nom;
    private String note;
    private String description;
    private String imageName;
    private ArrayList<Repas> listrepas = new ArrayList<Repas>() {{
        add(new Repas(new Plat("jus", 1 ,1 ,1 , 1) ,new Plat("café", 1 ,1 ,1 , 1) , new Plat("croissant", 1 ,1 ,1 ,1) , "repas1" , " 8h30"));
        add(new Repas(new Plat("Salade", 1 ,1 ,1 , 1) ,new Plat("Salade", 1 ,1 ,1 , 1) , new Plat("Salade", 1 ,1 ,1 ,1) , "repas2" , " 12h30"));
        add(new Repas(new Plat("cake", 1 ,1 ,1 , 1) ,new Plat("bannane", 1 ,1 ,1 , 1) , new Plat("salade friut", 1 ,1 ,1 ,1) , "repas3" , " 20h30"));
    }};
    private ArrayList<Avis> listavis = new ArrayList<>();

    public Regime(String nom, String description, String imagePath) {
        this.nom = nom;
        this.description = description;
        this.imageName = imagePath;
        this.note = "aucune note";
    }
    public Regime(String nom, String description, String imagePath , Avis avis) {
        this.nom = nom;
        this.listavis.add(avis);
        this.description = description;
        this.imageName = imagePath;
        this.note = "aucune note";
    }

    protected Regime(Parcel in) {
        nom = in.readString();
        note = in.readString();
        description = in.readString();
        imageName = in.readString();
        in.readList(listavis, Avis.class.getClassLoader());
    }

    public static final Creator<Regime> CREATOR = new Creator<Regime>() {
        @Override
        public Regime createFromParcel(Parcel in) {
            return new Regime(in);
        }

        @Override
        public Regime[] newArray(int size) {
            return new Regime[size];
        }
    };

    public String getNom() {
        return nom;
    }

    public List<Avis> getListavis() {
        return listavis;
    }

    public String getNote() {
        return note;
    }

    public ArrayList<Repas> getListrepas() {
        return listrepas;
    }

    public String getDescription() {
        return description;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nom);
        dest.writeString(note);
        dest.writeString(description);
        dest.writeString(imageName);
        dest.writeList(listavis);
    }
}
