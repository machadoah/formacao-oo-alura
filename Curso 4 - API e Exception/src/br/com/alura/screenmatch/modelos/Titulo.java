package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroConversaoAnoException;

public class Titulo implements Comparable<Titulo>{

    // @SerializedName("Name")
    // é uma anotação que referencia o nome que vem no Json!
    // Para 'Title' apontar para 'nome'
    // > @SerializedName("Title")
    private String nome;

    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // Construtor que recebe nome e ano
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // construtor que padrão
    public Titulo(){}

    // construtor que recebe nome
    public Titulo(String nome){
        this.setNome(nome);
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroConversaoAnoException("Não consegui converter o ano: Mais de 04 algarismos.");
        }

        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3).trim());
    }

    public void exibeFichaTecnica(){
        String fichaTecnica = """
                Nome do filme: %s
                Ano de lançamento: %d 
                """.formatted(nome,anoDeLancamento);

        System.out.println(fichaTecnica);
    }

    public void avalia(double nota){
        this.somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return (somaAvaliacoes/totalDeAvaliacoes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        // Define o critério de comparação entre classes
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return ("(nome: %s, " +
                "ano de Lançamento: %d, " +
                "tempo de duração: %d)").formatted(this.getNome(), this.getAnoDeLancamento(), this.getDuracaoEmMinutos());
    }
}
