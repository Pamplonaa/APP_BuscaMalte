package com.example.buscamalte.descricao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.buscamalte.CervejariasActivity.ActivityJester;
import com.example.buscamalte.R;

public class Jester extends AppCompatActivity {

    private ImageView posterJester;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jester_);


        posterJester = (ImageView)findViewById(R.id.poster1);
        posterJester.setImageResource(R.drawable.jester);


    }


    public void listaJester(View view){
        Intent intent = new Intent(this, ActivityJester.class);
        startActivity(intent);
    }
}
