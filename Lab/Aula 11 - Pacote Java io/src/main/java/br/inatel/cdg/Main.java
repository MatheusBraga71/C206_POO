package br.inatel.cdg;

import br.inatel.cdg.arquivos.Arquivo;
import br.inatel.cdg.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Inicializando o scanner
        Arquivo a = new Arquivo(); // Instanciando um arquivo
        Funcionario f = new Funcionario(); // Instanciando um funcionario

        boolean flag = true; // flag para auxliar no menu

        while(flag){
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Sair");
            System.out.println("Digite a sua opção: ");
            int op = sc.nextInt();

            switch(op){
                case 1:
                    sc.nextLine(); // Limpar o buffer, para ler uma string apos ler inteiro
                    System.out.println("Digite o nome do Funcionário: ");
                    f.nome = sc.nextLine();
                    System.out.println("Digite a idade do Funcionário: ");
                    f.idade = sc.nextInt();
                    sc.nextLine(); // Limpando o buffer novamente
                    System.out.println("Digite o CPF do Funcionário: ");
                    f.cpf = sc.nextLine();
                    a.escrever(f);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    ArrayList<Funcionario> funcionarios = a.ler();

                    for(int i = 0; i < funcionarios.size(); i++){
                        System.out.println("---Funcionário---");
                        System.out.println("Nome: " + funcionarios.get(i).nome);
                        System.out.println("Idade: " + funcionarios.get(i).idade);
                        System.out.println("CPF: " + funcionarios.get(i).cpf);
                    }
                    break;

                case 3:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}
