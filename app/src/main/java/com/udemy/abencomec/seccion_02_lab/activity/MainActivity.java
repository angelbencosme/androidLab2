package com.udemy.abencomec.seccion_02_lab.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListView;

import com.udemy.abencomec.seccion_02_lab.R;
import com.udemy.abencomec.seccion_02_lab.adapter.FrutaAdaptaer;
import com.udemy.abencomec.seccion_02_lab.entity.Fruta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvFrutas;
    private GridView gvFrutas;
    private List<Fruta> frutas;
    private FrutaAdaptaer frutaAdaptaer;
    boolean lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frutaAdaptaer = new FrutaAdaptaer();
        frutaAdaptaer.setLayout(R.layout.grid_item);
        frutaAdaptaer.setContext(this);

        frutaAdaptaer.setFrutas(iniciarFrutas());
        lista = false;

        //lvFrutas = (ListView) findViewById(R.id.lvFruta);
        //lvFrutas.setAdapter(frutaAdaptaer);
        //lvFrutas.setVisibility(false);

        gvFrutas = (GridView) findViewById(R.id.gvFrutas);
        gvFrutas.setAdapter(frutaAdaptaer);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.action_bar_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.add_item:
                Fruta fruta = new Fruta();
                fruta.setNombre("Desconocido");
                fruta.setOrigen("Desconocido");
                fruta.setIcon(R.drawable.grapes96);
                frutaAdaptaer.addFruta(fruta);
                frutaAdaptaer.notifyDataSetChanged();
                return true;
            case R.id.changeLVGV:
                if (lista == false) {
                    gvFrutas.setNumColumns(1);
                    frutaAdaptaer.setLayout(R.layout.list_item);
                    frutaAdaptaer.notifyDataSetChanged();
                    lista = true;
                } else {
                    gvFrutas.setNumColumns(3);
                    frutaAdaptaer.setLayout(R.layout.grid_item);
                    frutaAdaptaer.notifyDataSetChanged();
                    lista = false;
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }


    private List<Fruta> iniciarFrutas() {

        List<Fruta> frutas = new ArrayList<>();
        Fruta fruta = new Fruta();

        fruta = new Fruta();
        fruta.setNombre("Manzana");
        fruta.setOrigen("Asia central");
        fruta.setIcon(R.drawable.apple96);
        frutas.add(fruta);

        fruta = new Fruta();
        fruta.setNombre("Banana");
        fruta.setOrigen("África");
        fruta.setIcon(R.drawable.banana96);
        frutas.add(fruta);

        fruta = new Fruta();
        fruta.setNombre("Aguacate");
        fruta.setOrigen("México");
        fruta.setIcon(R.drawable.avocado96);
        frutas.add(fruta);

        fruta = new Fruta();
        fruta.setNombre("Cereza");
        fruta.setOrigen("Giresun");
        fruta.setIcon(R.drawable.cherry96);
        frutas.add(fruta);

        fruta = new Fruta();
        fruta.setNombre("Limon");
        fruta.setOrigen("Sureste asiático");
        fruta.setIcon(R.drawable.citrus80);
        frutas.add(fruta);

        fruta = new Fruta();
        fruta.setNombre("Pitahaya");
        fruta.setOrigen("México");
        fruta.setIcon(R.drawable.dragonfruit96);
        frutas.add(fruta);

        return frutas;
    }
}
