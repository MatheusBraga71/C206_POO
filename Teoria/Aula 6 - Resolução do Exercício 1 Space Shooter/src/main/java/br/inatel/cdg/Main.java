package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Asteroide asteroide1 = new Asteroide("Asteróide I", "Pequeno");
        Asteroide asteroide2 = new Asteroide("Asteróide II", "Grande");
       // Asteroide asteroide3 = new Asteroide("Asteróide III", "Pequeno");

        Nave nave = new Nave("Nave I", 100.0, "Normal");
        Nave nave2 = new Nave("Nave II", 200.0, "Explosivo");

        nave.atirar(asteroide1); //Destroi o asteroide
        nave.atirar(asteroide2); //não consegue destruir

        nave2.atirar(asteroide1); //Destroi o asteroide
        nave2.atirar(asteroide2); //Destroi o asteroide
    }
}