public class Main {

    public static void main(String[] args) {

        // Criando um array objeto de Produto
        Produto[] produtos = new Produto[3];
        //Instanciando os produtos
        produtos[0] = new Produto("Maionese", "Condimento", "Hellmanns", 13.50);
        produtos[1] = new Produto("Queijo", "Laticineo", "CooperRita", 14.80);

        //Criando um objeto carrinho
        Carrinho carrinho = new Carrinho();

        //Agregação de carrinho com produto
        carrinho.produtos = produtos;

        carrinho.exibirInfos();

        System.out.println("Preço total: R$" + carrinho.calculaTotal());
    }
}
