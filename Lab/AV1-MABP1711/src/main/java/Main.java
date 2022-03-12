//MATHEUS AUGUSTO BRAGA PIVOTO 1711
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float porcentagemCarros; //Variável para alocação da porcentagem de carros disponíveis

        Locadora locadora = new Locadora();
        System.out.print("Digite o nome da locadora: ");
        locadora.nome = sc.nextLine();
        System.out.print("Digite o CNPJ da locadora: ");
        locadora.CNPJ = sc.nextLine();
        System.out.print("Digite o endereço da locadora: ");
        locadora.endereco = sc.nextLine();

        Carro c1 = new Carro();
        System.out.println("Digite o modelo do carro: ");
        c1.modelo = sc.nextLine();
        System.out.println("Digite a cor do carro: ");
        c1.cor = sc.nextLine();
        System.out.println("Digite a velocidade máxima: ");
        c1.motor.velocidadeMaxima = sc.nextFloat();
        sc.nextLine();

        Carro c2 = new Carro();
        System.out.println("Digite o modelo do carro: ");
        c2.modelo = sc.nextLine();
        System.out.println("Digite a cor do carro: ");
        c2.cor = sc.nextLine();
        System.out.println("Digite a velocidade máxima: ");
        c2.motor.velocidadeMaxima = sc.nextFloat();
        sc.nextLine();

        Carro c3 = new Carro();
        System.out.println("Digite o modelo do carro: ");
        c3.modelo = sc.nextLine();
        System.out.println("Digite a cor do carro: ");
        c3.cor = sc.nextLine();
        System.out.println("Digite a velocidade máxima: ");
        c3.motor.velocidadeMaxima = sc.nextFloat();
        sc.nextLine();

        Carro c4 = new Carro();
        System.out.println("Digite o modelo do carro: ");
        c4.modelo = sc.nextLine();
        System.out.println("Digite a cor do carro: ");
        c4.cor = sc.nextLine();
        System.out.println("Digite a velocidade máxima: ");
        c4.motor.velocidadeMaxima = sc.nextFloat();
        sc.nextLine();

        //Adicionando os carros à locadora
        locadora.adicionarCarro(c1);
        locadora.adicionarCarro(c2);
        locadora.adicionarCarro(c3);
        locadora.adicionarCarro(c4);

        //mostrando informações
        locadora.mostraInfo();

        porcentagemCarros = locadora.contarCarrosParaAlugar();
        System.out.print("Porcentagem de carros disponíveis: " + porcentagemCarros + "% \n");

        locadora.alugarCarro(1); //Alugando o carro 1

        porcentagemCarros = locadora.contarCarrosParaAlugar();
        System.out.print("Porcentagem de carros disponíveis: " + porcentagemCarros + "% \n");

        sc.close();
    }
}
