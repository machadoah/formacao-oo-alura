package desafio;

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         *  ** TO-DO **
         *
         * [X] Inicializar dados do cliente
         * [X] Menu de opções
         * [X] Vizualização dos dados
         * [X] Envia valor
         * [X] Recebe valor
         *
         */

        // Inicializar dados do cliente

        String nome = "Sheldon Cooper";
        String tipoConta = "Corrente";
        double saldo = 0.0;

        String dados = """
                ****************************************************
                Dados iniciais do cliente:
                                
                Nome:\t\t\t %s
                Tipo Conta:\t\t %s
                Saldo inicial:\t R$ %.2f
                ****************************************************
                """.formatted(nome, tipoConta, saldo);

        System.out.println(dados);

        // Menu de opções

        int opcao = 0;

        String menu = """
                Digite a ação a ser realizada:
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                Digite uma opção:
                """;

        while(opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O saldo em conta é de R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Inira o valor que ira enviar: ");
                    double valor = scanner.nextDouble();

                    if(valor <= saldo){
                        saldo -=valor;

                        System.out.println("O saldo foi atualizado para R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para realizar a transferencia.");
                    }
                    break;
                case 3:
                    System.out.print("Inira o valor que ira receber: ");
                    valor = scanner.nextDouble();

                    saldo += valor;

                    System.out.println("Saldo atualizado para R$" + saldo);
                    break;
                case 4:
                    System.out.println("Tchau, tchau! muito obrigado!");
                    opcao = 4;
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }

        }

    }

}
