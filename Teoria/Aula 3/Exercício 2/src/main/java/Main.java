import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de zumbis mortos nas 3 partidas!");

        Scanner entrada = new Scanner(System.in);
        int partida1 = entrada.nextInt();
        int partida2 = entrada.nextInt();
        int partida3 = entrada.nextInt();

        int soma = partida1 + partida2 + partida3;
        float media = (float)(soma/3);

        System.out.println("A soma dos Zumbis mortos é de: " + soma);
        System.out.println("A media dos Zumbis mortos é de: " + media);
    }
}
