package br.inatel.cdg.cliente;

public class Cliente {

    private String nome;
    private int cpf;

    public Cliente(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

}
