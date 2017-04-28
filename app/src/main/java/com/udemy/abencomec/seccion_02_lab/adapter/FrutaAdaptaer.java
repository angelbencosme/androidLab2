package com.udemy.abencomec.seccion_02_lab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udemy.abencomec.seccion_02_lab.R;
import com.udemy.abencomec.seccion_02_lab.entity.Fruta;

import java.util.List;

/**
 * Created by abencomec on 4/27/2017.
 */

public class FrutaAdaptaer extends BaseAdapter {
    private List<Fruta> frutas;
    private Context context;
    private int layout;

    @Override
    public int getCount() {
        return frutas.size();
    }

    @Override
    public Object getItem(int position) {
        return frutas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(layout,null);

            holder = new ViewHolder();
            //holder.imageView.setImageDrawable();
            holder.nameTextView = (TextView) convertView.findViewById(R.id.txtNombre);
            holder.origenTextView = (TextView) convertView.findViewById(R.id.txtOrigen);
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }else {
           holder = (ViewHolder) convertView.getTag();

        }
        holder.nameTextView.setText(frutas.get(position).getNombre());
        holder.origenTextView.setText(frutas.get(position).getOrigen());
        holder.imageView.setImageResource(frutas.get(position).getIcon());
        return convertView;
    }
    public void addFruta(Fruta fruta){
       frutas.add(fruta);
    }

    public List<Fruta> getFrutas() {
        return frutas;
    }

    public void setFrutas(List<Fruta> frutas) {
        this.frutas = frutas;
    }

    public Context getContext() {
        return context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    static class ViewHolder {
        private TextView nameTextView;
        private TextView origenTextView;
        private ImageView imageView;

    }
}

