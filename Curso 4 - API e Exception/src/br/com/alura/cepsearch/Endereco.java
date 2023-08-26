package br.com.alura.cepsearch;

public record Endereco (String cep,
                        String logradouro,
                        String complemento,
                        String bairro,
                        String localidade,
                        String uf){

    // Cabeçalhos do JSON fornecido pelo ViaCep

}
