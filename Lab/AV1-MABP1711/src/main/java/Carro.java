//MATHEUS AUGUSTO BRAGA PIVOTO 1711

public class Carro {

    String modelo;
    String cor;
    boolean alugado = false;
    Motor motor;

    public Carro(){
        motor = new Motor();
    }

    void mostraInfo(){
        System.out.print("Modelo do carro: " + modelo + "\n");
        System.out.print("Cor do carro: " + cor + "\n");
        System.out.print("Carro é alugado: " + alugado + "\n");
    }
}
