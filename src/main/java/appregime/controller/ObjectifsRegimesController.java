package appregime.controller;

import appregime.model.UserModel;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.awt.*;
import java.awt.event.MouseEvent;


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

    @FXML
    private HBox hbox;

    @FXML
    private HBox box;

    private UserModel user;

    private String objectifSelectionne;
    private String regimeSelectionne;


    public ObjectifsRegimesController(UserModel user) {
        super("/appregime/view/objectifs_regimes.fxml");
        this.user = user;
        retour.setOnAction(event -> retour());
        prisedemuscle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

               // addOBjectifs("Prise de muscle", prisedemuscle);
                objectifSelectionne = "Prise de muscle";
                hbox.getChildren().remove(prisedemuscle);
            }
        });
        sain.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                objectifSelectionne = "Manger plus sain";
                hbox.getChildren().remove(sain);
            }
        });

        stress.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                objectifSelectionne = "Reduire le stress";
                hbox.getChildren().remove(stress);

            }
        });
      //  silhouette.setOnAction(event -> addOBjectifs("Affiner la silhouette"));
        //graisse.setOnAction(event -> addOBjectifs("Bruler les graisses"));


        natman.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                regimeSelectionne = "Natman";
                box.getChildren().remove(natman);

            }
        });
      //  ventreplat.setOnAction(event -> addRegimes("Ventre plat"));
        //dietetique.setOnAction( event -> addRegimes("dietetique"));*/
//        dash.setOnAction(event -> addRegimes("dash"));*/
        //this.addRegimes(objectifSelectionne);

        continuer.setOnAction(event -> bienAjoutePoppup());
        //continuer.setOnAction(event -> continuer(this.user));
    }

   /* private void continuer(UserModel user) {
        System.out.println(this.user);
        UtilisateurAcceuilController utilisateurAcceuilController = new UtilisateurAcceuilController();
        utilisateurAcceuilController.setCurrentUser(user);
        AccueilController accueilController = new AccueilController(this.user);
        accueilController.showWithMenu(this.user);
        /*
        MesRegimesController mesRegimesController = new MesRegimesController(primaryStage);
        mesRegimesController.showWithMenu();
    }*/

    private void retour() {
        InscriptionController inscriptionController = new InscriptionController(this.user);
        inscriptionController.showInPrimaryStage();
    }

    private void bienAjoutePoppup() {
        this.addRegimes(regimeSelectionne);
        this.addOBjectifs(objectifSelectionne);
        BienAjouteController bienAjouteController = new BienAjouteController(objectifSelectionne, regimeSelectionne, this.user);
        bienAjouteController.set(objectifSelectionne, regimeSelectionne);
        bienAjouteController.showInMyStage("Confirmation de choix");
    }

    private void addOBjectifs (String objectif) {
        this.user.setObjectifvise(objectif);


    }

    private void addRegimes (String regimes) {
        this.user.setRegimes(regimes);
    }

}
