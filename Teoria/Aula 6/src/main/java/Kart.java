public class Kart {

    String nome;

    Motor motor;
    Piloto piloto;

    public Kart(){
       motor = new Motor();
    }

    public void pular(){
        System.out.println("Kart " + nome + " está pulando!");
    }

    public void soltarTurbo(){
        System.out.println("Kart " + nome + " está soltando turbo! ");
    }

    public void fazerDrift(){
        System.out.println("Kart " + nome + " está fazendo drift!");
    }
}
