package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class MenuController extends Controller {
    @FXML
    private Label accueil;
    @FXML
    private Label monProfil;
    @FXML
    private Label mesRegimes;
    @FXML
    private Label monEvolution;
    @FXML
    private Label deconnexion;

    private UserModel user;

    public MenuController() {

        super("/appregime/view/menu_layout.fxml");
        UtilisateurAcceuilController utilisateurAcceuilController = new UtilisateurAcceuilController();

        this.user = utilisateurAcceuilController.getCurrentUser();
        fxml.getStylesheets().add("/appregime/css/menu_layout.css");

        mesRegimes.setOnMouseClicked(event -> setBelowMenuElement(new MesRegimesController(this.user).getFxml()));
        accueil.setOnMouseClicked(event -> setBelowMenuElement(new AccueilController(this.user).getFxml()));
        monProfil.setOnMouseClicked(event -> setBelowMenuElement(new ProfilController(this.user).getFxml()));
        monEvolution.setOnMouseClicked(event -> setBelowMenuElement(new EvolutionController().getFxml()));
        deconnexion.setOnMouseClicked(event -> connexion());
    }

    /**
     * affiche la partie de l'écran (représentée ici par la variable node) qui se trouve sous la barre de menu
     */
    public void setBelowMenuElement(Node node) {
        VBox.setVgrow(node, Priority.ALWAYS); // sert au fonctionnement des écrans qui sont "responsive"
        fxml.getChildren().set(1, node); // insère à l'indice 1 de la VBox principale (élément 0 étant la barre de menu)
    }

    public void connexion() {
        DeconnexionController deconnexionController = new DeconnexionController();
        deconnexionController.showInMyStage("Deconnexion");

    }
}
