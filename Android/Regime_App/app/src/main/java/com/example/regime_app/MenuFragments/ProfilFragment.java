package com.example.regime_app.MenuFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.regime_app.Models.Utilisateur;
import com.example.regime_app.R;

public class ProfilFragment extends Fragment {

    private TextView nom, poids, taille, sexe, age, mail;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.profil, container, false);

        this.nom = view.findViewById(R.id.textView4);
        this.poids = view.findViewById(R.id.textView5);
        this.age = view.findViewById(R.id.textView6);
        this.taille= view.findViewById(R.id.textView7);
        this.sexe = view.findViewById(R.id.textView8);
        this.mail = view.findViewById(R.id.textView16);

        Utilisateur user = Utilisateur.getInstance();

        this.nom.setText(user.getPrenom()+" "+user.getNom());
        this.poids.setText("Poids : "+Double.toString(user.getPoids())+"kg");
        this.age.setText("Age : "+ Integer.toString(user.getAge())+" ans");
        this.taille.setText("Taille : "+Integer.toString(user.getTaille())+"cm");
        this.sexe.setText("Sexe : "+user.getSexe());
        this.mail.setText(user.getMail());

        return view;
    }
}
