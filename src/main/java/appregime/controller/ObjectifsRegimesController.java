package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class ObjectifsRegimesController extends Controller{

    @FXML
    private Button retour;

    @FXML
    private Button continuer;

    public ObjectifsRegimesController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/objectifs_regimes.fxml");

        retour.setOnAction(event -> retour());
        continuer.setOnAction(event -> continuer());
    }

    private void continuer() {
        AccueilController accueilController = new AccueilController(primaryStage);
        accueilController.showWithMenu();
        /*
        MesRegimesController mesRegimesController = new MesRegimesController(primaryStage);
        mesRegimesController.showWithMenu();*/
    }

    private void retour() {
        InscriptionController inscriptionController = new InscriptionController(primaryStage);
        inscriptionController.showInPrimaryStage();
    }

}
