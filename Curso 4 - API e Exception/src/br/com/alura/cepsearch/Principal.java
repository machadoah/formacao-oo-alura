package br.com.alura.cepsearch;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.print("Insira um CEP no formato (XXXXXXXX): ");
        Scanner scanner = new Scanner(System.in);

        var cep = scanner.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);

            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }
    }
}
