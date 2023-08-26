package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalEscrita {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() // imprimir bonitinho!
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.print("Digite o nome de um filme: ");
            busca = scanner.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            var endereco = "http://www.omdbapi.com/?t=%s&apikey=e43780bb".formatted(busca.toLowerCase().replace(" ", "+"));
            System.out.println(endereco);

            try{

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();


                TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo titulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(titulo);

                titulos.add(titulo);

            } catch (NumberFormatException e){
                System.out.println("Aconteceu um erro: ");
                System.out.print(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Algum erro de argumento na busca.");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titulos));
        writer.close();

        System.out.println("Programa finalizado com sucesso!");
    }
}
