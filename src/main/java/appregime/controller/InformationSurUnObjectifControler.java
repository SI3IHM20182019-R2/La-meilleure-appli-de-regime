package appregime.controller;

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

    public InformationSurUnObjectifControler(){
        super("/appregime/view/InformationSurUnObjectif.fxml");
        boutonAjouterUnObjectif.setOnAction(event -> retour());
        boutonAjouterAuxObjectifs.setOnAction(event -> ajouterObjectif());
    }

    public void retour(){
        PageAjouterUnObjectifController controller = new PageAjouterUnObjectifController();
        controller.showWithMenu();
    }

    //A modifier pour ajouter l'objectif et retour au profil
    private void ajouterObjectif() {
        ProfilController controller = new ProfilController();
        controller.showWithMenu();
    }

}