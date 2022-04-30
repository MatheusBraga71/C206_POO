package br.inatel.cdg.carrinho;

import br.inatel.cdg.produto.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Carrinho{

    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public void mostrarInfo(){
        produtos.forEach(produto -> { //mesma coisa que o for comum, mas mais curto kk
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
        });
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void sort(int order){
        if(order == 1){
            Collections.sort(produtos);
        }
        else if(order == -1){
            Collections.reverse(produtos);
        }
        else{
            System.out.println("Operação inválida!");
        }
    }
}
