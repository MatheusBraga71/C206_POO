import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numDigitado; //Variável para armazenar o número a ser comparado

        Random rand = new Random();
        int x = rand.nextInt(10) + 1; //Variável para armazenar o número aleatório

        System.out.println("Qual foi o número gerado?");

        Scanner scan = new Scanner(System.in);
        do{
            numDigitado = scan.nextInt();
            if(numDigitado != x)
                System.out.println("Tente novamente!");

        }while(x != numDigitado);
        System.out.println("Você Acertou!!");

        scan.close();
    }
}