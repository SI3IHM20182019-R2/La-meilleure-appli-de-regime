package com.example.regime_app;

import android.app.DatePickerDialog;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.regime_app.Models.Utilisateur;

import java.util.Calendar;
import java.util.List;


public class PlatsAccueilFragment extends Fragment {


    private ViewPager pagerhere;

    private static int value = 0;

    private TextView nom, poids, objectifActuel, objectif;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter pagerAdapter;
    private RecyclerView recyclerView;
    private Button next;
    private Button prev;
    int day= 0;
    int month= 0;
    int year= 0;
    private int mYear, mMonth, mDay;
    private ImageButton datepicker;
    private static int page = 0;

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);


        final View view = inflater.inflate(R.layout.accueil, container, false);
       datepicker = view.findViewById(R.id.calendar);
        datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                day = c.get(Calendar.DAY_OF_MONTH);
                month = c.get(Calendar.MONTH);
                year = c.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int datepickeryear, int datepickermonth, int dayOfMonth) {
                        day = dayOfMonth;
                        year = datepickeryear;
                        month = datepickermonth;
                        List<Fragment> fragmentsInPlace = getChildFragmentManager().getFragments();
                        if (fragmentsInPlace == null) {
                            return;

                        }
                        for (Fragment fragment : fragmentsInPlace)
                        {
                            getChildFragmentManager().beginTransaction().remove(fragment).commit();
                        }
                        Bundle args = new Bundle();
                        platsrecycleviewfragment platsrecycleviewfragment = new platsrecycleviewfragment();
                        platsrecycleviewfragment.setArguments(args);
                        args.putInt("day", day );
                        args.putInt("month", month);
                        args.putInt("year", year);
                        getChildFragmentManager().beginTransaction().add(R.id.fragmentrecycle, platsrecycleviewfragment).commit();
                    }
                }, day, month, year);
                datePickerDialog.show();

            }
        });
        next = view.findViewById(R.id.suivant);
        prev = view.findViewById(R.id.precedent);

        Utilisateur utilisateur = Utilisateur.getInstance();

        this.nom = view.findViewById(R.id.nomValue);
        this.nom.setText(utilisateur.getPrenom()+" "+utilisateur.getNom());

        this.poids = view.findViewById(R.id.poidsValue);
        this.poids.setText(Double.toString(utilisateur.getPoids())+" kg");

        this.objectifActuel = view.findViewById(R.id.textView12);
        this.objectifActuel.setText(Double.toString(utilisateur.getPoids())+" kg");

        this.objectif = view.findViewById(R.id.textView19);
        this.objectif.setText(Double.toString(utilisateur.getObectif())+" kg");


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page += 1;

                List<Fragment> fragmentsInPlace = getChildFragmentManager().getFragments();
                if (fragmentsInPlace == null) {
                    return;

                }
                for (Fragment fragment : fragmentsInPlace)
                {
                    getChildFragmentManager().beginTransaction().remove(fragment).commit();
                }
                Bundle args = new Bundle();
                platsrecycleviewfragment platsrecycleviewfragment = new platsrecycleviewfragment();
                platsrecycleviewfragment.setArguments(args);
                args.putInt("day", day + page);
                args.putInt("month", month + page);
                args.putInt("year", year + page);
                args.putInt("numberpage", page);

                getChildFragmentManager().beginTransaction().add(R.id.fragmentrecycle, platsrecycleviewfragment).commit();
        }
        });


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page -=1 ;

                List<Fragment> fragmentsInPlace = getChildFragmentManager().getFragments();
                if (fragmentsInPlace == null) {
                    return;

                }
                for (Fragment fragment : fragmentsInPlace)
                {
                    getChildFragmentManager().beginTransaction().remove(fragment).commit();
                }
                Bundle args = new Bundle();
                platsrecycleviewfragment platsrecycleviewfragment = new platsrecycleviewfragment();
                platsrecycleviewfragment.setArguments(args);
                args.putInt("day", day + page);
                args.putInt("month", month );
                args.putInt("year", year);
                args.putInt("numberpage", page);

                getChildFragmentManager().beginTransaction().add(R.id.fragmentrecycle, platsrecycleviewfragment).commit();
            }
        });

        return view;

        }
}
