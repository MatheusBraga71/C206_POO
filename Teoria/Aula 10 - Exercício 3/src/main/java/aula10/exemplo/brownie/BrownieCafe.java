package aula10.exemplo.brownie;

public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Café adicionado!!");
    }

    @Override
    public void addCarrinhoDeCompras(int quantidade){
        System.out.println("Brownie de café adicionado ao carrinho");
        super.addCarrinhoDeCompras(quantidade);
    }
}
