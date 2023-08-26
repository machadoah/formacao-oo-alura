package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.excecao.ErroConversaoAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um filme: ");
        var name = scanner.nextLine();

        var endereco = "http://www.omdbapi.com/?t=%s&apikey=e43780bb".formatted(name.toLowerCase().replace(" ", "+"));

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        var json = response.body();
        //System.out.println(json);

        /*
         * --> mvnrepository.com <--
         *
         * Plataforma para pesquisa de bibliotecas,
         * o Gson é utilizado para reverter Json em Objeto
         * e o inverso também.
         *
         * *************************************************
         *
         * File > Proect Structure > Modules > Dependences ✅
         *
         */

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        // Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        try {
            Titulo titulo = new Titulo(meuTituloOmdb);
            System.out.println(titulo);

            FileWriter fileWriter = new FileWriter("filmes.txt");
            fileWriter.write(titulo.toString());
            fileWriter.close();
        }
        /*
        catch (NumberFormatException e){
            System.out.print("Aconteceu uma exceção 💣🧨!: ");
            System.out.println(e.getMessage());
        }
        */

        catch (ErroConversaoAnoException e) {
            System.out.println("Ano incorreto! ");
        } finally {

            System.out.println("""
                    ********************************************
                                 PROGRAMA FINALIZADO!
                    ********************************************
                    """);
        }
    }
}
