package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.xml.soap.Text;

public class BienAjouteController extends Controller {

    @FXML
    private Button retour;

    @FXML
    private Button continuer;

   @FXML
   private Label objectif;

   @FXML
   private Label regime;


   private UserModel user;

    public BienAjouteController(String obj, String reg, UserModel user) {
        super("/appregime/view/bienAjoute.fxml");
        this.user =user;
        System.out.println(obj);
        System.out.println(reg);
        retour.setOnAction(event -> myStage.close());
        continuer.setOnAction(event -> continuer());

    }

    public void set(String obj, String reg) {
        System.out.println(objectif);
        objectif.setText(obj);
        regime.setText(reg);
    }

    public void continuer() {
        System.out.println(this.user);
        myStage.close();
        UtilisateurAcceuilController utilisateurAcceuilController = new UtilisateurAcceuilController();
        utilisateurAcceuilController.setCurrentUser(user);
        AccueilController accueilController = new AccueilController(this.user);
        accueilController.showWithMenu(this.user);

    }


}
