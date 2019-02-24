package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AccueilController extends Controller {

    @FXML
    private Label nom;

    @FXML
    private Label poidsActuel;

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
    private Label PoidsVisé;



    public AccueilController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/accueil.fxml");
        actualiser.setOnAction(event -> creerRegime());
    }

    private void creerRegime() {
        po Creation = new CreerRegimeController(primaryStage);
        Creation.showWithMenu();
    }
}