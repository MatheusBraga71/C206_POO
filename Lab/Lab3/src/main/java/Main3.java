import java.util.Scanner;
import static java.lang.Math.pow;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a; //Primeiro Número
        float b; //Segundo Número
        int x; //Variável para armazenar a escolha de operação

        System.out.println("Digite 2 números:");

        // Leitura de dados
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Digite '1' para soma, '2' para subtração, " +
                "'3' para multiplicação, '4' para divisão, ou '5' para exponencial:");
        x = scan.nextInt();

        scan.close();

        // Saídas
        switch(x)
        {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(pow(a, b));
                break;
            default:
                System.out.println("Opção não permitida");
        }
    }
}
