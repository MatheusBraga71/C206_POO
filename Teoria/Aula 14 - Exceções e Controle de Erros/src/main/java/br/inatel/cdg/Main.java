package br.inatel.cdg;

import br.inatel.cdg.cliente.Cliente;
import br.inatel.cdg.conta.Conta;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Cliente 1", 2342);
        Cliente c2 = new Cliente("Cliente c2", 1356);
        Cliente c3 = null;

        Conta conta1 = new Conta(500, 100, c1);
        Conta conta2 = new Conta(300, 100, c2);
        Conta conta3 = new Conta(700, 100, c3);

        conta1.mostraInfo();
        conta2.mostraInfo();
        conta3.mostraInfo();

        System.out.println("Final da main");
    }
}
