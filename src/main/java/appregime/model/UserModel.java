package appregime.model;

public class UserModel {
    private String id;
    private String mail;
    private String pseudo;
    private String password;
    private String sexe;
    private Integer age;
    private Double taille;
    private Double poids;
    private Double poidsSouhaite;
    private Integer objectif;
    private String preferences;
    private String allergies;


    //CONSTRUCTORS
   // public UserModel() {}
    /*
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
    }*/

    public UserModel() {
        this.id = null;
        this.mail = null;
        this.pseudo = null;
        this.password = null;
        this.sexe = null;
        this.age = null;
        this.taille = null;
        this.poids = null;
        this.objectif = null;
        this.allergies = null;
        this.preferences = null;
    }

    //GETTERS
    public String getId() { return id; }

    public String getPseudo() { return pseudo; }

    public Double getTaille() { return taille; }

    public Integer getAge() { return age; }

    public String getMail() { return mail; }

    public Integer getObjectif() { return objectif; }

    public Double getPoids() { return poids; }

    public String getPassword() { return password; }

    public String getPreferences() { return preferences; }

    public String getSexe() { return sexe; }

    public String getAllergies() { return allergies; }

    public Double getPoidsSouhaite() { return poidsSouhaite; }

    //SETTERS

    public void setAge(Integer age) { this.age = age; }

    public void setId(String id) { this.id = id; }

    public void setMail(String mail) { this.mail = mail; }

    public void setObjectif(Integer objectif) { this.objectif = objectif; }

    public void setAllergies(String allergies) { this.allergies = allergies; }

    public void setPassword(String password) { this.password = password; }

    public void setPoids(Double poids) { this.poids = poids; }

    public void setPreferences(String preferences) { this.preferences = preferences; }

    public void setPseudo(String pseudo) { this.pseudo = pseudo; }

    public void setSexe(String sexe) { this.sexe = sexe; }

    public void setTaille(Double taille) { this.taille = taille; }

    public void setPoidsSouhaite(Double poidsSouhaite) { this.poidsSouhaite = poidsSouhaite; }

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
                ", preferences=" + preferences +
                ", allergies=" + allergies +
                '}';
    }
}
