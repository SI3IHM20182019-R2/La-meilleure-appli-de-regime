package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class MesRegimesController extends Controller {
    @FXML
    private Button creerRegime;
    @FXML
    private TextField chercher;
    @FXML
    private MenuButton triDate;
    @FXML
    private MenuButton triNote;

    public MesRegimesController() {
        super("/appregime/view/mes_regimes.fxml");
        creerRegime.setOnAction(event -> creerRegime());
    }

    private void creerRegime() {
        CreerRegimeController Creation = new CreerRegimeController();
        Creation.showWithMenu();
    }
}