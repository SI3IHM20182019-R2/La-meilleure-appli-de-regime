package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class InscriptionController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button continuer;
    @FXML
    private RadioButton femme;
    @FXML
    private RadioButton homme;
    @FXML
    private TextField age;
    @FXML
    private TextField taille;
    @FXML
    private TextField poids;
    @FXML
    private TextField poidsSouhaite;
    @FXML
    private Button plusPrefAlimentaires;
    @FXML
    private Button plusAllergies;

    public InscriptionController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/inscription.fxml");
        ToggleGroup sexe = new ToggleGroup();
        femme.setToggleGroup(sexe);
        homme.setToggleGroup(sexe);
        retour.setOnAction(event -> retour());
        continuer.setOnAction(event -> continuer()); // à modifier dès que l'écran correspondant (suite de l'inscription) sera disponible
    }

    private void retour() {
        ConnexionController connexion = new ConnexionController(primaryStage);
        connexion.showInPrimaryStage();
    }

    // à modifier
    private void continuer() {
        MesRegimesController mesRegimesController = new MesRegimesController(primaryStage);
        mesRegimesController.showWithMenu();
    }
}
