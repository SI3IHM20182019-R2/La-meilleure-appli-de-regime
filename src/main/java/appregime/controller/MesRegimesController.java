package appregime.controller;

import appregime.model.UserModel;
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

    private UserModel user;

    public MesRegimesController(UserModel user) {

        super("/appregime/view/mes_regimes.fxml");
        this.user = user;
        creerRegime.setOnAction(event -> creerRegime());
    }

    private void creerRegime() {
        CreerRegimeController Creation = new CreerRegimeController(this.user);
        Creation.showWithMenu(this.user);
    }
}