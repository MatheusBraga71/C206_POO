package br.inatel.cdg.exercicio11.mamifero;

import br.inatel.cdg.exercicio11.interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Lontra fazendo barulho");
    }

    @Override
    public void nadar(){
        System.out.println("Lontra nadando!");
    }

    public void mostraInfo(){
        System.out.println("Informações da Lontra: ");
        super.mostraInfo();
    }
}
