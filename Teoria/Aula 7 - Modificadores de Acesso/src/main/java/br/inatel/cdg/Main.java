package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Nave nave = new Nave("Fox II", 100, "Normal");

        Asteroide asteroide1 = new Asteroide("Giga", "Pequeno");
        Asteroide asteroide2 = new Asteroide("Mega", "Grande");
        Asteroide asteroide3 = new Asteroide("Giga", "Pequeno");

        nave.atirar(asteroide1);
        nave.atirar(asteroide2);
        nave.atirar(asteroide3);

        nave.setTipoTiro("Explosivo");

        nave.atirar(asteroide2);
    }
}
