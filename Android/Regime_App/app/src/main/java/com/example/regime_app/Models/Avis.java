package com.example.regime_app.Models;


import android.os.Parcel;
import android.os.Parcelable;

public class Avis implements Parcelable  {
    private String nom;
    private int note;
    private String commentaire;
    private String date;

    public Avis(String nom, int note, String commentaire, String date) {
        this.nom = nom;
        this.note = note;
        this.commentaire = commentaire;
        this.date = date;
    }

    protected Avis(Parcel in) {
        nom = in.readString();
        note = in.readInt();
        commentaire = in.readString();
        date = in.readString();
    }

    public static final Creator<Avis> CREATOR = new Creator<Avis>() {
        @Override
        public Avis createFromParcel(Parcel in) {
            return new Avis(in);
        }

        @Override
        public Avis[] newArray(int size) {
            return new Avis[size];
        }
    };

    public String getNom() {
        return nom;
    }

    public int getNote() {
        return note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nom);
        dest.writeInt(note);
        dest.writeString(commentaire);
        dest.writeString(date);
    }
}
