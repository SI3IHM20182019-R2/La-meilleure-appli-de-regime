package appregime.controller;

import appregime.model.IngredientModel;
import appregime.model.IngredientQuantiteModel;
import appregime.model.IngredientsCreerPlatModel;
import appregime.view.CreerPlatView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class CreerPlatController extends Controller {
    @FXML
    private Button ajouterIngredient;
    @FXML
    private Button retour;
    @FXML
    private Button terminer;
    @FXML
    private ListView ingredientsList;

    IngredientsCreerPlatModel ingredientsModel;

    public CreerPlatController() {
        super("/appregime/view/creer_plat.fxml");
        ajouterIngredient.setOnAction(event -> afficheAjouterIngredient());
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
        ingredientsModel = new IngredientsCreerPlatModel();
        CreerPlatView creerPlatView = new CreerPlatView(this, ingredientsModel);
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
        ingredientsModel.addIngredient(new IngredientQuantiteModel(ingredient, quantite));
    }

    public ListView getIngredientsListView() {
        return ingredientsList;
    }
}
