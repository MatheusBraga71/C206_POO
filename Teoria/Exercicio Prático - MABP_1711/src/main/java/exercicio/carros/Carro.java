package exercicio.carros;

public abstract class Carro implements Comparable<Carro>{
    private String nome;
    private double preco;

    public Carro(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Carro o) {
        if(this.preco < o.getPreco()){
            return -1;
        }
        if(this.preco > o.getPreco()){
            return 1;
        }
        return 0;
    }
}
