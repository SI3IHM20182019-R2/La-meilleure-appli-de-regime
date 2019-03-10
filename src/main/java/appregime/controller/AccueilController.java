package appregime.controller;

import appregime.model.IngredientQuantiteModel;
import appregime.model.ListPlats;
import appregime.model.PlatModel;
import appregime.model.UserModel;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.IOException;

public class AccueilController extends Controller {

    @FXML
    private Label nom;

    @FXML
    private Label PoidsActuel;

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
    private Label regime;

    @FXML
    private Label PoidsVisé;

    @FXML
    private Label objectif;

    @FXML
    private ListView<PlatModel> platModelListView;

    private UserModel user;




    public AccueilController(UserModel user) {
        super("/appregime/view/accueil.fxml");
        this.user = user;
        this.nom.setText(this.user.getPseudo());
       // System.out.println(this.user.getPoids());

        ListPlats l = new ListPlats();
        platModelListView.setItems(l.getPlatList());
        this.initRepasList();
        this.PoidsActuel.setText(String.valueOf(this.user.getPoids()));
        this.regime.setText(this.user.getRegimes());
        this.objectif.setText(this.user.getObjectifvise());
        actualiser.setOnAction(event -> creerRegime());

    }

    public void initRepasList() {

        platModelListView.setCellFactory(
                new Callback< ListView<PlatModel>, ListCell<PlatModel> >() {
                    @Override
                    public ListCell<PlatModel> call(ListView<PlatModel> listView) {
                        // Cette cellule personalisée pourrait (devrait) être placée dans une classe à part
                        return new ListCell<PlatModel>() {
                            @Override
                            protected void updateItem(PlatModel item, boolean empty) {
                                super.updateItem(item, empty);
                                if (item != null) {

                                    //setText(String.valueOf(item.getName()));
                                    RepasController repasController = new RepasController();
                                    repasController.setRepas(item);
                                    setGraphic(repasController.getFxml());

                                }

                            }
                        };
                    }
                });

        // Include from the code a different fxml file
       // displayAdBanner(department);

    }

    private void creerRegime() {
        PoidsMajController poidsMajController = new PoidsMajController();
        poidsMajController.showInMyStage("Modifie le poids actuel");
    }
}