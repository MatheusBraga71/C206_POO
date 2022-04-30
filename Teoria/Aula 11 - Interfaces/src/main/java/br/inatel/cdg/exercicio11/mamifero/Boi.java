package br.inatel.cdg.exercicio11.mamifero;

public class Boi extends Mamifero{

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Boi mugindo!");
    }

    public void mostraInfo(){
        System.out.println("Informações do Boi: ");
        super.mostraInfo();
    }
}
