package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.LightBase;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ProfilController extends Controller {

    @FXML
    private Button ButtonAjouterObjectif;

    @FXML
    private Button objectifAlimentaire;

    @FXML
    private Label nom;

    @FXML
    private Label poids;

    @FXML
    private Label age;

    @FXML
    private Label sexe;

    @FXML
    private Label taille;

    @FXML
    private Label mail;

    @FXML
    private Label pseudo;




    private UserModel user;

    public ProfilController(UserModel user){
        super("/appregime/view/mon_profil.fxml");
        this.user = user;

        this.nom.setText(this.user.getPseudo());
        this.age.setText(String.valueOf(this.user.getAge()));
        this.taille.setText(String.valueOf(this.user.getTaille()));
        this.poids.setText(String.valueOf(this.user.getPoids()));
        this.pseudo.setText(this.user.getPseudo());
        this.sexe.setText(this.user.getSexe());
        this.mail.setText(this.user.getMail());
        ButtonAjouterObjectif.setOnAction(event -> ajouterObjectif());
        objectifAlimentaire.setOnAction(event -> voirDetailObjectif());
    }

    private void ajouterObjectif(){
        PageAjouterUnObjectifController controller = new PageAjouterUnObjectifController(this.user);
        controller.showWithMenu(this.user);
    }

    private void voirDetailObjectif(){
        InformationSurMonObjectifController controller = new InformationSurMonObjectifController(this.user);
        controller.showWithMenu(this.user);
    }
}