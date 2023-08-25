package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        System.out.println("""
                ***************************************************************
                                CURSO 2 - ORIENTAÇÃO A OBJETOS
                ***************************************************************
                """);

        // ************ CODIGO CURSO 2 - POO ******************

        // Instanciando filme

        Filme filmeA = new Filme("O poderoso chefão", 1970);
        filmeA.setDuracaoEmMinutos(180);
        System.out.printf(" O filme %s dura %d minutos.\n", filmeA.getNome(),filmeA.getDuracaoEmMinutos());

        filmeA.exibeFichaTecnica();
        filmeA.avalia(8);
        filmeA.avalia(5);
        filmeA.avalia(10);
        System.out.println("Total de avaliações: " + filmeA.getTotalDeAvaliacoes());
        System.out.println(filmeA.pegaMedia());

        // Instanciando série

        Serie serieA = new Serie("Lost",2000);
        serieA.exibeFichaTecnica();
        serieA.setTemporadas(10);
        serieA.setEpisodiosPorTemporada(10);
        serieA.setMinutosPorEpisodio(50);
        System.out.println("Duranção para maratonar " + serieA.getDuracaoEmMinutos());

        // Instanciando filme

        Filme filmeB = new Filme("Avatar", 2023);
        filmeB.setDuracaoEmMinutos(200);

        // Instanciando calculadora

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filmeA);
        calculadoraDeTempo.inclui(filmeB);
        calculadoraDeTempo.inclui(serieA);

        System.out.println(calculadoraDeTempo.getTempoTotal());
        System.out.println(calculadoraDeTempo.getTempoTotalHoras());

        // Instanciando Filtro

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filmeA);

        // Instanciando objeto

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieA);
        episodio.setTotalVizualizacoes(300);
        filtroRecomendacao.filtra(episodio);

        // *************** CODIGO CURSO 3 - LISTA E COLLECTIONS **********

        System.out.println("""
                ***************************************************************
                                CURSO 3 - LISTA E COLLECTIONS
                ***************************************************************
                """);

        var filmeC = new Filme("Dogville");
        filmeC.setDuracaoEmMinutos(200);
        filmeC.setAnoDeLancamento(2003);
        filmeC.avalia(10.0);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeA);
        listaFilmes.add(filmeB);
        listaFilmes.add(filmeC);

        System.out.println("Tamanho da lista " + listaFilmes.size());
        System.out.printf("Primeiro filme da lista '%s'\n",listaFilmes.get(0).getNome());

        System.out.println(listaFilmes);
        System.out.println("toString do filme: " + listaFilmes.get(0).toString());

    }

}
