package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme filmeA = new Filme("O poderoso chefão", 1970);
        filmeA.avalia(9);

        Filme filmeB = new Filme("Avatar", 2023);
        filmeB.avalia(6);

        var filmeC = new Filme("Dogville", 2003);
        filmeC.avalia(10);

        Serie serieA = new Serie("Lost", 2000);

        Filme f1 = filmeC; // O mesmo objetos é apontado por f1 e filmeC

        // Generics --> <Tipo>
        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeA);
        lista.add(filmeB);
        lista.add(filmeC);
        lista.add(serieA);

        for (Titulo item : lista) {
            System.out.print(item.getNome());

            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(" --> Classificação" + filme.getClassificacao());
            }
            // Filme filme = (Filme) item;

        }

        System.out.println("""
                
                ***************************************************************
                                ORDENAÇÃO DE ARRAY LISTS
                ***************************************************************
                
                """);

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo Silveira");
        buscaPorArtista.add("Jacqueline Oliveira");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        // Lista ordenada por ordem alfabética!
        System.out.println(buscaPorArtista);

        // Ordenação da lista, atraves do CompareTo!
        Collections.sort(lista);
        System.out.println(lista);

        // Uso de Streams
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
