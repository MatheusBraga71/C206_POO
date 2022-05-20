package br.inatel.cdg.contas;

import br.inatel.cdg.clientes.Cliente;
import br.inatel.cdg.clientes.Cliente;
import br.inatel.cdg.exceptions.SaldoInsuficienteException;

import java.util.HashSet;
import java.util.Set;

public class Conta {

    private double saldo;
    private double limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void sacar(double quantia) throws SaldoInsuficienteException {
        if(saldo >= quantia) {
            this.saldo -= quantia;
            System.out.println("Saque efetuado");
        }
        else
            throw new SaldoInsuficienteException("Saldo insuficiente!");
    }

    public void mostraInfo(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for(Cliente cliente : clientes){
            try{
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            }catch(NullPointerException e){
                System.out.println("Não existe cliente nessa posição!");
            }
        }
    }
}
