package com.example.buscamalte.entidades;

import com.example.buscamalte.R;

public class Arquivos {

    private static CorpoCervejaria cervejariaOnTap;
    private static CorpoCervejaria cervejariaJester;
    private static CorpoCervejaria cervejariaCozaLinda;


    public static CorpoCervejaria getCervejariaOnTap(){
        if(cervejariaOnTap == null){
            cervejariaOnTap = createCervejariaOnTap();
        }
        return cervejariaOnTap;
    }
    public static CorpoCervejaria getCervejariaJester(){
        if(cervejariaJester == null){
            cervejariaJester = createCervejariaJester();
        }
        return cervejariaJester;
    }
    public static CorpoCervejaria getCervejariaCozaLinda(){
        if(cervejariaCozaLinda == null){
            cervejariaCozaLinda = createCervejariaCozaLinda();
        }
        return cervejariaCozaLinda;
    }

    public static CorpoCervejaria createCervejariaOnTap(){
        CorpoCervejaria cervejaria1 = new CorpoCervejaria();
        cervejaria1.setTitulo("OnTap Cervejaria Artesanal");
        cervejaria1.setHorarios("Horários :"+"sexta-feira 10:00-23:00; " +
                "sábado 09:00-18:00; " +
                "domingo fechado; " +
                "segunda-feira fechado; " +
                "terça-feira 10:00-19:00; " +
                "quarta-feira 10:00-19:00; " +
                "quinta-feira 10:00-23:00");
        cervejaria1.setTelefone("(48) 3066-6066");
        cervejaria1.setFavorito(false);
        cervejaria1.setPoster(R.drawable.ontap);
        cervejaria1.setEndereco("Endereço :"+"R. Waldemar Silveira de Souza, 92 -" +
                " Fazenda Santo Antônio, São José - SC, 88104-680");
        cervejaria1.setDescricao("Descrição :"+"On Tap Cervejaria Artesanal oferece o que há de" +
                " melhor no mercado de cervejas especiais. ");

        return cervejaria1;
    }

    public static CorpoCervejaria createCervejariaJester(){
        CorpoCervejaria cervejaria = new CorpoCervejaria();
        cervejaria.setTitulo("Cervejaria Jester");
        cervejaria.setHorarios("Horários :"+"sexta-feira 09:00-18:00; " +
                "sábado fechado; " +
                "domingo fechado; " +
                "segunda-feira 09:00-18:00; " +
                "terça-feira 09:00-18:00; " +
                "quarta-feira 09:00-18:00; " +
                "quinta-feira 09:00-18:00");
        cervejaria.setTelefone("(48) 98409-8784");
        cervejaria.setFavorito(false);
        cervejaria.setPoster(R.drawable.jester);
        cervejaria.setEndereco("Endereço :"+"Rodovia BR 282, Águas Mornas - SC, 88150-000");
        cervejaria.setDescricao("Descrição :"+"O nome Jester está associado ao palhaço animador " +
                "das festas nos Castelos Medievais,\n" +
                "que representa exatamente a alegria e os momentos festivos nos quais" +
                " são degustadas\n" +
                "nossas cervejas artesanais em um ambiente histórico. ");

        return cervejaria;
    }
    public static CorpoCervejaria createCervejariaCozaLinda() {
        CorpoCervejaria cervejaria = new CorpoCervejaria();
        cervejaria.setTitulo("Coza Bar / CozaLinda");
        cervejaria.setHorarios("Horários :" + "sexta-feira 19:00-01:30; " +
                "sábado 19:00-01:30; " +
                "domingo fechado; " +
                "segunda-feira 19:00-23:30; " +
                "terça-feira 19:00-23:30; " +
                "quarta-feira 19:00-23:30; " +
                "quinta-feira 19:00-23:30");
        cervejaria.setTelefone("(48) 99164-9292");
        cervejaria.setFavorito(false);
        cervejaria.setPoster(R.drawable.cozalinda);
        cervejaria.setEndereco("Endereço :" + "2406, R. Des. Pedro Silva - Coqueiros," +
                " Florianópolis - SC, 88080-701");
        cervejaria.setDescricao("Descrição :" + "Cozalinda é a cervejaria que nasceu em Floripa." +
                " Produz cervejas gostosas e refrescantes como as praias, e tão mágicas como as " +
                "histórias da idade.");

        return cervejaria;
    }


}
