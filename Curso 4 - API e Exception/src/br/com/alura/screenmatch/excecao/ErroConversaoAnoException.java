package br.com.alura.screenmatch.excecao;

public class ErroConversaoAnoException extends NumberFormatException {

    private String mensagem;
    public ErroConversaoAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
