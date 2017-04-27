package com.udemy.abencomec.seccion_02_lab.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udemy.abencomec.seccion_02_lab.R;
import com.udemy.abencomec.seccion_02_lab.entity.Fruta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fruta f = new Fruta();

    }
}
