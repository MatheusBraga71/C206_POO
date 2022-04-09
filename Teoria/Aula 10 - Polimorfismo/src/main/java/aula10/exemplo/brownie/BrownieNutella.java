package aula10.exemplo.brownie;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.printf("Nutella adicionada");
    }

    @Override
    public void addCarrinhoDeCompras(int quantidade){
        System.out.println("Brownie de nutella adicionado ao carrinho");
        super.addCarrinhoDeCompras(quantidade);
    }
}
