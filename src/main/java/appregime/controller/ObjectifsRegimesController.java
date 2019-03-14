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
        silhouette.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                objectifSelectionne = "Affiner la silhouette";
                hbox.getChildren().remove(silhouette);

            }
        });
        graisse.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                objectifSelectionne = "Bruler les graisses";
                hbox.getChildren().remove(graisse);

            }
        });

        natman.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                regimeSelectionne = "Natman";
                box.getChildren().remove(natman);

            }
        });
       ventreplat.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               regimeSelectionne = "ventre plat";
               box.getChildren().remove(ventreplat);

           }
       });
        dietetique.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                regimeSelectionne = "dietetique";
                box.getChildren().remove(dietetique);

            }
        });
       // dash.setOnAction(event -> addRegimes("dash"));
        //this.addRegimes(objectifSelectionne);

        continuer.setOnAction(event -> bienAjoutePoppup());
    }


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
