package com.udemy.abencomec.seccion_02_lab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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




        }

        return null;
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

    public void setContext(Context context) {
        this.context = context;
    }
    static class ViewHolder {
        private TextView nameTextView;
    }
}

