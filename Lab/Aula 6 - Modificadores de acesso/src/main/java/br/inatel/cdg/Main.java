package br.inatel.cdg;

import br.inatel.cdg.Calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {

        double raio = 6.0;

        System.out.println("Valor da circunferência de raio " + raio + ": " + Calculadora.circunferencia(raio));

        System.out.println("Valor da volume de raio " + raio + ": " + Calculadora.volume(raio));

        System.out.println("Quantidade de vezes que a calculadora foi usada: " + Calculadora.getQtdVezesUsada() );
    }
}
