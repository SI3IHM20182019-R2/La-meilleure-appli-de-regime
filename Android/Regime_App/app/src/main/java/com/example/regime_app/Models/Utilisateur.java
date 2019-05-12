package com.example.regime_app.Models;

import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class Utilisateur extends AppCompatActivity {
    private String nom = null;
    private String prenom = null;
    private String mail = null;
    private String pwd = null;
    private String sexe = null;
    private Integer age = null;
    private Integer taille = null;
    private Float poids = null;
    private Float obectif = null;
    private String deadline = null;
    private Map<String, Boolean> preference;
    private Map<String, Boolean> allergies;

    private Utilisateur() {
        resetPreferences();
        System.out.println("------------------------------------------------------------------------------------------" + preference.size());
        resetAllergies();
        System.out.println("------------------------------------------------------------------------------------------" + allergies.size());
    }

    private static Utilisateur INSTANCE = new Utilisateur();

    public static Utilisateur getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.nom = null;
        this.prenom = null;
        this.mail = null;
        this.pwd = null;
        this.sexe = null;
        this.age = null;
        this.taille = null;
        this.poids = null;
        this.deadline = null;
        resetPreferences();
        resetAllergies();
    }

    private void resetPreferences() {
        preference = new HashMap<>();
        String[] prefSoft = {"ovo-lacto-végétarien", "ovo-végétarien", "lacto-végétarien", "pesco-végétariens", "vegetalien"};
        for (String str : prefSoft) {
            preference.put(str, false);
        }
    }

    private void resetAllergies() {
        allergies = new HashMap<>();
        String[] allergieSoft = {"gluten", "glucose", "oeuf", "arachide", "moutarde", "poisson", "soja"};
        for (String str : allergieSoft) {
            allergies.put(str, false);
        }
    }

    //SETTER

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public void setObectif(float obectif) {
        this.obectif = obectif;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void activePref(String pref) {
        this.preference.put(pref, true);
    }

    public void desactivePref(String pref) {
        this.preference.put(pref, false);
    }

    public void activeAllegie(String allergie) {
        this.allergies.put(allergie, true);
    }

    public void desactiveAllergie(String allergie) {
        this.allergies.put(allergie, false);
    }

    //GETTER

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getPwd() {
        return pwd;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }

    public float getPoids() {
        return poids;
    }

    public float getObectif() {
        return obectif;
    }

    public String getDeadline() {
        return deadline;
    }

    public Map<String, Boolean> getPreference() {
        return preference;
    }

    public Map<String, Boolean> getAllergies() {
        return allergies;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
