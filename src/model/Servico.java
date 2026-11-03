package model;

public class Servico {

    public Servico(String nome, Integer preco){

        if (preco > 0) {
            this.preco = preco;
        }else {
            throw new RuntimeException("Preço do serviço deve ser maior que 0");
        }
        this.nomeServico = nome;
    }

    public Servico(){

    };

    private Integer preco;

    private String nomeServico;

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
}
