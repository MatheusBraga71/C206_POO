package br.inatel.cdg.mercadoria;

public class Geladeira extends Mercadoria {

    private int quantidadePortas;
    private int tamanho;
    private String tipo;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println("Tamanho: " + tamanho + " Litros");
        System.out.println("Tipo: " + tipo);
    }
}
