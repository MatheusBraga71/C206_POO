package br.inatel.cdg.Calculadora;

public class Calculadora {

    private static int qtdVezesUsada =0 ;

    public static int getQtdVezesUsada() {
        return qtdVezesUsada;
    }

    public static final double pi = 3.14; //final indica que o valor é constante  Final = Const

    public static double circunferencia(double raio){
        qtdVezesUsada++;
        return pi*(raio*raio);
    }

    public static double volume(double raio){
        qtdVezesUsada++;
        return (4.0/3.0)*pi*(raio*raio*raio);
    }
}
//this é usado para instanciar atributos de objetos, para o static ele não vai funcionar
