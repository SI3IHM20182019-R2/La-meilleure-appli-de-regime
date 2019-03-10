package appregime.controller;

import appregime.model.IngredientQuantiteModel;
import appregime.model.ListPlats;
import appregime.model.PlatModel;
import appregime.model.UserModel;
import com.sun.javafx.scene.control.skin.DatePickerSkin;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.util.Callback;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;



import java.util.Date;

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

    @FXML
    private VBox calendar;

    private UserModel user;




    public AccueilController(UserModel user) {
        super("/appregime/view/accueil.fxml");
        this.user = user;
        this.nom.setText(this.user.getPseudo());
       // System.out.println(this.user.getPoids());

        ListPlats l = new ListPlats();
        platModelListView.setItems(l.getPlatList());
        this.initRepasList();
        this.initCalendar();
        this.PoidsActuel.setText(String.valueOf(this.user.getPoids()));
        this.regime.setText(this.user.getRegimes());
        this.objectif.setText(this.user.getObjectifvise());
        actualiser.setOnAction(event -> creerRegime());

    }

    public void initCalendar() {
       BorderPane root = new BorderPane();
      //  Scene scene = new Scene(root, 400, 400);

       // this.myStage.s
      //  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
       // CalendarView calendarView = new CalendarView();
      //  VBox test = new VBox();
        DatePickerSkin datePickerSkin = new DatePickerSkin(new DatePicker(LocalDate.now()));
        Node popupContent = datePickerSkin.getPopupContent();
       // calendar.getChildren().addAll(popupContent);
       root.setCenter(popupContent);
       calendar.getChildren().addAll(root);

      //  primaryStage.setScene(scene);
       // primaryStage.show();
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