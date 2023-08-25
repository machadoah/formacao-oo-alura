package desafio.com.machadoah.youcast.modelos;

public class Podcast extends Audio {
    private Pessoa host;
    private String descricao;

    public String getHost() {
        return this.host.getNome();
    }

    public void setHost(Pessoa host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        return (this.getTotalCurtidas() > 500) ? 10 : 8;
    }
}
