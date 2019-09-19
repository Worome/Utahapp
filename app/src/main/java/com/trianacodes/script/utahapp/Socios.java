package com.trianacodes.script.utahapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Socios extends AppCompatActivity {

    private String CargosArray [] = {"Presidente", "Vicepresidente", "Tesorero", "Secretario", "Vocal"};
    private Spinner SeleccionCargos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socios);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        SeleccionCargos = findViewById(R.id.Cargo);

        ArrayAdapter<String> adaptador_Cargos = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,CargosArray);
        SeleccionCargos.setAdapter(adaptador_Cargos);

    }
    
}
