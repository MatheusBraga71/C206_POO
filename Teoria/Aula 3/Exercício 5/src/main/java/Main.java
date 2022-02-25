import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numDigitado;

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.println("Qual foi o número gerado?");

        do{
            numDigitado = entrada.nextInt();

        }while(x != numDigitado);
        System.out.println("Você Acertou!!");
    }
}
