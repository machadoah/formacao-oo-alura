import br.com.alura.screenmatch.modelos.Serie;

public class Principal2 {

    public static void main(String[] args) {

        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);

        serie.exibeFichaTecnica();

        int duracao = serie.getDuracaoEmMinutos();
        System.out.println("Duração da maratona de Lost: " + duracao + " minutos.");
    }
}
