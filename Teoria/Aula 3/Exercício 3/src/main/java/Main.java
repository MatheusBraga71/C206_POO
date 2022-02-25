import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a nota da NPA!");

        Scanner entrada = new Scanner(System.in);
        float NPA = entrada.nextFloat();

        if(NPA >= 60) {
            System.out.println("Você está aprovado! :)");
        }
        else{
            System.out.println("Digite a nota da NP3!");

            float NP3 = entrada.nextFloat();
            float media = (NPA + NP3)/2;

            if(media >= 50){
                System.out.println("Você está aprovado! :)");
            }
            else{
                System.out.println("Você está Reprovado! :(");
            }
        }
    }

}
