public class Carrinho {

    double total = 0;
    Produto[] produtos;

    void exibirInfos(){
        for (int i = 0, produtosLength = produtos.length; i < produtosLength; i++) {
            if (produtos[i] != null) {
                Produto produto = produtos[i];
                System.out.println(produto.nome);
                System.out.println(produto.descricao);
                System.out.println(produto.fabricante);
                System.out.println(produto.preco);
            }
        }
    }
    double calculaTotal(){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null) {
                Produto produto = produtos[i];
                total += produto.preco;
            }
        }
        return total;
    }
}
