import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numDigitado;

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.println("Qual foi o número gerado?");

        numDigitado = entrada.nextInt();
        while(x != numDigitado) {
            if(numDigitado > x){
                System.out.println("O número gerado é menor que esse aí.");
            }
            else{
                System.out.println("O número gerado é maior que esse aí.");
            }
            numDigitado = entrada.nextInt();
        }

        System.out.println("Você acertou!!");
    }
}
