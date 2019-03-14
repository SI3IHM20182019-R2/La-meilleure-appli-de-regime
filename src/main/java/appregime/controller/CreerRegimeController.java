package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerRegimeController extends Controller {
    @FXML
    private Button ajouterRepas; // le nom du bouton correspond au fx:id (et pas juste id) dans le fichier fxml chargé par FXMLLoader dans setFxml()
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    private UserModel user;

    public CreerRegimeController(UserModel user) {
        super("/appregime/view/creer_regime.fxml");
        this.user=user;
        ajouterRepas.setOnAction(event -> afficheAjouterRepas()); // indique au bouton la fonction qu'il doit appeler lorsqu'on appuie dessus
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> demandePartage());
    }

    /**
     * affiche la fenêtre "Ajouter repas"
     */
    private void afficheAjouterRepas() {
        AjouterRepasController ajouterRepasController = new AjouterRepasController(this.user);
        ajouterRepasController.showInMyStage("Ajouter un repas");
    }

    public void demandePartage() {
        PopupPartageRegmieController popupPartageRegmieController = new PopupPartageRegmieController(this.user);
        popupPartageRegmieController.showInMyStage("Demande partage");

    }
    private void retour() {
        MesRegimesController mesRegimesController = new MesRegimesController(this.user);
        mesRegimesController.showWithMenu(this.user);
    }
}
