package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

public class MesRegimesHolder extends RecyclerView.ViewHolder {
    private Context context;

    private TextView title ;
    private TextView description ;
    private ImageView imageregime ;
    private ImageButton deleteimage ;

    public MesRegimesHolder(@NonNull View itemView, Context context) {
        super(itemView);
        title = (TextView)itemView.findViewById(R.id.title);
        description = (TextView)itemView.findViewById(R.id.description);
        imageregime = (ImageView) itemView.findViewById(R.id.imageregime);
        deleteimage = (ImageButton) itemView.findViewById(R.id.deleteimage);
        this.context = context;
    }

    public void bindData(final Regime regime) {
        imageregime.setImageResource(context.getResources().getIdentifier(regime.getImageName(), "drawable", context.getPackageName()));
        title.setText(regime.getNom());
        description.setText(regime.getDescription());

    }
}
