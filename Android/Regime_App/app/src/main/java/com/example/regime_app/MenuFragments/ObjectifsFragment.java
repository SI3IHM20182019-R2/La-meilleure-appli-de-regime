package com.example.regime_app.MenuFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.regime_app.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class ObjectifsFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.objectifs, container, false);
        ArrayList<String> mNames = new ArrayList<>();
        ArrayList<String> mImageUrls = new ArrayList<>();
        getImages(view, mNames, mImageUrls);

        return view;
    }

    private void getImages(View view, ArrayList mNames, ArrayList mImageUrls){

        mImageUrls.add("@drawable/prise_muscle");
        mNames.add("Prise de muscle");

        mImageUrls.add("@drawable/amelioration_silhouette");
        mNames.add("Amélioration silhouette");

        mImageUrls.add("@drawable/perte_de_graisse_localise");
        mNames.add("Perte de graisse localisée");

        mImageUrls.add("@drawable/reduire_les_glucides");
        mNames.add("Réduire les glucides");


        mImageUrls.add("@drawable/perte_de_poids");
        mNames.add("Perte de poids");

        mImageUrls.add("@drawable/manger_plus_sain");
        mNames.add("Manger plus sain");

        initRecyclerView(view, mNames, mImageUrls);

    }

    private void initRecyclerView(View view, ArrayList mNames, ArrayList mImageUrls){
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(view.getContext(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }
}





