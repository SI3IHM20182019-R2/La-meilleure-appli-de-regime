package appregime.model;

public class PreferenceAlimentaire extends Model {
    private String libelle;
    private String description;

    //CONSTRUCTORS
    public PreferenceAlimentaire() {}
    public PreferenceAlimentaire(String libelle, String description) {
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
