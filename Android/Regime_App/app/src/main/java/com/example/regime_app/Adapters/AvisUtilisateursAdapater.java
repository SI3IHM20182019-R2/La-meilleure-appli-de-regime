/*package com.example.regime_app.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.MenuFragments.MenuRegimesFragments.MesRegimesFragment.java;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

import java.util.ArrayList;
import java.util.List;

public class MesRegimesAdapter extends BaseAdapter {

    private ArrayList<Regime> lesregimes ;
    private LayoutInflater inflater ;
    public MesRegimesAdapter(@NonNull LayoutInflater inflater , ArrayList<Regime> regimes) {
        this.lesregimes = regimes;
        this.inflater = inflater;
    }


    @Override
    public int getCount() {
        return lesregimes.size();
    }

    @Override
    public Object getItem(int position) {
        return lesregimes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;

        if (convertView == null){
            holder = new ViewHolder() ;

            convertView = inflater.inflate(R.layout.regimes_card , null) ;
            holder.title = (TextView)convertView.findViewById(R.id.title);
            holder.description = (TextView)convertView.findViewById(R.id.description);
            holder.imageregime = (ImageView) convertView.findViewById(R.id.imageregime);
            holder.deleteimage = (ImageButton) convertView.findViewById(R.id.deleteimage);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.title.setText(lesregimes.get(position).getNom());
        holder.description.setText(lesregimes.get(position).getDescription());
        holder.deleteimage.setTag(position);
        //holder.imageregime.setImageURI();
        return convertView;

    }

    private class ViewHolder{
        TextView title ;
        TextView description ;
        ImageView imageregime ;
        ImageButton deleteimage ;

    }
}
*/
package com.example.regime_app.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.regime_app.Models.Avis;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;
import com.example.regime_app.ViewHolders.AvisUtilisateursHolder;
import com.example.regime_app.ViewHolders.MesRegimesHolder;
import com.example.regime_app.ViewHolders.RechercheRegimeViewHolder;

import java.util.ArrayList;
import java.util.List;

public class AvisUtilisateursAdapater extends RecyclerView.Adapter {
    private Regime regime;
    private List<Avis> listavis;

    public AvisUtilisateursAdapater(ArrayList<Avis> regimeavis) {
        this.listavis = regimeavis;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.avis_utilisateurs, parent, false);
        return new AvisUtilisateursHolder(view, parent.getContext().getApplicationContext());
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position ) {
        ((AvisUtilisateursHolder) viewHolder).bindData(listavis.get(position));
    }

    @Override
    public int getItemCount() {
        return listavis.size();
    }

    public void setnotification () {
        this.notifyDataSetChanged();
    }
}