package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerRegimeController extends Controller {
    @FXML
    private Button ajouterRepas; // le nom du bouton correspond au fx:id (et pas juste id) dans le fichier fxml chargé par FXMLLoader dans setFxml()
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    public CreerRegimeController() {
        super("/appregime/view/creer_regime.fxml");
        ajouterRepas.setOnAction(event -> afficheAjouterRepas()); // indique au bouton la fonction qu'il doit appeler lorsqu'on appuie dessus
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    /**
     * affiche la fenêtre "Ajouter repas"
     */
    private void afficheAjouterRepas() {
        AjouterRepasController ajouterRepasController = new AjouterRepasController();
        ajouterRepasController.showInMyStage("Ajouter un repas");
    }

    private void retour() {
        MesRegimesController mesRegimesController = new MesRegimesController();
        mesRegimesController.showWithMenu();
    }
}
