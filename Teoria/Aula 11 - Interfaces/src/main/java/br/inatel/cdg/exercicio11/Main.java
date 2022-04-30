package br.inatel.cdg.exercicio11;

import br.inatel.cdg.exercicio11.mamifero.Boi;
import br.inatel.cdg.exercicio11.mamifero.Cachorro;
import br.inatel.cdg.exercicio11.mamifero.Lontra;
import br.inatel.cdg.exercicio11.mamifero.Mamifero;

public class Main {

    public static void main(String[] args) {

        Mamifero c = new Cachorro("Cachorro", 200);
        Mamifero l = new Lontra("Lontra", 100);
        Mamifero b = new Boi("Boi", 100);

        c.mostraInfo();
        c.emitirSom();
        System.out.println("");
        l.mostraInfo();
        l.emitirSom();
        System.out.println("");
        b.mostraInfo();
        b.emitirSom();

    }
}


