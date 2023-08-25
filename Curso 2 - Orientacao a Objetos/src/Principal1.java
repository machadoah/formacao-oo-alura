import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal1 {

    public static void main(String[] args) {

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        Filme filme1 = new Filme();
        filme1.setDuracaoEmMinutos(180);
        filme1.avalia(10);
        filme1.avalia(10);

        Filme filme2 = new Filme();
        filme2.setDuracaoEmMinutos(100);
        filme2.avalia(5);
        filme2.avalia(5);
        filme2.avalia(5);

        Filme filme3 = new Filme();
        filme3.setDuracaoEmMinutos(200);

        Filme filme4 = new Filme();
        filme4.setDuracaoEmMinutos(180);

        Serie lost = new Serie();
        lost.setMinutosPorEpisodio(50);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);

        calculadoraDeTempo.inclui(filme1);
        calculadoraDeTempo.inclui(filme2);
        calculadoraDeTempo.inclui(filme3);
        calculadoraDeTempo.inclui(filme4);
        calculadoraDeTempo.inclui(lost);

        System.out.println(calculadoraDeTempo.getTempoTotal());

        System.out.printf("""
                São necessárias %.2f horas para maratonar os filmes!
                """,calculadoraDeTempo.getTempoTotalHoras());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);

        System.out.print("Episodio de Lost: " +
                "--> ");
        filtro.filtra(episodio);
    }




}
