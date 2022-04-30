package br.inatel.cdg;

import br.inatel.cdg.carrinho.Carrinho;
import br.inatel.cdg.produto.Produto;

import javax.lang.model.element.ModuleElement;

public class Main {

    public static void main(String[] args) {

        Carrinho c = new Carrinho();

        Produto p1 = new Produto("PlayStation", 1700);
        Produto p2 = new Produto("Mesa", 400);
        Produto p3 = new Produto("Teclado", 500);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);

        System.out.println("Da forma como foi adicionado:");
        c.mostrarInfo();
        System.out.println("--------------------");

        System.out.println("Crescente:");
        c.sort(1);
        c.mostrarInfo();
        System.out.println("--------------------");

        System.out.println("Decrescente:");
        c.sort(-1);
        c.mostrarInfo();

    }
}
