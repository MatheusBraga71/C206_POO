package br.inatel.cdg;

import br.inatel.cdg.clientes.Cliente;
import br.inatel.cdg.contas.Conta;
import br.inatel.cdg.exceptions.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) throws SaldoInsuficienteException {

        Cliente c1 = new Cliente("Cliente 1", 2342);
        Cliente c2 = new Cliente("Cliente 2", 1356);
        Cliente c3 = null;

        Conta conta = new Conta(500, 100);

        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);

        conta.mostraInfo();

        try{
            conta.sacar(250);
        } catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }

        conta.mostraInfo();

        try{
            conta.sacar(800);
        } catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }


        System.out.println("Final da main");
    }
}
