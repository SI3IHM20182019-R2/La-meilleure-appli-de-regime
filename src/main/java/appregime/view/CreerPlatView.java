package appregime.view;

import appregime.controller.CreerPlatController;
import appregime.controller.IngredientQuantiteController;
import appregime.model.IngredientQuantiteModel;
import appregime.model.PlatModel;
import com.sun.javafx.property.adapter.PropertyDescriptor;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class CreerPlatView {
    private ListView ingredientsListView;
    CreerPlatController creerPlatController;
    PlatModel platModel;
    private int rangeSelectedIngredient = -1;

    public CreerPlatView(CreerPlatController creerPlatController, PlatModel platModel) {
        this.creerPlatController = creerPlatController;
        this.platModel = platModel;
        ingredientsListView = creerPlatController.getIngredientsListView();
        ingredientsListView.setItems(platModel.getListIngredients());
        adaptItems();
        listenToPlat();
        listenToSelectedIngredient();
    }

    private void adaptItems() {
        //Set a new cell factory to use in the ListView.
        ingredientsListView.setCellFactory(
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
                                    adaptItems();
                                }
                                if (platModel.getListIngredients().size() == 0) {
                                    creerPlatController.showSupprimerButton(false);
                                }
                            }

                        };
                    }
                });
    }


    private void listenToPlat() {
        platModel.getGlucides().addListener((observable, oldValue, newValue) -> creerPlatController.getGlucidesFxml().setText(newValue.toString()));
        platModel.getProteines().addListener((observable, oldValue, newValue) -> creerPlatController.getProteinesFxml().setText(newValue.toString()));
        platModel.getLipides().addListener((observable, oldValue, newValue) -> creerPlatController.getLipidesFxml().setText(newValue.toString()));
        platModel.getCalories().addListener((observable, oldValue, newValue) -> creerPlatController.getCaloriesFxml().setText(newValue.toString()));
    }


    private void listenToSelectedIngredient() {
        ingredientsListView.getSelectionModel().selectedItemProperty().addListener(
                (ChangeListener<IngredientQuantiteModel>) (observable, oldValue, newValue) -> {
                    rangeSelectedIngredient = platModel.getListIngredients().indexOf(newValue);
                    creerPlatController.showSupprimerButton(true);
                });
    }


    public int getRangeSelectedIngredient() {
        return rangeSelectedIngredient;
    }
}
