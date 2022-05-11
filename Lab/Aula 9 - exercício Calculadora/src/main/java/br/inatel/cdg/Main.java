package br.inatel.cdg;

import br.inatel.cdg.calculadora.Calculadora;
import br.inatel.cdg.exception.DivisaoPorZeroException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculadora c1 = new Calculadora();

        double num1 = 0;
        double num2 = 0;

        String flag;
        String operador;
        double res;

        System.out.println("Esta é a sua calculadora, a operação será feita na ordem de entrada dos números!");

        String escolha;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a operação desejada -> Soma = +; Subt = -; Mult = *; Div = /");
        operador = sc.nextLine();


            switch (operador) {
                case "+":
                    res = c1.soma(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + res);
                    break;

                case "-":
                    res = c1.subtracao(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + res);
                    break;
                case "*":
                    res = c1.multiplicacao(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + res);
                    break;
                case "/":
                    try {
                        res = c1.divisao(num1, num2);
                        System.out.println(num1 + " / " + num2 + " = " + res);
                    } catch (Throwable t) {
                        System.out.println(t);
                    }
                    break;

                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        sc.close();
    }
    }

