import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o número de alunos da disciplina C125/C206!");

        Scanner scan = new Scanner(System.in);
        int alunos = scan.nextInt();

        scan.close();

        switch(alunos){
            case 10, 20:
                System.out.println("A sala será a I-15!");
                break;
            case 30:
                System.out.println("A sala será a I-22!");
                break;
            default:
                System.out.println("Número de alunos não é válido!");
        }
    }
}
