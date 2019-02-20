package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreerRegimeController extends Controller {
    @FXML
    private Button ajouterRepas; // le nom du bouton correspond au fx:id (et pas juste id) dans le fichier fxml chargé par FXMLLoader dans setFxml()

    public CreerRegimeController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/creer_regime.fxml");
        ajouterRepas.setOnAction(event -> afficheAjouterRepas()); // indique au bouton la fonction qu'il doit appeler lorsqu'on appuie dessus
    }

    /**
     * affiche la fenêtre "Ajouter repas"
     */
    private void afficheAjouterRepas() {
        AjouterRepasController ajouterRepasController = new AjouterRepasController(primaryStage);
        ajouterRepasController.showInMyStage("Ajouter un repas");
    }
}
