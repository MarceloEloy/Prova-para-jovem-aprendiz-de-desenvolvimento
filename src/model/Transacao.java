package model;

public class Transacao {

    public static void RealizarTransacao(Cliente cliente, Servico servico){

        if (servico.getPreco() <= 0){
            throw new RuntimeException("Erro: preço do serviço ("+ servico.getPreco() + ") não deve ser inferior a 1");
        }

        if (cliente.getSaldo() >= servico.getPreco()){
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("Saldo inicial do cliente: %d %n", cliente.getSaldo());
            cliente.setSaldo(cliente.getSaldo() - servico.getPreco());
            System.out.printf("Foram pagos %d da conta do cliente %s por consumo do serviço %s %n", servico.getPreco(), cliente.getNomeCliente(), servico.getNomeServico());
        } else if (cliente.getSaldo() < servico.getPreco()) {
            if (cliente.getSaldo() < 0){
                cliente.setSaldo(0);
            }
            throw new RuntimeException("Erro: saldo do cliente (" + cliente.getSaldo() + ") não pode ser inferior a "+ servico.getPreco());
        };

        System.out.printf("Saldo final do cliente: %d %n", cliente.getSaldo());
        System.out.println("-----------------------------------------------------------------");
    }

}
