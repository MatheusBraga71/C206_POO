package projeto.oficina;

import projeto.oficina.DAO.*;
import projeto.oficina.carros.Carro;
import projeto.oficina.documentos.Documento;
import projeto.oficina.dono.Dono;
import projeto.oficina.funcionario.Mecanico;
import projeto.oficina.manutencao.Manutencao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MecanicoDAO mDAO = new MecanicoDAO();

        System.out.println("Bem vindo ao menu!");
        System.out.println("Digite o seu nome: ");
        String nomeAux = sc.nextLine();
        System.out.println("Digite o seu CPF: ");
        String cpfAux = sc.nextLine();

        Mecanico m1 = new Mecanico(cpfAux, nomeAux);
        mDAO.inserirMecanico(m1);

        boolean flag = true;
        int escolha1;

        CarroDAO cDAO = new CarroDAO();
        DocumentoDAO docDAO = new DocumentoDAO();
        DonoDAO dDAO= new DonoDAO();
        ManutencaoDAO manDAO = new ManutencaoDAO();
        CarroHasManutencaoDAO cmDAO = new CarroHasManutencaoDAO();

        while(flag){
            System.out.println("1 - Inserir um novo carro");
            System.out.println("2 - Realizar uma busca");
            System.out.println("3 - Inserir uma manutenção");
            System.out.println("4 - Remover um carro");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada:");
            escolha1 = sc.nextInt();

            switch (escolha1){
                case 1:
                    //CarroDAO cDAO = new CarroDAO();
                    System.out.println("Insira o Número do Chassi do carro: ");
                    int chassi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira a cor do carro: ");
                    String ano = sc.nextLine();
                    System.out.println("Insira o modelo do carro: ");
                    String modelo = sc.nextLine();

                    //DocumentoDAO docDAO = new DocumentoDAO();
                    System.out.println("Insira o renavam do carro: ");
                    int renavamAux = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o ano do veículo: ");
                    int anoAux = sc.nextInt();
                    sc.nextLine();
                    Documento docAux = new Documento(renavamAux, anoAux);
                    docDAO.inserirDocumento(docAux);

                    //DonoDAO dDAO= new DonoDAO();
                    System.out.println("Insira o nome do dono do carro: ");
                    String nomeDonoAux = sc.nextLine();
                    System.out.println("Insira o cpf do dono: ");
                    String cpfDonoAux = sc.nextLine();

                    Dono donoAux = new Dono(nomeDonoAux, cpfDonoAux);
                    dDAO.inserirDono(donoAux);

                    Carro carroAux = new Carro(chassi, ano, modelo, renavamAux, cpfDonoAux, m1.getCpf());
                    cDAO.inserirCarro(carroAux);

                    break;

                case 2:
                    int escolhaBusca;
                    int buscaAux;
                    System.out.println("1 - Realizar uma busca geral (todos os dados de todos os carros)");
                    System.out.println("2 - Realizar um busca personalizada (todos os dados de um carro específico)");
                    System.out.println("3 - Realizar a busca dos dados do dono de um carro");
                    System.out.println("4 - Realizar a busca de todos os problemas");
                    System.out.println("5 - Realizar a busca dos problemas de um carro específico");
                    System.out.println("Digite a sua escolha: ");
                    escolhaBusca = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaBusca){
                        case 1:
                            cDAO.buscarCarrosSemFiltro();
                            cmDAO.buscarManutencaoSemFiltro();
                            break;
                        case 2:
                            System.out.println("Digite o número do chassi do carro desejado: ");
                            buscaAux = sc.nextInt();
                            sc.nextLine();
                            cDAO.buscarCarroPorNumeroDoChassi(buscaAux);
                            cmDAO.buscarManutencoesDoCarro(buscaAux);
                            break;
                        case 3:
                            System.out.println("Digite o número do chassi do carro desejado: ");
                            buscaAux = sc.nextInt();
                            sc.nextLine();
                            cDAO.buscarDadosDoDono(buscaAux);
                            break;
                        case 4:
                            cmDAO.buscarManutencaoSemFiltro();
                            break;
                        case 5:
                            System.out.println("Digite o numero do Chassi do carro desejado: ");
                            int manChassi = sc.nextInt();
                            sc.nextLine();

                            cmDAO.buscarManutencoesDoCarro(manChassi);
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Qual carro necessita de manutenção? (Insira o Número do Chassi)");
                    int numChassiAux = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o número da manutenção do carro: ");
                    int idAux = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o status da manutenção do carro: ");
                    String statusAux = sc.nextLine();
                    System.out.println("Insira o problema: ");
                    String problemaAux = sc.nextLine();
                    Manutencao manAux = new Manutencao(idAux, statusAux, problemaAux);
                    manDAO.inserirManutencao(manAux);

                    cmDAO.inserirManutencao(numChassiAux, manAux);

                    break;

                case 4:
                    System.out.println("Digite o número do chassi do carro desejado: ");
                    int deleteAux = sc.nextInt();
                    sc.nextLine();
                    cDAO.deletarCarro(deleteAux);
                    break;

                case 5:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }
        sc.close();
        /*
        CarroDAO cDAO = new CarroDAO();

        Carro carro = new Carro(12345, "Preto", "Sport");

        DonoDAO dDAO = new DonoDAO();

        Dono d1 = new Dono();
        d1.setCpf("123456");
        d1.setNome("João");

        Dono d2 = new Dono();
        d2.setCpf("12");
        d2.setNome("45");

        cDAO.buscarCarrosSemFiltro();



        //carro.setDono_cpf(d1.getCpf());

        //dDAO.inserirDono(d1);


        //cDAO.inserirCarro(carro);


        //dDAO.buscarDonoPorCPF("3");

        //dDAO.atualizarDono("123456",d2);

        //dDAO.deletarDono("566768");

        */

    }
}
