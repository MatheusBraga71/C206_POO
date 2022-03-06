public class Main {

    public static void main(String[] args) {

        //Criação de um objeto Carro
        Carro c1 = new Carro();
        c1.cor = "Preto";
        c1.marca = "Volkswagen";
        c1.modelo = "2022";
        c1.velocidadeMax = 480;
        c1.velocidadeAtual = 0;

        //Criação de um objeto Motor
        Motor motor = new Motor();
        motor.potencia = "350 cavalos";
        motor.tipo = "v8";

        c1.motor = motor;

        c1.ligar();
        c1.acelerar();
    }
}
