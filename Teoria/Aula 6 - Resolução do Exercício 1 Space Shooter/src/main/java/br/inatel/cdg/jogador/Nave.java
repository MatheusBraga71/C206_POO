package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome,double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(tipoTiro.equals("Explosivo")){
            ast.destruir();
        }
        else{
            if(ast.getTipoAsteroide().equals("Grande"))
                System.out.println("Nave de tiro normal não destrói asteróide grande");
            else
                ast.destruir();
        }
    }
}
