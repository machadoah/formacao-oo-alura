import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String nome = scanner.nextLine();
        System.out.printf("Seu filme favorito é %s!🎬\n", nome);

        System.out.printf("Digite o ano do filme %s: ", nome);
        int anoDeLancamento = scanner.nextInt();
        System.out.printf("O ano de lançamento de %s é %d\n", nome, anoDeLancamento);

        System.out.print("Digite sua nota para o filme: ");
        double avaliacao = scanner.nextDouble();
        System.out.printf("O filme %s teve seu lançamento em %d e sua nota foi de %.2f.",nome, anoDeLancamento, avaliacao);
    }
}
