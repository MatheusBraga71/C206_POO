import java.util.Scanner;
import static java.lang.Math.*;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Digite o seu peso:");
        Scanner scan = new Scanner(System.in);
        float peso = scan.nextFloat();

        System.out.println("Digite a sua altura em centímetros:");
        float altura = scan.nextInt();

        scan.close();

        float alturam = altura/100;

        double imc = peso/(pow(alturam, 2));

        if(imc <= 18.5)
            System.out.println("Abaixo do peso");
        else if(imc >= 18.6 && imc <= 24.9)
            System.out.println("Peso ideal (parabéns)");
        else if(imc >= 25.0 && imc <= 29.9)
            System.out.println("Levemente acima do peso");
        else if(imc >= 30.0 && imc <= 34.9)
            System.out.println("Obesidade grau I");
        else if(imc >= 35.0 && imc <= 39.9)
            System.out.println("Obesidade grau II (severa)");
        else
            System.out.println("Obesidade III (mórbida)");

    }
}
