package com.example.buscamalte.descricao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.buscamalte.CervejariasActivity.ActivityOnTap;
import com.example.buscamalte.R;

public class OnTap extends AppCompatActivity {

    private ImageView posterOnTap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_tap);


        posterOnTap = (ImageView)findViewById(R.id.poster1);
        posterOnTap.setImageResource(R.drawable.ontap);


    }


    public void listaJester(View view){
        Intent intent = new Intent(this, ActivityOnTap.class);
        startActivity(intent);
    }
}

