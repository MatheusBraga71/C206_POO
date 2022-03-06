public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    boolean ligado = false;

    Motor motor;

    void ligar(){
        ligado  = true;
        System.out.println("Carro ligado!");
    }

    void acelerar(){
        if(ligado == true){
            if(velocidadeAtual <= velocidadeMax) {
                velocidadeAtual++;
                System.out.println(velocidadeAtual);
            }
        }
    }

    @Override
    public String toString(){
        return "Cor: " + this.cor + ", Marca: " + this.marca +
                ", Modelo: " + this.modelo + ", VelocidadeMax: " + this.velocidadeMax+
                ", Motor: " + this.motor;
    }
}
