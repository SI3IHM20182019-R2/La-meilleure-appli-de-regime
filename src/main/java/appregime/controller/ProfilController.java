package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProfilController extends Controller {

    @FXML
    private Button ButtonAjouterObjectif;

    @FXML
    private Button objectifAlimentaire;

    public ProfilController(Stage primaryStage){
        super(primaryStage, "/appregime/view/mon_profil.fxml");
        ButtonAjouterObjectif.setOnAction(event -> ajouterObjectif());
        objectifAlimentaire.setOnAction(event -> voirDetailObjectif());
    }

    private void ajouterObjectif(){
        PageAjouterUnObjectifController controller = new PageAjouterUnObjectifController(primaryStage);
        controller.showWithMenu();
    }

    private void voirDetailObjectif(){
        InformationSurMonObjectifController controller = new InformationSurMonObjectifController(primaryStage);
        controller.showWithMenu();
    }
}