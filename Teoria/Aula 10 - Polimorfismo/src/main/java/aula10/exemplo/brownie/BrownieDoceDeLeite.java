package aula10.exemplo.brownie;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.printf("Doce de leite adicionado");
    }

    @Override
    public void addCarrinhoDeCompras(int quantidade){
        System.out.println("Brownie de doce de leite adicionado ao carrinho");
        super.addCarrinhoDeCompras(quantidade);
    }
}
