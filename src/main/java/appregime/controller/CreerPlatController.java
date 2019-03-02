package appregime.controller;

import appregime.model.IngredientModel;
import appregime.model.IngredientQuantiteModel;
import appregime.model.PlatModel;
import appregime.view.CreerPlatView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

public class CreerPlatController extends Controller {
    @FXML
    private Button ajouterIngredient;
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    @FXML
    private ListView ingredientsList;

    @FXML
    private Text glucides;
    @FXML
    private Text proteines;
    @FXML
    private Text lipides;
    @FXML
    private Text calories;

    PlatModel plat;

    public CreerPlatController() {
        super("/appregime/view/creer_plat.fxml");
        ajouterIngredient.setOnAction(event -> afficheAjouterIngredient());
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
        plat = new PlatModel();
        CreerPlatView creerPlatView = new CreerPlatView(this, plat);
    }

    private void afficheAjouterIngredient() {
        AjouterIngredientController ajouterIngredientController = new AjouterIngredientController(this);
        ajouterIngredientController.showInMyStage("Ajouter un ingrédient");
    }

    private void retour() {
        CreerRepasController creerRepasController = new CreerRepasController();
        creerRepasController.showWithMenu();
    }

    public void addIngredient(IngredientModel ingredient, double quantite) {
        plat.addIngredient(new IngredientQuantiteModel(ingredient, quantite));
    }

    public ListView getIngredientsListView() {
        return ingredientsList;
    }
    public Text getGlucidesLabel() {
        return glucides;
    }
    public Text getProteinesLabel() {
        return proteines;
    }
    public Text getLipidesLabel() {
        return lipides;
    }
    public Text getCaloriesLabel() {
        return calories;
    }

    public PlatModel getPlatModel() {
        return plat;
    }
}
