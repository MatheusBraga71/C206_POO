package br.inatel.cdg.exercicio11.mamifero;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro Latindo");
    }

    public void mostraInfo(){
        System.out.println("Informações do Cachorro: ");
        super.mostraInfo();
    }
}
