package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem falado no momento!");
        } else {
            System.out.println("Coloque na lista para assistir depois!");
        }
    }
}
