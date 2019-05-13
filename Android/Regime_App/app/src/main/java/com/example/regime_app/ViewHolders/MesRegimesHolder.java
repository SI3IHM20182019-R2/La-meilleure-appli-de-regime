package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Adapters.MesRegimesAdapter;
import com.example.regime_app.DetailsRegimeActivity;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

import java.util.List;

public class MesRegimesHolder extends RecyclerView.ViewHolder {
    private Context context;

    private TextView title ;
    private TextView description ;
    private ImageView imageregime ;
    private ImageView switcher ;
    private ImageButton deleteimage ;
    private TextView voirdetails ;

    public MesRegimesHolder(@NonNull View itemView, Context context) {
        super(itemView);
        title = (TextView)itemView.findViewById(R.id.title);
        description = (TextView)itemView.findViewById(R.id.description);
        switcher = (ImageButton) itemView.findViewById(R.id.switcher);
        imageregime = (ImageView) itemView.findViewById(R.id.imageregime);
        deleteimage = (ImageButton) itemView.findViewById(R.id.deleteimage);
        voirdetails =(TextView)itemView.findViewById(R.id.Viewdetails);
        this.context = context;
    }

    public void bindData(final Regime regime , final List<Regime> regimes , final List<Regime> regimeactuel , final MesRegimesAdapter ad) {
        //imageregime.setImageResource(context.getResources().getIdentifier(regime.getImageName(), "drawable", context.getPackageName()));
        Bitmap bit = BitmapFactory.decodeResource(context.getResources() , context.getResources().getIdentifier(regime.getImageName(), "drawable", context.getPackageName())) ;
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(context.getResources() , bit) ;
        roundedBitmapDrawable.setCircular(true);
        imageregime.setImageDrawable(roundedBitmapDrawable);
        if (regimes.size()>1 ){
            switcher.setImageResource(R.drawable.subtitue);
        }else {
            switcher.setImageResource(android.R.color.transparent);
        }
        title.setText(regime.getNom());
        description.setText(regime.getDescription());
        deleteimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regimes.remove(regime );
                ad.setnotification();
            }
        });
        voirdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , DetailsRegimeActivity.class ) ;
                intent.putExtra("regime" , regime) ;
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
                context.startActivity(intent) ;
            }
        });
        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regimeactuel.clear();
                regimeactuel.add(regime);
                regimes.remove(regime );
                ad.setnotification();
            }
        });

    }
}
