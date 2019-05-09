package com.example.regime_app.MenuFragments.MenuRegimesFragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.OnNextClicked;
import com.example.regime_app.R;

public class CreationRegimeFragment extends Fragment {
    OnNextClicked onNextClickedCallback;
    ImageView ajouterPhoto;
    TextView ajouterPhotoText;
    RelativeLayout ajouterPhotoBlock;
    Button ajouterJour;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creation_regime, container, false);

        ajouterJour = view.findViewById(R.id.new_item);
        ajouterPhotoBlock = view.findViewById(R.id.regime_photo_block);
        ajouterPhoto = view.findViewById(R.id.modifier_regime_photo);
        ajouterPhotoText = view.findViewById(R.id.modifier_regime_photo_texte);

        ajouterPhoto.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);
        });

        ajouterJour.setOnClickListener(v -> {
            onNextClickedCallback.onNextClicked();
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap photo = (Bitmap) data.getExtras().get("data");
        /*
        ViewGroup.LayoutParams params = ajouterPhotoBlock.getLayoutParams();
        Bitmap resizedPhoto;
        int offset;
        System.out.println("ICI: ");
        System.out.println(photo.getWidth());
        System.out.println(photo.getHeight());
        System.out.println(params.width);
        System.out.println(params.height);
        int paramsWidthInDp = convertPixelsToDp(params.width, getResources());
        int paramsHeightInDp = convertPixelsToDp(params.height, getResources());
        System.out.println(paramsWidthInDp);
        System.out.println(paramsHeightInDp);
        /
        if (photo.getWidth() > photo.getHeight()) {
            photo.setWidth((paramsHeightInDp*photo.getWidth())/photo.getHeight());
            photo.setHeight(paramsHeightInDp);
            offset = (photo.getHeight()-paramsHeightInDp)/2;
            resizedPhoto = Bitmap.createBitmap(photo, offset, 0, photo.getWidth()-offset, photo.getHeight());
        } else {
            if (photo.getWidth() < photo.getHeight()) {
                photo.setHeight((paramsWidthInDp*photo.getHeight())/photo.getWidth());
                photo.setWidth(paramsWidthInDp);
                offset = (photo.getWidth()-paramsWidthInDp)/2;
                resizedPhoto = Bitmap.createBitmap(photo, 0, offset, photo.getWidth(), photo.getHeight()-offset);
            } else {
                photo.setWidth(paramsWidthInDp);;
                photo.setHeight(paramsHeightInDp);
                resizedPhoto = Bitmap.createBitmap(photo, 0, 0, photo.getWidth(), photo.getHeight());
            }
        }*/

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

    public void setOnNextClickedListener(OnNextClicked onNextClickedCallback) {
        this.onNextClickedCallback = onNextClickedCallback;
    }
}
