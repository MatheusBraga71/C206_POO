package br.inatel.cdg.carros;

public class Sedan extends Carro{

    private int portaMalas;

    @Override
    public void taxa() {
        System.out.println("Esse caro tem uma daxa de 3.5% ao ano");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
        System.out.println("Valor: " + getValor());
        System.out.println("Capacidade do porta malas: " + portaMalas);
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }
}
