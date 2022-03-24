package br.inatel.cdg.conta;

import br.inatel.cdg.cliente.Cliente;

public class Conta {

    private static int qtdClientes = 0;

    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        qtdClientes++;
    }

    private double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void extrato(){
        System.out.println("Saldo do cliente " + cliente.nome + ": " + saldo);
    }
}
