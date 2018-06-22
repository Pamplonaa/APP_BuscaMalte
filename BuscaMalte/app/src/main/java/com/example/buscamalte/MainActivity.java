package com.example.buscamalte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.buscamalte.MapsActivity.CozaLindaMapsActivity;
import com.example.buscamalte.MapsActivity.JesterMapsActivity;
import com.example.buscamalte.MapsActivity.OnTapMapsActivity;
import com.example.buscamalte.descricao.CozaLinda;
import com.example.buscamalte.descricao.Jester;
import com.example.buscamalte.descricao.OnTap;
import com.example.buscamalte.entidades.Cervejaria;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cervejaria cervejaria = Cervejaria.createCervejaria();
        ((TextView) findViewById(R.id.nome_cervejaria)).setText(cervejaria.getNome());
        ((TextView) findViewById(R.id.localizacao_cervejaria)).setText(cervejaria.getLocalizacao());


        Cervejaria cervejaria2 = Cervejaria.createCervejaria2();
        ((TextView) findViewById(R.id.nome_cervejaria2)).setText(cervejaria2.getNome());
        ((TextView) findViewById(R.id.localizacao_cervejaria2)).setText(cervejaria2.getLocalizacao());

        Cervejaria cervejaria3 = Cervejaria.createCervejaria3();
        ((TextView) findViewById(R.id.nome_cervejaria3)).setText(cervejaria3.getNome());
        ((TextView) findViewById(R.id.localizacao_cervejaria3)).setText(cervejaria3.getLocalizacao());

    }

    public void listaOnTap(View view) {
        Intent intent = new Intent(this, OnTap.class);
        startActivity(intent);
    }


    public void listaJester(View view) {
        Intent intent = new Intent(this, Jester.class);
        startActivity(intent);
    }

    public void listaCozaLinda(View view) {
        Intent intent = new Intent(this, CozaLinda.class);
        startActivity(intent);
    }



    //MAPS
    public void viewMapOnTap(View view){
        Intent intent = new Intent(this, OnTapMapsActivity.class);
        startActivity(intent);
    }

    public void viewMapJester(View view){
        Intent intent = new Intent(this, JesterMapsActivity.class);
        startActivity(intent);
    }

    public void viewMapCozaLinda(View view){
        Intent intent = new Intent(this, CozaLindaMapsActivity.class);
        startActivity(intent);
    }
}
