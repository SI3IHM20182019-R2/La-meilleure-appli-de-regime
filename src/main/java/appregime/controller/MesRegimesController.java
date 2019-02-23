package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MesRegimesController extends Controller {
    @FXML
    private Button creerRegime;
    @FXML
    private TextField chercher;
    @FXML
    private MenuButton triDate;
    @FXML
    private MenuButton triNote;

    public MesRegimesController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/mes_regimes.fxml");
        creerRegime.setOnAction(event -> creerRegime());
    }

    private void creerRegime() {
        CreerRegimeController Creation = new CreerRegimeController(primaryStage);
        Creation.showWithMenu();
    }
}