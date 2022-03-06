public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Categoria do produto: " + categoria);
        System.out.println("Código de Série: " + codigoSerie);
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Quantidade: " + quantidade);
    }
}
