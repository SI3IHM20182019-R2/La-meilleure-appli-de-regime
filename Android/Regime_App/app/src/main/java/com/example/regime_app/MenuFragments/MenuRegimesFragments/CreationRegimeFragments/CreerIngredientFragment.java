package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.regime_app.Exec;
import com.example.regime_app.FragmentSwitchable;
import com.example.regime_app.Models.Ingredient;
import com.example.regime_app.Models.Mocks;
import com.example.regime_app.R;
import com.example.regime_app.Switch;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT1;

public class CreerIngredientFragment extends FragmentSwitchable {
    ImageView ajouterPhoto;
    TextView ajouterPhotoText;
    RelativeLayout ajouterPhotoBlock;
    Bitmap ingredientPhoto;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creer_ingredient, container, false);

        ImageButton retour = view.findViewById(R.id.creer_ingredient_retour);
        Button confirmer = view.findViewById(R.id.ingredient_confirmer);

        EditText nom = view.findViewById(R.id.modifier_ingredient_nom);

        TextView champsNonRemplis = view.findViewById(R.id.creer_ingredient_champs_non_remplis);

        EditText glucides = view.findViewById(R.id.creer_ingredient_glucides);
        EditText lipides = view.findViewById(R.id.creer_ingredient_lipides);
        EditText proteines = view.findViewById(R.id.creer_ingredient_proteines);
        EditText calories = view.findViewById(R.id.creer_ingredient_calories);

        Switch s1 = new Switch(retour, CREER_PLAT1, true);
        Switch s2 = new Switch(confirmer, CREER_PLAT1);
        Exec exec = (() -> {
            if (!nom.getText().toString().equals("") && !glucides.getText().toString().equals("") && !lipides.getText().toString().equals("") && !proteines.getText().toString().equals("") && !calories.getText().toString().equals("")) {
                s2.setReadyToSwitch(true);
                getFragmentManager().beginTransaction().remove(this).commit();
                Mocks.addIngredient(new Ingredient(nom.getText().toString(), ingredientPhoto, Float.parseFloat(glucides.getText().toString())/100, Float.parseFloat(lipides.getText().toString())/100, Float.parseFloat(proteines.getText().toString())/100, Float.parseFloat(calories.getText().toString())/100));
            } else {
                champsNonRemplis.setAlpha(1.0f);
                nom.setBackground(getContext().getResources().getDrawable(R.drawable.red_square, getContext().getTheme()));
                glucides.setBackground(getContext().getResources().getDrawable(R.drawable.red_square, getContext().getTheme()));
                lipides.setBackground(getContext().getResources().getDrawable(R.drawable.red_square, getContext().getTheme()));
                proteines.setBackground(getContext().getResources().getDrawable(R.drawable.red_square, getContext().getTheme()));
                glucides.setBackground(getContext().getResources().getDrawable(R.drawable.red_square, getContext().getTheme()));
                calories.setBackground(getContext().getResources().getDrawable(R.drawable.red_square, getContext().getTheme()));
            }
        });
        s2.setExec(exec);
        setSwitches(s1, s2);

        ajouterPhotoBlock = view.findViewById(R.id.ingredient_photo_block);
        ajouterPhoto = view.findViewById(R.id.modifier_ingredient_photo);
        ajouterPhotoText = view.findViewById(R.id.modifier_ingredient_photo_texte);

        ajouterPhoto.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            int orientation = getResources().getConfiguration().orientation;
            Bitmap resultBmp;
            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                resultBmp = Bitmap.createBitmap(photo.getHeight(), photo.getHeight(), Bitmap.Config.ARGB_8888);
            } else {
                resultBmp = Bitmap.createBitmap(photo.getWidth(), photo.getWidth(), Bitmap.Config.ARGB_8888);
            }
            new Canvas(resultBmp).drawBitmap(photo, 0, 0, null);
            this.ingredientPhoto = resultBmp;
            this.ajouterPhoto.setImageBitmap(resultBmp);
            this.ajouterPhotoText.setAlpha(0.0f);
        }
    }
}
