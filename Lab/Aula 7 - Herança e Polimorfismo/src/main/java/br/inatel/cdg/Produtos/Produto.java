package br.inatel.cdg.Produtos;

public class Produto {

    private String nome;
    private double preco;

    public String etiquetaPreco(){
        String res ="Nome: " + nome + ", preço: " + preco;
        return res;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
