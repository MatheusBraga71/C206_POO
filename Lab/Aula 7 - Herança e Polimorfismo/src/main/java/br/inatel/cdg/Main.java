package br.inatel.cdg;

import br.inatel.cdg.Produtos.Camiseta;
import br.inatel.cdg.Produtos.Notebook;
import br.inatel.cdg.Produtos.Produto;

public class Main {

    public static void main(String[] args) {

        Camiseta c1 = new Camiseta("Confortável", 25.0, "Preto", "G");
        Notebook n1 = new Notebook("Avell", 10000, 256, "GeForce GTX1650", "Intel Core i7");

        Produto[] produtos = new Produto[2];

        produtos[0] = c1;
        produtos[1] = n1;

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] != null){
                System.out.println(produtos[i].etiquetaPreco());
                if(produtos[i] instanceof Notebook){ //Fazendo um Downcasting, pois a função ligar() só existe em Notebook
                    Notebook n = (Notebook)produtos[i];
                    n.ligar();
                }
            }
        }
    }
}
