package com.example.buscamalte.entidades;

public class Cervejaria {

    private String nome;
    private String localizacao;

    public static Cervejaria createCervejaria(){
        Cervejaria cervejaria = new Cervejaria();
        cervejaria.setLocalizacao("São José");
        cervejaria.setNome("OnTap");
        
        return cervejaria;
    }
    public static Cervejaria createCervejaria2(){
        Cervejaria cervejaria = new Cervejaria();
        cervejaria.setLocalizacao("Águas Mornas");
        cervejaria.setNome("Jester");

        return cervejaria;
    }
    public static Cervejaria createCervejaria3(){
        Cervejaria cervejaria = new Cervejaria();
        cervejaria.setLocalizacao("Florianópolis");
        cervejaria.setNome("Coza Linda");

        return cervejaria;
    }


    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
