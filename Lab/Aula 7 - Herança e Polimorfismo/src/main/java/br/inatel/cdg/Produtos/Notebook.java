package br.inatel.cdg.Produtos;

public class Notebook extends Produto{

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador){
        this.setNome(nome);
        this.setPreco(preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco(){
        String res = super.etiquetaPreco() + ", armazenamento: " + armazenamento + ", gpu: " + gpu + ", processador: " + processador;
        return res;
    }

    public void ligar(){
        System.out.println("Notebook Ligado!");
    }
}
