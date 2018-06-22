package com.example.buscamalte.CervejariasActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.buscamalte.R;
import com.example.buscamalte.entidades.Arquivos;
import com.example.buscamalte.entidades.CorpoCervejaria;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ActivityCozaLinda extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, CompoundButton.OnCheckedChangeListener {
    private static final String API_KEY = "AIzaSyDdUoICBGaIvptF-rartEVV3GlOzJwfaZ8";
    private String ID_VIDEO_COZALINDA = "SeZ2FMpp09k";
    private YouTubePlayerView youtube;
    private CorpoCervejaria cervejariaCozaLinda;
    private CheckBox favorito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cozalinda);


        this.cervejariaCozaLinda = Arquivos.getCervejariaOnTap();
        ((TextView) findViewById(R.id.titulo_cervejariaCozaLinda)).setText(cervejariaCozaLinda.getTitulo());
        ((TextView) findViewById(R.id.horarios_cervejariaCozaLinda)).setText(cervejariaCozaLinda.getHorarios());
        ((TextView) findViewById(R.id.telefone_cervejariaCozaLinda)).setText(cervejariaCozaLinda.getTelefone());
        ((TextView) findViewById(R.id.endereco_cervejariaCozaLinda)).setText(cervejariaCozaLinda.getEndereco());
        ((TextView) findViewById(R.id.descricao_cervejariaCozaLinda)).setText(cervejariaCozaLinda.getDescricao());
        ((ImageView) findViewById(R.id.posterCozaLinda)).setImageResource(cervejariaCozaLinda.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.cervejariaCozaLinda.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_COZALINDA);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
        Toast.makeText(this,"onInitializationFailure()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.favorito:
                this.cervejariaCozaLinda.setFavorito(isChecked);
                break;
        }
    }
}
