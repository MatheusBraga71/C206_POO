public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Queijo";
        p1.categoria = "Laticíneo";
        p1.codigoProduto = "123f456";
        p1.codigoSerie = 4546;
        p1.quantidade = 450;

        Produto p2 = new Produto();
        p2.nome = "Suco";
        p2.categoria = "Bebida";
        p2.codigoProduto = "456h123";
        p2.codigoSerie = 4356;
        p2.quantidade = 750;

        p1.mostraInfo();
        p2.mostraInfo();

    }
}
