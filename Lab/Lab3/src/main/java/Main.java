import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // EXERCÍCIO 1:
        System.out.println("EXERCÍCIO 1:");

        System.out.println("Digite 1 para a Lógica 'E' ou 2 para a Lógica 'OU'");

        Scanner sc = new Scanner(System.in);

        int escolha = sc.nextInt();

        sc.close();

        switch(escolha){
            case 1: {
                System.out.println("0 e 0 = 0");
                System.out.println("0 e 1 = 0");
                System.out.println("1 e 0 = 0");
                System.out.println("1 e 1 = 1");
                break;
            }
            case 2: {
                System.out.println("0 e 0 = 0");
                System.out.println("0 e 1 = 1");
                System.out.println("1 e 0 = 1");
                System.out.println("1 e 1 = 1");
                break;
            }
            default:
                break;
        }

        // EXERCÍCIO 2:
        System.out.println("EXERCÍCIO 2:");


    }
}
