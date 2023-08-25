package desafio;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.print("Digite a descricao da compra: ");
            String descricao = sc.next();

            System.out.print("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao,valor);
            boolean compraEfetuada = cartao.lancaCompra(compra);

            if(compraEfetuada){
                System.out.println("Compra realizada!");
                System.out.print("Digite 0 para sair e 1 para continuar: ");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("""
                
                ======================================================
                ******************************************************
                                   COMPRAS REALIZADAS:
                ******************************************************
                
                """);

        Collections.sort(cartao.getCompras());

        for (Compra c: cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("Saldo do cartão = R$" + cartao.getSaldo() );

        System.out.println("""
                
                ******************************************************
                            MUITO OBRIGADO E VOLTE SEMPRE!
                ******************************************************
                ======================================================
                """);

    }
}
