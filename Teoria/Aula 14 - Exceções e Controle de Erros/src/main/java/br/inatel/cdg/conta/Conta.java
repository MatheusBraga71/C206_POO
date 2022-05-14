package br.inatel.cdg.conta;

import br.inatel.cdg.cliente.Cliente;

import java.util.HashSet;
import java.util.Set;

public class Conta {

    private double saldo;
    private double limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(double saldo, double limite, Cliente cliente){
        this.saldo = saldo;
        this.limite = limite;
        clientes.add(cliente);
    }

    public boolean sacar(double quantia){
        this.saldo -= quantia;
        return false;
    }

    public void mostraInfo(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for(Cliente cliente : clientes){
            try{
                System.out.println(cliente);
            }catch(NullPointerException e){
                System.out.println(e);
            }
        }
    }
}
