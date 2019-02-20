package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController extends Controller {
    @FXML
    private Button accueil;
    @FXML
    private Button monProfil;
    @FXML
    private Button mesRegimes;
    @FXML
    private Button monEvolution;
    @FXML
    private Button deconnexion;

    public MenuController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/menu_layout.fxml");
    }

    /**
     * set l'élément 1 de la VBox (élément 0 étant la barre de menu)
     */
    public void setElementLayout(Node c) {
        fxml.getChildren().set(1, c);
    }
}
