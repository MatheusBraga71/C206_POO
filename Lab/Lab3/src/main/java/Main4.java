import java.util.Scanner;

public class Main4 {
    public static final int SENHA = 2002; //Constante com o valor da senha.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int digit; //Variável para armazenar o valor digitado

        System.out.println("Digite a senha:");

        do {
            digit = scan.nextInt();

            if(digit != SENHA)
                System.out.println("Senha Inválida");

        }while(digit != SENHA);

        System.out.println("Acesso Permitido");

        scan.close();
    }
}
