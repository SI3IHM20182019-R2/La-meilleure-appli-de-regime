package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class AccueilController extends Controller {

    @FXML
    private Label nom;

    @FXML
    private Label PoidsActuel;

    @FXML
    private Button actualiser;

    @FXML
    private Label jour;

    @FXML
    private Label DateJour;

    @FXML
    private DatePicker calendrier;

    @FXML
    private Label PoidsDepart;

    @FXML
    private Label regime;

    @FXML
    private Label PoidsVisé;

    @FXML
    private Label objectif;

    private UserModel user;



    public AccueilController(UserModel user) {
        super("/appregime/view/accueil.fxml");
        this.user = user;
        this.nom.setText(this.user.getPseudo());
       // System.out.println(this.user.getPoids());
        this.PoidsActuel.setText(String.valueOf(this.user.getPoids()));
        this.regime.setText(this.user.getRegimes());
        this.objectif.setText(this.user.getObjectifvise());
        actualiser.setOnAction(event -> creerRegime());

    }

    private void creerRegime() {
        PoidsMajController poidsMajController = new PoidsMajController();
        poidsMajController.showInMyStage("Modifie le poids actuel");
    }
}