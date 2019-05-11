package com.example.regime_app.Models;

public class Utilisateur {
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

    private Utilisateur() {}

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

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
