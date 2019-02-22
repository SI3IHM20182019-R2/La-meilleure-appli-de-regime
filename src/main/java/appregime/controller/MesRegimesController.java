package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MesRegimesController extends Controller {
    @FXML
    private Button DetailsActuel;
    @FXML
    private Button DeletActuel;
    @FXML
    private Button DetailFavoris;
    @FXML
    private Button DeleteFavoris;
    @FXML
    private Button Detail1;
    @FXML
    private Button Add1;
    @FXML
    private Button Details2;
    @FXML
    private Button Add2;
    @FXML
    private Button Details3;
    @FXML
    private Button Add3;
    @FXML
    private Button Details4;
    @FXML
    private Button Add4;
    @FXML
    private Button CreateRegime;
    @FXML
    private TextField Search;
    @FXML
    private MenuButton tri1;
    @FXML
    private MenuButton Tri2;

    public MesRegimesController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/mes_regimes.fxml");
        CreateRegime.setOnAction(event -> CreateRegime());
    }

    private void CreateRegime() {
        CreerRegimeController Creation = new CreerRegimeController(primaryStage);
        Creation.showWithMenu();
    }

}