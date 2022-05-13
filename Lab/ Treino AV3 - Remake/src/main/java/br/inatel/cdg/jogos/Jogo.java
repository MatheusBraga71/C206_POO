package br.inatel.cdg.jogos;

import br.inatel.cdg.exceptions.PrecoNegativoException;

public class Jogo implements Comparable<Jogo>{

    private String nome;
    private double preco;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoNegativoException {
        if (preco <= 0) {
            throw new PrecoNegativoException("O preço do jogo deve ser maior que 0!");
        }
        else
            this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo o) {
        if(this.preco < o.getPreco())
            return -1;
        if(this.preco > o.getPreco())
            return 1;
        return 0;
    }
}
