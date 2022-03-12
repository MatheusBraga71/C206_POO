package br.inatel.cdg;

import br.inatel.cdg.matematica.Calculo;
import br.inatel.cdg.matematica.Matematica;

//import br.inatel.cdg.matematica.*; Comando para importar tudo de dentro do pacote

public class Main {
    public static void main(String[] args) {

        //fully qualified name - nome completo da classe
        // método complexo de se fazer, por isso importamos o pacote com a classe
        // br.inatel.cdg.matematica.Matematica matematica = new br.inatel.cdg.matematica.Matematica();

        Matematica matematica = new Matematica();

        //usando a outra classe, que possui o mesmo nome
        br.inatel.cdg.outramatematica.Matematica matematica2 = new br.inatel.cdg.outramatematica.Matematica();

        //importamos a que será mais usada, para facilitar na porgramação

        Calculo calculo = new Calculo();

    }
}
