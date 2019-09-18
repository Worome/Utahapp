package com.trianacodes.script.utahapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    public void llamadaMenu(View view){

        Intent socios = new Intent(this,Socios.class);
        startActivity(socios);
        Toast.makeText(this, "Llamada a una activity",Toast.LENGTH_SHORT).show();

    }

}
