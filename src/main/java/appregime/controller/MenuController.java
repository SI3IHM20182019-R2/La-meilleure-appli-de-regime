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
     * affiche la partie de l'écran (représentée ici par la variable node) qui se trouve sous la barre de menu
     */
    public void setBelowMenuElement(Node node) {
        fxml.getChildren().set(1, node); // insère à l'indice 1 de la VBox principale (élément 0 étant la barre de menu)
    }
}
