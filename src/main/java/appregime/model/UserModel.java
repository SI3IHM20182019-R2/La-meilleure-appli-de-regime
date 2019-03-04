package appregime.model;

public class UserModel {
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

    //TOSTRING

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", mail='" + mail + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", sexe='" + sexe + '\'' +
                ", age='" + age + '\'' +
                ", taille=" + taille +
                ", poids=" + poids +
                ", objectif=" + objectif +
                '}';
    }
}
