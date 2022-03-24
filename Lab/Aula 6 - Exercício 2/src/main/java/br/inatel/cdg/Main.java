package br.inatel.cdg;

import br.inatel.cdg.cliente.Cliente;
import br.inatel.cdg.conta.Conta;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Matheus", "123567");
        Conta conta1 = new Conta();

        conta1.setCliente(c1);

        Cliente c2 = new Cliente("Zé", "83472423");
        Conta conta2 = new Conta();

        conta2.setCliente(c2);

        conta1.depositar(1000.0);
        conta1.extrato();

        conta1.sacar(450.0);
        conta1.extrato();

        conta2.depositar(1000.0);
        conta2.extrato();
    }
}
