package br.inatel.cdg;

import br.inatel.cdg.calculadora.Calculadora;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculadora c1 = new Calculadora();

        double num1 = 0;
        double num2 = 0;

        boolean error;

        String choice = "S";

        System.out.println("Esta é a sua calculadora, a operação será feita na ordem de entrada dos números!");
        do {
            String operador;
            error = false;
            try {
                System.out.println("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = sc.nextDouble();
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println("Só é permitida a entrada de números.");
                System.out.println("O processo será encerrado!");
                sc.nextLine();
                error = true;
            }

            if(error == false) {
                System.out.println("Digite a operação desejada:");
                System.out.println("+ para somar | - para subtrair | * para multiplicar | / para dividir");

                operador = sc.nextLine();

                switch (operador) {
                    case "+":
                        System.out.println(num1 + " + " + num2 + " = " + c1.soma(num1, num2));

                        break;
                    case "-":
                        System.out.println(num1 + " - " + num2 + " = " + c1.subtracao(num1, num2));
                        break;
                    case "*":
                        System.out.println(num1 + " * " + num2 + " = " + c1.multiplicacao(num1, num2));
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Não existe divisão por zero! Operação não realizada.");
                        } else
                            System.out.println(num1 + " / " + num2 + " = " + c1.divisao(num1, num2));
                        break;
                    default:
                        System.out.println("Operação inválida.");
                }

                System.out.println("Deseja continuar calculando? S ou N");
                choice = sc.nextLine();
            }


        }while(choice.equals("S") && !(error));

        sc.close();
    }
}
