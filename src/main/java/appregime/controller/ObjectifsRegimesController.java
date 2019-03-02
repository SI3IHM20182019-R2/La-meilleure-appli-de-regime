package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ObjectifsRegimesController extends Controller{

    @FXML
    private Button retour;

    @FXML
    private Button continuer;

    public ObjectifsRegimesController() {
        super("/appregime/view/objectifs_regimes.fxml");

        retour.setOnAction(event -> retour());
        continuer.setOnAction(event -> continuer());
    }

    private void continuer() {
        AccueilController accueilController = new AccueilController();
        accueilController.showWithMenu();
        /*
        MesRegimesController mesRegimesController = new MesRegimesController(primaryStage);
        mesRegimesController.showWithMenu();*/
    }

    private void retour() {
        InscriptionController inscriptionController = new InscriptionController();
        inscriptionController.showInPrimaryStage();
    }

}
