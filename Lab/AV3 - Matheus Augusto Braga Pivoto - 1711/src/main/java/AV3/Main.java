package AV3;

import AV3.arquivos.Arquivo;
import AV3.exception.PrejuizoException;
import AV3.pedidos.Pedido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Arquivo a = new Arquivo();
        Pedido p = new Pedido();

        boolean flag = true; // Variável para controle do menu

        System.out.println("Bem vindo ao menu da Madeireira!");

        while(flag){
            System.out.println("1 - Salvar as informações no arquivo!");
            System.out.println("2 - Exibir as informações do arquivo!");
            System.out.println("3 - Ordenar os pedidos em ordem crescente de preço (mais barato ao mais caro)!");
            System.out.println("4 - Ordenar os pedidos em ordem decrescente de preço (mais caro ao mais barato)!");
            System.out.println("5 - Exibir o Lucro total da madeireira");
            System.out.println("6 - Sair!");
            System.out.println("Digite a sua escolha: ");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Digite o id do Pedido: ");
                    p.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Digite o Tipo da madeira: ");
                    p.setTipoMadeira(sc.nextLine());

                    System.out.println("Digite o preço de Produção: ");
                    p.setPrecoProducao(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Digite o preço de Venda: ");
                    try{
                        p.setPrecoVenda(sc.nextDouble());
                        sc.nextLine();
                    }catch(PrejuizoException pj){
                        pj.printStackTrace();
                        break;
                    }

                    a.escrever(p);
                    System.out.println("Pedido adicionado com sucesso!");
                    break;

                case 2:
                    ArrayList<Pedido> pedidos = a.ler();

                    for(int i = 0; i < pedidos.size(); i++){
                        System.out.println("----Pedido----");
                        System.out.println("ID do pedido: " + pedidos.get(i).getId());
                        System.out.println("Tipo de madeira: " + pedidos.get(i).getTipoMadeira());
                        System.out.println("Preço de Produção: " + pedidos.get(i).getPrecoProducao());
                        System.out.println("Preço de Venda: " + pedidos.get(i).getPrecoVenda());
                    }
                    break;

                case 3:
                    System.out.println("Exibindo a lista de pedidos por ordem crescente de preço!");
                    ArrayList<Pedido> pedidosCrescente = a.ler();
                    Collections.sort(pedidosCrescente);

                    for(int i = 0; i < pedidosCrescente.size(); i++){
                        System.out.println("----Pedido----");
                        System.out.println("ID do pedido: " + pedidosCrescente.get(i).getId());
                        System.out.println("Tipo de madeira: " + pedidosCrescente.get(i).getTipoMadeira());
                        System.out.println("Preço de Produção: " + pedidosCrescente.get(i).getPrecoProducao());
                        System.out.println("Preço de Venda: " + pedidosCrescente.get(i).getPrecoVenda());
                    }
                    break;

                case 4:
                    System.out.println("Exibindo a lista de pedidos por ordem decrescente de preço!");
                    ArrayList<Pedido> pedidosDecrescente = a.ler();
                    Collections.sort(pedidosDecrescente, Collections.reverseOrder());

                    for(int i = 0; i < pedidosDecrescente.size(); i++){
                        System.out.println("----Pedido----");
                        System.out.println("ID do pedido: " + pedidosDecrescente.get(i).getId());
                        System.out.println("Tipo de madeira: " + pedidosDecrescente.get(i).getTipoMadeira());
                        System.out.println("Preço de Produção: " + pedidosDecrescente.get(i).getPrecoProducao());
                        System.out.println("Preço de Venda: " + pedidosDecrescente.get(i).getPrecoVenda());
                    }
                    break;

                case 5:
                    double lucro = 0; // Variável para armazenar o lucro total da madeireira
                    ArrayList<Pedido> vendas = a.ler();
                    for(int i = 0; i < vendas.size(); i++){
                        lucro = lucro + (vendas.get(i).getPrecoVenda() - vendas.get(i).getPrecoProducao());
                    }
                    System.out.println("O lucro total foi de: " + lucro);
                    break;

                case 6:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        sc.close();
    }
}
