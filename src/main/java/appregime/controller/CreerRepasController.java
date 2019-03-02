package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerRepasController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button terminer;
    @FXML
    private Button ajouterPlat;

    public CreerRepasController() {
        super("/appregime/view/creer_repas.fxml");
        ajouterPlat.setOnAction(event -> afficheAjouterPlat());
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    private void afficheAjouterPlat() {
        AjouterPlatController ajouterPlatController = new AjouterPlatController();
        ajouterPlatController.showInMyStage("Ajouter un plat");
    }

    /**
     * retour à l'écran "Créer un régime"
     */
    private void retour() {
        CreerRegimeController creerRegimeController = new CreerRegimeController();
        creerRegimeController.showWithMenu();
    }
}
