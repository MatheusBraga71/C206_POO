import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numDigitado; //Variável para armazenar o número digitado

        //Geração de número aleatório
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.println("Qual foi o número gerado?");

        Scanner scan = new Scanner(System.in);

        do{
            numDigitado = scan.nextInt();

            if(numDigitado > x)
                System.out.println("O número gerado é menor que esse aí.");

            else if(numDigitado < x)
                System.out.println("O número gerado é maior que esse aí.");

            else
                System.out.println("Você acertou!!");

        }while(numDigitado != x);

        scan.close();
    }
}
