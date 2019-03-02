package appregime.view;

import appregime.controller.CreerPlatController;
import appregime.controller.IngredientQuantiteController;
import appregime.model.IngredientQuantiteModel;
import appregime.model.PlatModel;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class CreerPlatView extends View {
    private ListView ingredients;
    CreerPlatController creerPlatController;

    public CreerPlatView(CreerPlatController creerPlatController, PlatModel platModel) {
        super(creerPlatController, platModel);
        this.creerPlatController = creerPlatController;
        ingredients = creerPlatController.getIngredientsListView();
        ingredients.setItems(platModel.getListIngredients());
        adaptItems(ingredients);
        listenToPlat(creerPlatController.getPlatModel());
    }

    /**
     * display each item of the ListView
     * Automatically called if the ModelListCustomers.listOfCustumers is changed
     * @param listView the element to be filled
     */
    private void adaptItems(ListView listView) {
        //Set a new cell factory to use in the ListView.
        listView.setCellFactory(
                //  first parameter specifies the type of the object passed in to the call method
                //  the second parameter specifying the return type of the method.
                new Callback<ListView, ListCell>() {
                    //define what to do when ModelListCustomers.listOfCustumers is changed
                    @Override
                    public ListCell call(ListView listView) {
                        return new ListCell() {
                            @Override
                            protected void updateItem(Object item, boolean empty) {
                                super.updateItem(item, empty);
                                if (item != null) {
                                    IngredientQuantiteController ingredientQuantiteController = new IngredientQuantiteController();
                                    ingredientQuantiteController.setIngredient((IngredientQuantiteModel) item);
                                    setGraphic(ingredientQuantiteController.getFxml());
                                    adaptItems(listView);
                                }
                            }

                        };
                    }
                });
    }

    private void listenToPlat(PlatModel platModel) {
        platModel.getGlucides().addListener((observable, oldValue, newValue) -> creerPlatController.getGlucidesLabel().setText(newValue.toString()));
        platModel.getProteines().addListener((observable, oldValue, newValue) -> creerPlatController.getProteinesLabel().setText(newValue.toString()));
        platModel.getLipides().addListener((observable, oldValue, newValue) -> creerPlatController.getLipidesLabel().setText(newValue.toString()));
        platModel.getCalories().addListener((observable, oldValue, newValue) -> creerPlatController.getCaloriesLabel().setText(newValue.toString()));
    }
}
