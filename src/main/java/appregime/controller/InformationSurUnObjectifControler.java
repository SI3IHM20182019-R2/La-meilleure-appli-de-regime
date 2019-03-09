package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InformationSurUnObjectifControler extends Controller {

    @FXML
    private Button boutonAjouterUnObjectif;

    @FXML
    private Button boutonNote;

    @FXML
    private Button boutonDate;

    @FXML
    private Button boutonAjouterAuxObjectifs;

    private UserModel user;

    public InformationSurUnObjectifControler(UserModel user){
        super("/appregime/view/InformationSurUnObjectif.fxml");
        this.user = user;
        boutonAjouterUnObjectif.setOnAction(event -> retour());
        boutonAjouterAuxObjectifs.setOnAction(event -> ajouterObjectif());
    }

    public void retour(){
        PageAjouterUnObjectifController controller = new PageAjouterUnObjectifController(this.user);
        controller.showWithMenu(this.user);
    }

    //A modifier pour ajouter l'objectif et retour au profil
    private void ajouterObjectif() {
        ProfilController controller = new ProfilController(this.user);
        controller.showWithMenu(this.user);
    }

}