package com.example.regime_app.MenuFragments;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.regime_app.R;

import java.util.ArrayList;

public class ObjectifsFragment extends Fragment {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImageUrls = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.objectifs, container, false);

        mImageUrls.add(R.drawable.prise_muscle);
        mNames.add("Prise de muscle");

        mImageUrls.add(R.drawable.amelioration_silhouette);
        mNames.add("Amélioration silhouette");

        mImageUrls.add(R.drawable.perte_de_graisse_localise);
        mNames.add("Perte de grasse localisé");

        mImageUrls.add(R.drawable.perte_de_poids);
        mNames.add("Perte de poids");

        mImageUrls.add(R.drawable.reduire_les_glucides);
        mNames.add("Réduire les glucides");

        mImageUrls.add(R.drawable.manger_plus_sain);
        mNames.add("Manger plus sain");

        initRecyclerView(view);
        return view;

    }

    private void initRecyclerView(View view){

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(view.getContext(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }
}