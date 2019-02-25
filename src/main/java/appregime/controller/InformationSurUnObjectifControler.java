package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

public class InformationSurUnObjectifControler extends Controller {

    @FXML
    private Button boutonAjouterUnObjectif;

    @FXML
    private Button boutonNote;

    @FXML
    private Button boutonDate;

    @FXML
    private Button boutonAjouterAuxObjectifs;

    public InformationSurUnObjectifControler(Stage primaryStage){
        super(primaryStage, "/appregime/view/InformationSurUnObjectif.fxml");
        boutonAjouterUnObjectif.setOnAction(event -> retour());
        boutonAjouterAuxObjectifs.setOnAction(event -> ajouterObjectif());
    }

    public void retour(){
        PageAjouterUnObjectifController controller = new PageAjouterUnObjectifController(primaryStage);
        controller.showWithMenu();
    }

    //A modifier pour ajouter l'objectif et retour au profil
    private void ajouterObjectif() {
        ProfilController controller = new ProfilController(primaryStage);
        controller.showWithMenu();
    }

}