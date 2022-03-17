package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){

        if(ast.getTipoAsteroide().equals("Grande") && tipoTiro.equals("Explosivo")){
            ast.destruir();
        }
        else if(ast.getTipoAsteroide().equals("Pequeno") && tipoTiro.equals("Normal")){
            ast.destruir();
        }
        else if(ast.getTipoAsteroide().equals("Pequeno") && tipoTiro.equals("Explosivo")){
            ast.destruir();
        }
        else
            System.out.println("Tiro não foi capaz de destruir o asteróide!");

    }
}
