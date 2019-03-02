package appregime.controller;

import appregime.model.IngredientList;
import appregime.view.AjouterIngredientView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class AjouterIngredientController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerIngredient;
    @FXML
    private Button ajouter;
    @FXML
    private ListView ingredientsList;

    public AjouterIngredientController() {
        super("/appregime/view/ajouter_ingredient.fxml");
        ajouter.setOnAction(event -> myStage.close());
        annuler.setOnAction(event -> myStage.close());
        creerIngredient.setOnAction(event -> creerIngredient());
        AjouterIngredientView ajouterIngredientView = new AjouterIngredientView(this, new IngredientList());
    }

    private void creerIngredient() {
        myStage.close();
        CreerIngredientController creerIngredientController = new CreerIngredientController();
        creerIngredientController.showWithMenu();
    }

    public ListView getIngredientsListView() {
        return ingredientsList;
    }
}