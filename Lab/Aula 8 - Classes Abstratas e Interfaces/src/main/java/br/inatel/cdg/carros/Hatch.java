package br.inatel.cdg.carros;

public class Hatch extends Carro{

    private int portas;

    @Override
    public void taxa() {
        System.out.println("Esse caro tem uma daxa de 2% ao ano");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
        System.out.println("Valor: " + getValor());
        System.out.println("Numero de portas: " + portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
