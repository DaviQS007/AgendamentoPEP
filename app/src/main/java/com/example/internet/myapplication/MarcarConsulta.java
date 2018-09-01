package com.example.internet.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MarcarConsulta extends AppCompatActivity {

    String [] LISTAESPECIALIDADES = {"Cardiologia", "Pediatria"};
    String [] LISTACAMPUS = {"Memorial", "Vila Prudente", "Vila Maria", "Vergueiro", "Santo Amaro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcar_consulta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, LISTAESPECIALIDADES);
        MaterialBetterSpinner betterSpinner = (MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner);
        betterSpinner.setAdapter(ArrayAdapter);

        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, LISTACAMPUS);
        MaterialBetterSpinner betterSpinner2 = (MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner2);
        betterSpinner.setAdapter(ArrayAdapter);
    }

}
