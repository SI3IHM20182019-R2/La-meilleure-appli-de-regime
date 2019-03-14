package appregime.controller;

import appregime.model.*;
import com.sun.javafx.scene.control.skin.DatePickerSkin;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
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
import java.util.ArrayList;
import java.util.Calendar;



import java.util.Date;
import java.util.Random;

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
    private ListView<RepasModel> platModelListView;

    @FXML
    private VBox calendar;

    private UserModel user;




    public AccueilController(UserModel user) {
        super("/appregime/view/accueil.fxml");
        this.user = user;
        this.nom.setText(this.user.getPseudo());
       // System.out.println(this.user.getPoids());

        //Generate 3 plats for the day
      /*  ListPlats l = new ListPlats();
        Random random = new Random();
        int index = random.nextInt(10);
        int index = random.nextInt(10);
        int index = random.nextInt(10);
       // platModelListView.setItems(l.getPlatList());*/
        this.initRepasList();
        this.initCalendar();
        this.PoidsActuel.setText(String.valueOf(this.user.getPoids()));
        this.regime.setText(this.user.getRegimes());
        this.objectif.setText(this.user.getObjectifvise());
        actualiser.setOnAction(event -> creerRegime());

    }

    public void initCalendar() {
       BorderPane root = new BorderPane();
      //  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
       // CalendarView calendarView = new CalendarView();
        DatePicker datePicker = new DatePicker(LocalDate.now());
        DatePickerSkin datePickerSkin = new DatePickerSkin(new DatePicker(LocalDate.now()));
        Node popupContent = datePickerSkin.getPopupContent();
       // calendar.getChildren().addAll(popupContent);
       root.setCenter(popupContent);
       calendar.getChildren().addAll(root);
        LocalDate selectedDate = datePicker.getValue();
        //Or using neat lambda
        datePicker.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("New Value: " + newValue);
        });

    }

    public void initRepasList() {
        RepasList l = new RepasList();
        Random random = new Random();
        int index = random.nextInt(4);
        int index1 = random.nextInt(4);
        int index2 = random.nextInt(4);
        ObservableList<RepasModel> ls= FXCollections.observableList(new ArrayList<>());
        ls.add(l.getRepasList().get(index));
        ls.add(l.getRepasList().get(index1));
        ls.add(l.getRepasList().get(index2));


        platModelListView.setItems(ls);

        platModelListView.setCellFactory(
                new Callback< ListView<RepasModel>, ListCell<RepasModel> >() {
                    @Override
                    public ListCell<RepasModel> call(ListView<RepasModel> listView) {
                        // Cette cellule personalisée pourrait (devrait) être placée dans une classe à part
                        return new ListCell<RepasModel>() {
                            @Override
                            protected void updateItem(RepasModel item, boolean empty) {
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