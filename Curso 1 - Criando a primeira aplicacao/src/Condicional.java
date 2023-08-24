import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        int ano = 2022;

        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        String tipoPlano = "normal";

        if(ano >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme antigo! mas vale a pena assistir!");
        }

        if(incluidoNoPlano || tipoPlano.equalsIgnoreCase("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

    }
}
