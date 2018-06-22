package com.example.buscamalte.descricao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.buscamalte.CervejariasActivity.ActivityCozaLinda;
import com.example.buscamalte.R;

public class CozaLinda extends AppCompatActivity {

    private ImageView posterCozaLinda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coza_linda);


        posterCozaLinda = (ImageView)findViewById(R.id.poster1);
        posterCozaLinda.setImageResource(R.drawable.cozalinda);


    }


    public void listaCozaLinda(View view){
        Intent intent = new Intent(this, ActivityCozaLinda.class);
        startActivity(intent);
    }
}
