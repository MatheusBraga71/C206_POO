package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;

public class Jogador {

    public String nome;
    public int pontos = 0;

    public void destruirBloco(){
        pontos++;
        Bloco.qtdBlocos--;
        Bloco.qtdBlocosDestruidos++;
        System.out.println("Bloco destruído!");

        //Poderia ter usado o Bloco.numBlocos para decrementar a quantidade de blocos em jogo
        //Nesse caso não precisava ter criado o qtdBlocos.
    }
}