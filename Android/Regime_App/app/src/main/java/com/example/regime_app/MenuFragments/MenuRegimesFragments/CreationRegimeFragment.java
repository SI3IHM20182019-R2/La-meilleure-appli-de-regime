package com.example.regime_app.MenuFragments.MenuRegimesFragments;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.regime_app.FragmentSwitchable;
import com.example.regime_app.R;
import com.example.regime_app.Switch;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_JOUR;

public class CreationRegimeFragment extends FragmentSwitchable {
    ImageView ajouterPhoto;
    TextView ajouterPhotoText;
    RelativeLayout ajouterPhotoBlock;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creation_regime, container, false);

        Button ajouterJour = view.findViewById(R.id.ajouter_jour);
        Switch s = new Switch(ajouterJour, AJOUTER_JOUR, true);
        setSwitches(s);

        ajouterPhotoBlock = view.findViewById(R.id.regime_photo_block);
        ajouterPhoto = view.findViewById(R.id.modifier_regime_photo);
        ajouterPhotoText = view.findViewById(R.id.modifier_regime_photo_texte);

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
