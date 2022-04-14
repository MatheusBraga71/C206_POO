package br.inatel.cdg;

import br.inatel.cdg.calculadora.Calculadora;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculadora c1 = new Calculadora();

        double num1;
        double num2;

        String operador;

        System.out.println("Esta é a sua calculadora, a operação será feita na ordem de entrada dos números!");
        do {
            System.out.println("Digite o primeiro número: ");
            num1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite a operação desejada:");
            System.out.println("+ para somar | - para subtrair | * para multiplicar | / para dividir");
            System.out.println("Caso não queria fazer nenhum outro cálculo, digite 'sair'!");
            operador = sc.nextLine();

            switch(operador){
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + c1.soma(num1, num2));

                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + c1.subtracao(num1,num2));
                    break;
                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + c1.multiplicacao(num1,num2));
                    break;
                case "/":
                    if(num2 == 0){
                        System.out.println("Não existe divisão por zero! Operação não realizada.");
                    }
                    else
                        System.out.println(num1 + " / " + num2 + " = " + c1.divisao(num1,num2));
                    break;
                case "sair":
                    System.out.println("Desligando!");
                    break;
                default:
                    System.out.println("Operação inválida, digite novamente.");
            }

        }while(!(operador.equals("sair")));

        sc.close();
    }
}
