package br.inatel.cdg;

import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;
import br.inatel.cdg.jogo.Conversor;

public class Main {

    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.nome = "Matheus";

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();

        j1.destruirBloco();
        j1.destruirBloco();

        System.out.println("Quantidade de blocos criados: " + Bloco.qtdBlocosTotais);
        System.out.println("Quantidade de blocos destruídos: " + Bloco.qtdBlocosDestruidos);
        System.out.println("Pontuação do jogador " + j1.nome + ": " + j1.pontos);

        System.out.println("Moedas do jogador " + j1.nome + ": " + Conversor.converte(j1.pontos));

    }
}
