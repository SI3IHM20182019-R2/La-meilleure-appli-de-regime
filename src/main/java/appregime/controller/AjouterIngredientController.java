package appregime.controller;

import appregime.model.IngredientList;
import appregime.model.UserModel;
import appregime.view.AjouterIngredientView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AjouterIngredientController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerIngredient;
    @FXML
    private Button ajouter;
    @FXML
    private TextField quantite;
    @FXML
    private ListView ingredientsList;

    private UserModel user;

    AjouterIngredientView ajouterIngredientView;
    CreerPlatController creerPlatController;

    public AjouterIngredientController(CreerPlatController creerPlatController) {
        super("/appregime/view/ajouter_ingredient.fxml");
        this.creerPlatController = creerPlatController;
        ajouter.setOnAction(event -> ajouter());
        annuler.setOnAction(event -> myStage.close());
        creerIngredient.setOnAction(event -> creerIngredient());
        ajouterIngredientView = new AjouterIngredientView(this, new IngredientList());
    }

    private void creerIngredient() {
        myStage.close();
        CreerIngredientController creerIngredientController = new CreerIngredientController(this.user);
        creerIngredientController.showWithMenu(this.user);
    }

    public ListView getIngredientsListView() {
        return ingredientsList;
    }

    public void ajouter() {
        creerPlatController.addIngredient(ajouterIngredientView.getSelectedIngredient(), Double.parseDouble(quantite.getCharacters().toString()));
        myStage.close();
    }
}