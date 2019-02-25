package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

public class InformationSurMonObjectifController extends Controller {

    @FXML
    private Button boutonMonProfil;

    @FXML
    private Button boutonNote;

    @FXML
    private Button boutonDate;

    @FXML
    private Button boutonSupprimer;


    public InformationSurMonObjectifController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/InformationSurMonObjectif.fxml");
        boutonMonProfil.setOnAction(event -> retourProfil());
        boutonSupprimer.setOnAction(event -> supprimerObjectif());
    }

    //A modifier pour ajouter la suppression
    private void supprimerObjectif() {
        ProfilController controller = new ProfilController(primaryStage);
        controller.showWithMenu();
    }

    private void retourProfil(){
        ProfilController controller = new ProfilController(primaryStage);
        controller.showWithMenu();
    }
}