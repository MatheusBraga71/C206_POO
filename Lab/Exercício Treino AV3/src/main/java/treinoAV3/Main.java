package treinoAV3;

import treinoAV3.arquivo.Arquivo;
import treinoAV3.exceptions.PrecoNegativo;
import treinoAV3.jogos.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PrecoNegativo {

        Scanner sc = new Scanner(System.in);

        Arquivo a = new Arquivo();
        Jogo j = new Jogo();

        boolean flag = true;

        System.out.println("Bem-vindo ao Menu do Programa!");
        while(flag){
            System.out.println("1 - Salvar informações no arquivo.");
            System.out.println("2 - Mostrar as informações do arquivo.");
            System.out.println("3 - Ordenar os Jogos em ordem crescente de preço.");
            System.out.println("4 - Ordenar os Jogos em ordem decrescente de preço.");
            System.out.println("5 - Sair.");
            System.out.println("Digite a sua escolha: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do jogo: ");
                    j.setNome(sc.nextLine());
                    System.out.println("Digite o preço do jogo: ");
                    try{
                        double var= sc.nextDouble();
                        j.setPreco(var);
                    } catch(PrecoNegativo e){
                        e.printStackTrace();
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Digite o gênero do jogo: ");
                    j.setGenero(sc.nextLine());
                    a.escrever(j);
                    System.out.println("Jogo adicionado com sucesso!");
                    break;

                case 2:
                    ArrayList<Jogo> jogos = a.ler();

                    for(int i = 0; i < jogos.size(); i++){
                        System.out.println("-----Jogo-----");
                        System.out.println("Nome: " + jogos.get(i).getNome());
                        System.out.println("Preço: " + jogos.get(i).getPreco());
                        System.out.println("Gênero: " + jogos.get(i).getGenero());
                    }
                    break;

                case 3:
                    System.out.println("Exibindo a lista de jogos ordenada de forma crescente pelo preço:");
                    ArrayList<Jogo> jogosCrescente = a.ler();
                    Collections.sort(jogosCrescente);

                    for(int i = 0; i < jogosCrescente.size(); i++){
                        System.out.println("-----Jogo-----");
                        System.out.println("Nome: " + jogosCrescente.get(i).getNome());
                        System.out.println("Preço: " + jogosCrescente.get(i).getPreco());
                        System.out.println("Gênero: " + jogosCrescente.get(i).getGenero());
                    }
                    break;

                case 4:
                    System.out.println("Exibindo a lista de jogos ordenada de forma decrescente pelo preço:");
                    ArrayList<Jogo> jogosDecrescente = a.ler();
                    Collections.sort(jogosDecrescente, Collections.reverseOrder()); // para reverter a ordem de ordenação

                    for(int i = 0; i < jogosDecrescente.size(); i++){
                        System.out.println("-----Jogo-----");
                        System.out.println("Nome: " + jogosDecrescente.get(i).getNome());
                        System.out.println("Preço: " + jogosDecrescente.get(i).getPreco());
                        System.out.println("Gênero: " + jogosDecrescente.get(i).getGenero());
                    }
                    break;

                case 5:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;

                default:
                    System.out.println("Operação Inválida!");
                    break;
            }


        }
        sc.close();
    }
}
