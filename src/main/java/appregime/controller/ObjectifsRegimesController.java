package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ObjectifsRegimesController extends Controller{

    @FXML
    private Button retour;

    @FXML
    private Button continuer;

    @FXML
    private Button prisedemuscle;

    @FXML
    private Button silhouette;

    @FXML
    private Button sain;

    @FXML
    private Button graisse;

    @FXML
    private Button stress;

    @FXML
    private Button natman;

    @FXML
    private Button ventreplat;

    @FXML
    private Button dietetique;

    @FXML
    private Button dash;

    private UserModel user;

    public ObjectifsRegimesController(UserModel user) {
        super("/appregime/view/objectifs_regimes.fxml");
        this.user = user;
        retour.setOnAction(event -> retour());
        prisedemuscle.setOnAction(event -> addOBjectifs("Prise de muscle"));
        sain.setOnAction(event -> addOBjectifs("Manger plus sain"));
        stress.setOnAction(event -> addOBjectifs("Reduire le stress"));
        silhouette.setOnAction(event -> addOBjectifs("Affiner la silhouette"));
        graisse.setOnAction(event -> addOBjectifs("Bruler les graisses"));
        natman.setOnAction(event -> addRegimes("Natman"));
        ventreplat.setOnAction(event -> addRegimes("Ventre plat"));
        dietetique.setOnAction( event -> addRegimes("dietetique"));
//        dash.setOnAction(event -> addRegimes("dash"));

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

    private void addOBjectifs (String objectif) {
        this.user.setObjectifvise(objectif);
    }

    private void addRegimes (String regimes) {
        this.user.setRegimes(regimes);
    }

}
