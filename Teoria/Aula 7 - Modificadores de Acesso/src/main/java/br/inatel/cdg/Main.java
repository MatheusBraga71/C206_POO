package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Nave nave = new Nave("Fox II", 100, "Normal");

        Asteroide asteroide = new Asteroide("Giga", "Grande");

        nave.atirar(asteroide);
    }
}
