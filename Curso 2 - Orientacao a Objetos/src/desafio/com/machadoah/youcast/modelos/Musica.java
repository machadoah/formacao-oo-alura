package desafio.com.machadoah.youcast.modelos;

public class Musica extends Audio {

    private String album;
    private Pessoa artista;
    private String genero ;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return this.artista.getNome();
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        return (this.getTotalReproducoes() > 2000) ? 10 : 7;
    }
}
