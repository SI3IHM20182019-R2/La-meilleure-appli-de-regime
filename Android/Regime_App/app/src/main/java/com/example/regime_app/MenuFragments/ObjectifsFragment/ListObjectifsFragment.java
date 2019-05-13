package com.example.regime_app.MenuFragments.ObjectifsFragment;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.regime_app.Adapters.ListObjectifsAdapter;
import com.example.regime_app.Commom.Commom;
import com.example.regime_app.Interface.ObjectifInterface;
import com.example.regime_app.Models.ObjectifsModel.NewObjectif;
import com.example.regime_app.Models.ObjectifsModel.Objectif;
import com.example.regime_app.Models.ObjectifsModel.TypeObjectif;
import com.example.regime_app.R;

import java.util.ArrayList;
import java.util.Date;

public class ListObjectifsFragment extends Fragment {

    private ArrayList<ObjectifInterface> objectifs = new ArrayList<>();
    private Dialog myDialog;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.list_objectifs, container, false);
        this.objectifs.add(new Objectif(TypeObjectif.AmeliorationSilhouette, new Date(), false));
        this.objectifs.add(new Objectif(TypeObjectif.MangerSain, new Date(), false));
        this.objectifs.add(new Objectif(TypeObjectif.PriseDeMuscle, new Date(), false));
        this.objectifs.add(new Objectif(TypeObjectif.PerteDePoids, new Date(), false));

        initRecyclerView(view);
        Button buttonsupprimer = view.findViewById(R.id.boutonSupprimer);
        buttonsupprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog = new Dialog(view.getContext());
                myDialog.setContentView(R.layout.pop_up_confirmation_suppression_objectif);
                TextView textBut = (TextView) myDialog.findViewById(R.id.questionSuppression);
                textBut.setText("Voulez vous vraiment arreter votre objectif : " + Commom.objectifSelected.toString().toLowerCase() + "?");
                myDialog.show();
            }
        });

        Button buttomAjouter = view.findViewById(R.id.boutonAjouter);
        buttomAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getChildFragmentManager().beginTransaction().add(R.id.ListObjectifLayout, new AjoutObjectifFragment()).commit();
            }
        });
        return view;
    }

    private void initRecyclerView(View view){

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        ListObjectifsAdapter adapter = new ListObjectifsAdapter(view.getContext(), this.objectifs);
        recyclerView.setAdapter(adapter);

        if (Commom.objectifSelected != null) {
            TextView textBut = (TextView) view.findViewById(R.id.butObjectif);
            textBut.setText(Commom.objectifSelected.getBut());

            TextView textConseil = (TextView) view.findViewById(R.id.conseilCoach);
            textConseil.setText(Commom.objectifSelected.getConseilCoach());
        }
    }
}