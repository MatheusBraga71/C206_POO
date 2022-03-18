package br.inatel.cdg.conta;

public class Conta {

    private int qtdClientes;
    private double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void extrato(){
        System.out.println("Saldo = " saldo);
    }
}
