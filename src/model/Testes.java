package model;

public class Testes {

    public static void realizarTestes(){
        Testes testes = new Testes();

        try {
            testes.teste1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            testes.teste2();
        } catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());;
        }
        try {
            testes.teste3();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }
        try {
            testes.teste4();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }
        try {
            testes.teste5();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }
        try {
            testes.teste6();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }
    }

    public void teste1(){

        Cliente cliente = new Cliente("Cliente1", 30);
        Servico servico = new Servico("Servico1", 15);

        Transacao.RealizarTransacao(cliente, servico);

    }

    public void teste2(){

        Cliente cliente = new Cliente("Cliente2", 10);
        Servico servico = new Servico("Servico2", 15);

        Transacao.RealizarTransacao(cliente, servico);

    }

    public void teste3(){

        Cliente cliente = new Cliente("Cliente3", 15);
        Servico servico = new Servico("Servico3", 15);

        Transacao.RealizarTransacao(cliente, servico);

    }

    public void teste4(){
        Cliente cliente = new Cliente("Cliente3", 15);
        Servico servico = new Servico("Servico3", -15);

        Transacao.RealizarTransacao(cliente, servico);

    }

    public void teste5(){
        Cliente cliente = new Cliente("Cliente3", 15);
        Servico servico = new Servico("Servico3", 15);

        cliente.setSaldo(-15);

        Transacao.RealizarTransacao(cliente, servico);

    }

    public void teste6(){
        Cliente cliente = new Cliente("Cliente3", 15);
        Servico servico = new Servico("Servico3", 15);

        servico.setPreco(-15);

        Transacao.RealizarTransacao(cliente, servico);

    }

}
