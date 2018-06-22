package com.example.buscamalte.entidades;

public class CorpoCervejaria {
    private String titulo;
    private String horarios;
    private String telefone;
    private boolean favorito;
    private int poster;
    private String endereco;
    private String video;
    private String descricao;


    public boolean isFavorito() {
        return favorito;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getVideo(){
        return video;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPoster() {
        return poster;
    }

    public String getHorarios(){
        return horarios;
    }

    public void setHorarios(String horarios){
        this.horarios = horarios;
    }
    public void setFavorito(boolean favorito){
        this.favorito = favorito;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
