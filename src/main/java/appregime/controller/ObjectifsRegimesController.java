package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ObjectifsRegimesController extends Controller{

    @FXML
    private Button retour;

    @FXML
    private Button continuer;

    private UserModel user;

    public ObjectifsRegimesController(UserModel user) {
        super("/appregime/view/objectifs_regimes.fxml");
        this.user = user;
        retour.setOnAction(event -> retour());
        continuer.setOnAction(event -> continuer(this.user));
    }

    private void continuer(UserModel user) {
        System.out.println(this.user);
        UtilisateurAcceuilController utilisateurAcceuilController = new UtilisateurAcceuilController();
        utilisateurAcceuilController.setCurrentUser(user);
        AccueilController accueilController = new AccueilController(this.user);
        accueilController.showWithMenu(this.user);
        /*
        MesRegimesController mesRegimesController = new MesRegimesController(primaryStage);
        mesRegimesController.showWithMenu();*/
    }

    private void retour() {
        InscriptionController inscriptionController = new InscriptionController(this.user);
        inscriptionController.showInPrimaryStage();
    }

}
