package model;

public class Cliente {

    public Cliente(String nome, Integer saldo){

        if(saldo >= 0) {
            this.saldo = saldo;
        }else{
            throw new RuntimeException("Saldo do cliente deve ser maior ou igual a 0");
        }
        this.nomeCliente = nome;

    }

    public Cliente(){
    }

    private Integer saldo;

    private String nomeCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
