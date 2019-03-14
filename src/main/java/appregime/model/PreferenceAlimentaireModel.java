package appregime.model;

public class PreferenceAlimentaireModel {
    private String libelle;
    private String description;

    //CONSTRUCTORS
    public PreferenceAlimentaireModel() {}
    public PreferenceAlimentaireModel(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    //GETTERS
    public String getLibelle() {
        return libelle;
    }
    public String getDescription() {
        return description;
    }
}
