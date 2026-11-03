import model.Cliente;
import model.Servico;
import model.Testes;
import model.Transacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String resposta;
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Servico servico = new Servico();

        System.out.println("Deseja começar uma operação entre cliente e serviço? (s/n)");
        resposta = sc.next();
        if (resposta.toLowerCase().strip().equals("s")) {

            System.out.println("Digite o nome do cliente:");
            cliente.setNomeCliente(sc.next().strip());
            System.out.println("Digite o saldo do cliente:");
            cliente.setSaldo(sc.nextInt());

            System.out.println("Digite o nome do serviço:");
            servico.setNomeServico(sc.next().strip());
            System.out.println("Digite o preço do serviço:");
            servico.setPreco(sc.nextInt());

            Transacao.RealizarTransacao(cliente, servico);
        };

        System.out.println("Deseja começar testes? (s/n)");
        resposta = sc.next();
        if (resposta.toLowerCase().strip().equals("s")) {
            Testes.realizarTestes();
        };
        sc.close();
    };
}