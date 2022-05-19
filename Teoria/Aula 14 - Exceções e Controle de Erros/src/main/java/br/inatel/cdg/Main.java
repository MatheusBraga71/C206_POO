package br.inatel.cdg;

import br.inatel.cdg.cliente.Cliente;
import br.inatel.cdg.conta.Conta;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Cliente 1", 2342);
        Cliente c2 = new Cliente("Cliente 2", 1356);
        Cliente c3 = null;

        Conta conta = new Conta(500, 100);

        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);

        conta.mostraInfo();

        System.out.println("Final da main");
    }
}
