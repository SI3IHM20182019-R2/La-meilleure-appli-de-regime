package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.regime_app.FragmentSwitchable;
import com.example.regime_app.R;
import com.example.regime_app.Switch;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_REPAS;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT1;

public class CreerPlat2Fragment extends FragmentSwitchable {
    ImageView ajouterPhoto;
    TextView ajouterPhotoText;
    RelativeLayout ajouterPhotoBlock;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creer_plat2, container, false);

        ImageButton retour = view.findViewById(R.id.creer_plat2_retour);
        ImageView etapePrecedente = view.findViewById(R.id.creer_plat2_etape_precedente);
        ImageView confirmer = view.findViewById(R.id.creer_plat2_confirmer);
        Switch s1 = new Switch(etapePrecedente, CREER_PLAT1);
        Switch s2 = new Switch(retour, AJOUTER_REPAS);
        Switch s3 = new Switch(confirmer, AJOUTER_REPAS);
        setSwitches(s1, s2, s3);

        ajouterPhotoBlock = view.findViewById(R.id.plat_photo_block);
        ajouterPhoto = view.findViewById(R.id.modifier_plat_photo);
        ajouterPhotoText = view.findViewById(R.id.modifier_plat_photo_texte);

        ajouterPhoto.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap photo = (Bitmap) data.getExtras().get("data");
        int orientation = getResources().getConfiguration().orientation;
        Bitmap resultBmp;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            resultBmp = Bitmap.createBitmap(photo.getHeight(), photo.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            resultBmp = Bitmap.createBitmap(photo.getWidth(), photo.getWidth(), Bitmap.Config.ARGB_8888);
        }
        new Canvas(resultBmp).drawBitmap(photo, 0, 0, null);
        this.ajouterPhoto.setImageBitmap(resultBmp);
        this.ajouterPhotoText.setAlpha(0.0f);
    }
}
