package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProfilController extends Controller {

    @FXML
    private Button ButtonAjouterObjectif;

    @FXML
    private Button objectifAlimentaire;

    private UserModel user;

    public ProfilController(UserModel user){
        super("/appregime/view/mon_profil.fxml");
        this.user = user;
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