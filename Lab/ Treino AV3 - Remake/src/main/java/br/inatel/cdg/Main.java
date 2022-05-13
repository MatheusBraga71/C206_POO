package br.inatel.cdg;

import br.inatel.cdg.arquivos.Arquivo;
import br.inatel.cdg.exceptions.PrecoNegativoException;
import br.inatel.cdg.jogos.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Arquivo a = new Arquivo();
        Jogo j = new Jogo();

        boolean flag = true;
        int escolha;

        System.out.println("Bem vindo ao menu do Programa!");

        while(flag){
            System.out.println("1 - Salvar as informações no arquivo.");
            System.out.println("2 - Mostrar as informações do arquivo.");
            System.out.println("3 - Ordenar os jogos por ordem crescente de preço.");
            System.out.println("4 - Ordenar os jogos por ordem descrescente de preço.");
            System.out.println("5 - Sair.");
            System.out.println("Digite a opção desejada:");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do Jogo: ");
                    j.setNome(sc.nextLine());

                    System.out.println("Digite o preço do Jogo: ");
                    try{
                        j.setPreco(sc.nextDouble());
                        sc.nextLine();
                    } catch(PrecoNegativoException pn){
                        pn.printStackTrace();
                        break;
                    }

                    System.out.println("Digite o gênero do Jogo: ");
                    j.setGenero(sc.nextLine());
                    a.escrever(j);
                    break;
                case 2:
                    ArrayList<Jogo> jogos = a.ler();

                    for(int i = 0; i < jogos.size(); i++){
                        System.out.println("---Jogo---");
                        System.out.println("Nome: " + jogos.get(i).getNome());
                        System.out.println("Preço: " + jogos.get(i).getPreco());
                        System.out.println("Gênero: " + jogos.get(i).getGenero());
                    }
                    break;
                case 3:
                    System.out.println("Exibindo os jogos do mais barato ao mais caro!");
                    ArrayList<Jogo> jogosCrescente = a.ler();

                    Collections.sort(jogosCrescente);

                    for(int i = 0; i < jogosCrescente.size(); i++){
                        System.out.println("---Jogo---");
                        System.out.println("Nome: " + jogosCrescente.get(i).getNome());
                        System.out.println("Preço: " + jogosCrescente.get(i).getPreco());
                        System.out.println("Gênero: " + jogosCrescente.get(i).getGenero());
                    }
                    break;
                case 4:
                    System.out.println("Exibindo os jogos do mais caro ao mais barato!");
                    ArrayList<Jogo> jogosDecrescente = a.ler();

                    Collections.sort(jogosDecrescente);

                    for(int i = 0; i < jogosDecrescente.size(); i++){
                        System.out.println("---Jogo---");
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
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}
