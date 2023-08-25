package desafio.com.machadoah.youcast.teste;

import desafio.com.machadoah.youcast.modelos.MinhasPreferidas;
import desafio.com.machadoah.youcast.modelos.Musica;
import desafio.com.machadoah.youcast.modelos.Pessoa;
import desafio.com.machadoah.youcast.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoaA = new Pessoa();
        pessoaA.setNome("Emicida");

        Musica musicaA = new Musica();
        musicaA.setTitulo("Levanta e anda");
        musicaA.setAlbum("O glorioso retorno de quem nunca esteve aqui");
        musicaA.setGenero("RAP");
        musicaA.setArtista(pessoaA);

        for (int i = 0; i < 100; i++) {
            musicaA.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musicaA.curte();
        }

        Pessoa pessoaB = new Pessoa();
        pessoaB.setNome("Jovem Tranquilão");

        Podcast podcast = new Podcast();
        podcast.setTitulo("Bolha Dev");
        podcast.setHost(pessoaB);
        podcast.setDescricao("Podcast de Tecnologia!");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas mp = new MinhasPreferidas();
        mp.inclui(musicaA);
        mp.inclui(podcast);

    }
}
