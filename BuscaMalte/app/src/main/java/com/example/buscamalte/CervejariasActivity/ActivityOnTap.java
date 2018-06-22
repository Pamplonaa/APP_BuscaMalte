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

public class ActivityOnTap extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, CompoundButton.OnCheckedChangeListener {
    private static final String API_KEY = "AIzaSyDdUoICBGaIvptF-rartEVV3GlOzJwfaZ8";
    private String ID_VIDEO_ONTAP = "SeZ2FMpp09k";
    private YouTubePlayerView youtube;
    private CorpoCervejaria cervejariaOnTap;
    private CheckBox favorito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ontap);


        this.cervejariaOnTap = Arquivos.getCervejariaOnTap();
        ((TextView) findViewById(R.id.titulo_cervejariaOnTap)).setText(cervejariaOnTap.getTitulo());
        ((TextView) findViewById(R.id.horarios_cervejariaOnTap)).setText(cervejariaOnTap.getHorarios());
        ((TextView) findViewById(R.id.telefone_cervejariaOnTap)).setText(cervejariaOnTap.getTelefone());
        ((TextView) findViewById(R.id.endereco_cervejariaOnTap)).setText(cervejariaOnTap.getEndereco());
        ((TextView) findViewById(R.id.descricao_cervejariaOnTap)).setText(cervejariaOnTap.getDescricao());
        ((ImageView) findViewById(R.id.posterOnTap)).setImageResource(cervejariaOnTap.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.cervejariaOnTap.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_ONTAP);
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
                this.cervejariaOnTap.setFavorito(isChecked);
                break;
        }
    }
}
