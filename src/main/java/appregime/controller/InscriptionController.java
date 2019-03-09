package appregime.controller;

import appregime.Main;
import appregime.model.PreferenceAlimentaireModel;
import com.google.gson.Gson;
import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class InscriptionController extends Controller {
    @FXML
    private Button retour;
    @FXML
    private Button continuer;
    @FXML
    private RadioButton femme;
    @FXML
    private RadioButton homme;
    @FXML
    private TextField age;
    @FXML
    private TextField taille;
    @FXML
    private TextField poids;
    @FXML
    private TextField poidsSouhaite;
    @FXML
    private Button plusPrefAlimentaires;
    @FXML
    private Button plusAllergies;
    @FXML
    private ComboBox<String> allergie_list;
    @FXML
    private ComboBox<String> pref_list;

    private UserModel user;

    public InscriptionController(UserModel user) {
        super("/appregime/view/inscription.fxml");
        this.user = user;
        ToggleGroup sexe = new ToggleGroup();
        femme.setToggleGroup(sexe);
        homme.setToggleGroup(sexe);
        init_pref_list();
        init_allergies_list();
        retour.setOnAction(event -> retour());
        continuer.setOnAction(event -> continuer(this.user)); // à modifier dès que l'écran correspondant (suite de l'inscription) sera disponible
    }

    private void retour() {
        ConnexionController connexion = new ConnexionController();
        connexion.showInPrimaryStage();
    }

    // à modifier
    private void continuer(UserModel user) {

        //Set the User Model
        if(poids.getText().trim().isEmpty()) {
            showPopup();
        } else if (poidsSouhaite.getText().trim().isEmpty()) {
            showPopup();
        } else if (age.getText().trim().isEmpty()) {
            showPopup();
        } else if (!femme.isSelected() || !homme.isSelected()) {
            showPopup();
        } else if (taille.getText().trim().isEmpty()) {
            showPopup();
        } else {
            user.setPoids(Double.parseDouble(poids.getText()));
            user.setPoidsSouhaite(Double.parseDouble(poidsSouhaite.getText()));
            user.setAge(Integer.parseInt(age.getText()));
            if (femme.isSelected()) {user.setSexe("femme");} else {user.setSexe("homme");}; ;
            user.setTaille(Double.parseDouble(taille.getText()));
            user.setAllergies(allergie_list.getValue());
            user.setPreferences(pref_list.getValue());

            ObjectifsRegimesController objectifsRegimesController = new ObjectifsRegimesController(this.user);
            objectifsRegimesController.showInPrimaryStage();
        }


        /*
        MesRegimesController mesRegimesController = new MesRegimesController(primaryStage);
        mesRegimesController.showWithMenu();*/
    }

    private void showPopup() {
        PopupInscriptionController popup = new PopupInscriptionController();
        popup.showInMyStage("Warning!");
    }

    private void init_pref_list() {
        String path = Main.class.getResource("/appregime/json/preferences_alimentaire.json").getPath().replaceAll("%20", " ");
        try {
            ArrayList<String> prefs = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            ArrayList json = gson.fromJson(bufferedReader, ArrayList.class);
            for (Object obj : json) {
                String str = gson.toJson(obj);
                PreferenceAlimentaireModel pref = gson.fromJson(str, PreferenceAlimentaireModel.class);
                prefs.add(pref.getLibelle());
                System.out.println("Added --> " + pref.getLibelle());
            }
            for (String libelle : prefs) {
                pref_list.getItems().add(libelle);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private void init_allergies_list() {
        String path = Main.class.getResource("/appregime/json/allergies.json").getPath().replaceAll("%20", " ");
        try {
            ArrayList<String> allergies = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            ArrayList json = gson.fromJson(bufferedReader, ArrayList.class);
            for (Object str : json) {
                System.out.println(str.toString());
                allergie_list.getItems().add(str.toString());
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
