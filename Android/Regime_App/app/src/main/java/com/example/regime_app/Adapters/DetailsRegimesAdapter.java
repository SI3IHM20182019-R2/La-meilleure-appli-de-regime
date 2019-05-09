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
        import android.graphics.Typeface;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.v7.widget.RecyclerView;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.BaseExpandableListAdapter;
        import android.widget.Spinner;
        import android.widget.TextView;

        import com.example.regime_app.Models.JourRepas;
        import com.example.regime_app.Models.Regime;
        import com.example.regime_app.R;
        import com.example.regime_app.ViewHolders.DetailsRegimesHolder;
        import com.example.regime_app.ViewHolders.MesRegimesHolder;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

public class DetailsRegimesAdapter extends BaseExpandableListAdapter {
    private Regime regime;
    private Context context ;
    private List<String> lisheader ;
    private HashMap<String , List<JourRepas>> listhash ;

    public DetailsRegimesAdapter(Regime regime, Context context, List<String> lisheader, HashMap<String, List<JourRepas>> listhash) {
        this.regime = regime;
        this.context = context;
        this.lisheader = lisheader;
        this.listhash = listhash;
    }

    /*@NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }*/

   /* private View initView(int position ,View convertView , ViewGroup parent ){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.jour_repas , parent , false
            );}
        TextView repasmatin = (TextView) convertView.findViewById(R.id.repasmatin);
        TextView repasmidi = (TextView) convertView.findViewById(R.id.repasmidi);
        TextView repassoir = (TextView) convertView.findViewById(R.id.repassoir);

        repasmidi.setText(this.regime.getListrepas().get(0).getRepasmatin());
        repasmatin.setText(this.regime.getListrepas().get(0).getRapsmidi());
        repassoir.setText(this.regime.getListrepas().get(0).getRepassoir());

        return  convertView ;
    }*/

    @Override
    public int getGroupCount() {
        return lisheader.size() ;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listhash.get(lisheader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return lisheader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listhash.get(lisheader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headertitle =(String)getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.title , parent , false);
        }
        TextView header = (TextView) convertView.findViewById(R.id.ListHeader);
        header.setTypeface(null , Typeface.BOLD);
        header.setText((headertitle));
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final JourRepas childText = (JourRepas) getChild(groupPosition , childPosition);
        if(convertView == null ){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.jour_repas , null);
        }
        TextView repasmatin = (TextView) convertView.findViewById(R.id.repasmatin);
        TextView repasmidi = (TextView) convertView.findViewById(R.id.repasmidi);
        TextView repassoir = (TextView) convertView.findViewById(R.id.repassoir);
        repasmatin.setText(childText.getRapsmidi());
        repasmidi.setText(childText.getRepasmatin());
        repassoir.setText(childText.getRapsmidi());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
