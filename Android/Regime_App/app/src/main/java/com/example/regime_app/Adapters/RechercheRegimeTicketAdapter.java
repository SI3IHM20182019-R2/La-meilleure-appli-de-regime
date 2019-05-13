package com.example.regime_app.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;
import com.example.regime_app.ViewHolders.RechercheRegimeViewHolder;

import java.util.List;

public class RechercheRegimeTicketAdapter extends RecyclerView.Adapter {
    private List<Regime> regimes;
    private List<Regime> regimeactuel;

    public RechercheRegimeTicketAdapter(List<Regime> regimes , List<Regime> regimeactuel) {
        this.regimes = regimes;
        this.regimeactuel = regimeactuel;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recherche_regime_ticket, parent, false);
        return new RechercheRegimeViewHolder(view, parent.getContext().getApplicationContext());
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((RechercheRegimeViewHolder) viewHolder).bindData(regimes.get(position) , this.regimeactuel , this);
    }

    @Override
    public int getItemCount() {
        return regimes.size();
    }

    public void setnotification () {
        this.notifyDataSetChanged();
    }
}
