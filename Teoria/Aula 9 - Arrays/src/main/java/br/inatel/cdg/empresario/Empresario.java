package br.inatel.cdg.empresario;

public class Empresario {

    private String nome;
    private long cnpj;

    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public Empresario(String nome, long cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
