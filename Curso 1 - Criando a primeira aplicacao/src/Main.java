public class Main {

    public static void stars(int classificacao){
        System.out.print("Classificação: ");
        for (int i = 1; i <= 5; i ++){
            if(classificacao >= i){
                System.out.print("⭐");
            } else {
                System.out.print("✳");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento do filme: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas 3 notas da Jack, do Paulo e do Antonio
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de lançamento: %d
                """.formatted(anoDeLancamento);
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);

        /*
        System.out.print("Classificação: ");
        for (int i = 1; i <= 5; i ++){
            if(classificacao >= i){
                System.out.print("⭐");
            } else {
                System.out.print("✳");
            }
        }*/

        stars((int) media/2);

    }
}
