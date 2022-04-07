package aula10.exemplo.brownie;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    private  double total = 0;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(int qtd){
        System.out.println("Brownie adicionado!!");
        total += qtd*preco;
    }

    public void calculaValorTotalCompra(){
        System.out.println("Valor da compra de " + nome + ": " + total);
    }

    public void mostraInfo(){
        System.out.println("Nome do brownie: " + nome);
        System.out.println("Preço do brownie: " + preco);
        System.out.println("Sabor do brownie: " + sabor);
    }
}
