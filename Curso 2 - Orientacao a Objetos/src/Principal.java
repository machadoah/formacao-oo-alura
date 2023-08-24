import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        // Instânciando um objeto
        Filme meuFilme = new Filme();

        /*
         * meuFilme.nome = "O poderoso Chefão";
         * meuFilme.anoDeLancamento = 1970;
         * meuFilme.duracaoEmMinutos = 180;
         */

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        /*
         * System.out.println(meuFilme.nome);
         * System.out.println(meuFilme.anoDeLancamento);
         */

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.printf("A média das avaliações é %.2f.", meuFilme.pegaMedia());
    }
}
