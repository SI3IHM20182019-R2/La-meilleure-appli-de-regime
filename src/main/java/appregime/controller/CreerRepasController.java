package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerRepasController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button terminer;
    @FXML
    private Button ajouterPlat;

    private UserModel user;

    public CreerRepasController(UserModel user) {
        super("/appregime/view/creer_repas.fxml");
        this.user = user;
        ajouterPlat.setOnAction(event -> afficheAjouterPlat());
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    private void afficheAjouterPlat() {
        AjouterPlatController ajouterPlatController = new AjouterPlatController(this.user);
        ajouterPlatController.showInMyStage("Ajouter un plat");
    }

    /**
     * retour à l'écran "Créer un régime"
     */
    private void retour() {
        CreerRegimeController creerRegimeController = new CreerRegimeController(this.user);
        creerRegimeController.showWithMenu(this.user);
    }
}
