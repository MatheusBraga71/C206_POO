package br.inatel.cdg.bloco;

import br.inatel.cdg.jogador.Jogador;

public class Bloco {

    public static int qtdBlocos = 0;
    public static int qtdBlocosTotais = 0;
    public static int qtdBlocosDestruidos = 0;

    public Bloco(){
        qtdBlocos++;
        qtdBlocosTotais++;
    }

}