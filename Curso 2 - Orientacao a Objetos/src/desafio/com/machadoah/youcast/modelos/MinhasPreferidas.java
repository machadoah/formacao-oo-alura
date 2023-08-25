package desafio.com.machadoah.youcast.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.printf("'%s' é considerado sucesso absoluto!\n", audio.getTitulo());
        } else {
            System.out.printf("'%s' excelente opção!\n", audio.getTitulo());
        }
    }
}
