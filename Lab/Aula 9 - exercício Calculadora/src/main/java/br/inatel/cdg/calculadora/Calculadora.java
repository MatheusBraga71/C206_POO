package br.inatel.cdg.calculadora;

import br.inatel.cdg.exception.DivisaoPorZeroException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

    public double soma(double a, double b){
        return a+b;
    }

    public double subtracao(double a, double b){
        return a-b;
    }

    public double multiplicacao(double a, double b){
        return a*b;
    }

    public double divisao(double a, double b) throws DivisaoPorZeroException {
            if(b == 0){
                throw new DivisaoPorZeroException("Não é possível realizar divisão por zero!");
            }
            else
            {
                return a/b;
            }
    }
}
