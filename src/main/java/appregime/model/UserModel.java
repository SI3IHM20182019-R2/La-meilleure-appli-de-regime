package appregime.model;

public class UserModel extends Model {
    private String id;
    private String mail;
    private String pseudo;
    private String password;
    private String sexe;
    private String age;
    private Double taille;
    private Integer poids;
    private Integer objectif;

    //CONSTRUCTORS
    public UserModel() {}
    public UserModel(String id, String mail, String pseudo, String password, String sexe, String age, Double taille, Integer poids, Integer objectif) {
        this.id = id;
        this.mail = mail;
        this.pseudo = pseudo;
        this.password = password;
        this.sexe = sexe;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.objectif = objectif;
    }

    //GETTERS
    public String getId() {
        return id;
    }
    public String getPseudo() {
        return pseudo;
    }
}
