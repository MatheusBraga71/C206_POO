package br.inatel.cdg.mamiferos;

public abstract class Mamifero implements Comparable<Mamifero>{

    protected String nome;
    protected int idade;

    public Mamifero(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
