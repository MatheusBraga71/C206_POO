package treinoAV3.jogos;

import treinoAV3.exceptions.PrecoNegativo;

public class Jogo implements Comparable<Jogo>{

    private String nome;
    private double preco;
    private String genero;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) throws PrecoNegativo {
        if(preco <= 0){
            throw new PrecoNegativo("O preço do jogo deve ser maior que 0");
        }
        else{
            this.preco = preco;
        }
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo jogo) {
        if(this.preco < jogo.preco)
            return -1;
        else if(this.preco > jogo.preco)
            return 1;
        return 0;
    }
}
