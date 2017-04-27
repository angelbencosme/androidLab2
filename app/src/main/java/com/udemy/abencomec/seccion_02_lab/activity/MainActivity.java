package com.udemy.abencomec.seccion_02_lab.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.udemy.abencomec.seccion_02_lab.R;
import com.udemy.abencomec.seccion_02_lab.adapter.FrutaAdaptaer;
import com.udemy.abencomec.seccion_02_lab.entity.Fruta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvFrutas;
    private List<Fruta> frutas;
    private FrutaAdaptaer frutaAdaptaer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fruta f = new Fruta();
        frutaAdaptaer = new FrutaAdaptaer();
        frutaAdaptaer.setLayout(R.layout.list_item);
        frutaAdaptaer.setContext(this);
        frutas = new ArrayList<>();

        Fruta fruta = new Fruta();
        fruta.setNombre("Manzana");
        fruta.setIcon(R.drawable.apple96);

        frutas.add(fruta);
        frutaAdaptaer.setFrutas(frutas);
        lvFrutas = (ListView)  findViewById(R.id.lvFruta);



    }
}
