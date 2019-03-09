package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InformationSurMonObjectifController extends Controller {

    @FXML
    private Button boutonMonProfil;

    @FXML
    private Button boutonNote;

    @FXML
    private Button boutonDate;

    @FXML
    private Button boutonSupprimer;

    private UserModel user;


    public InformationSurMonObjectifController(UserModel user) {
        super("/appregime/view/InformationSurMonObjectif.fxml");
        this.user = user;
        boutonMonProfil.setOnAction(event -> retourProfil());
        boutonSupprimer.setOnAction(event -> supprimerObjectif());
    }

    //A modifier pour ajouter la suppression
    private void supprimerObjectif() {
        ProfilController controller = new ProfilController(this.user);
        controller.showWithMenu(this.user);
    }

    private void retourProfil(){
        ProfilController controller = new ProfilController(this.user);
        controller.showWithMenu(this.user);
    }
}