package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InscriptionController extends Controller {
    @FXML
    private Button RetourHome;
    @FXML
    private Button Continuer;
    @FXML
    private RadioButton Female;
    @FXML
    private RadioButton Male;
    @FXML
    private TextField Age;
    @FXML
    private TextField Taille;
    @FXML
    private TextField Poids;
    @FXML
    private TextField PoidsSouhaite;
    @FXML
    private Button PlusPrefAlimentaires;
    @FXML
    private Button PlusAllergies;

    public InscriptionController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/Inscription.fxml");
        RetourHome.setOnAction(event -> retourhome());
    }

    private void retourhome() {
        ConnexionController Connexion = new ConnexionController(primaryStage);
        Connexion.showWithMenu();
    }

}
