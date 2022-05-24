package exercicioPratico;

import exercicioPratico.exceptions.NomeRepetidoException;
import exercicioPratico.exceptions.NotaInsuficienteException;
import exercicioPratico.fetin.Projetos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NomeRepetidoException {

        Scanner sc = new Scanner(System.in);

        String nomeaux;
        double notaAux;
        //String entrada;
        boolean compare;

        try {
            Projetos p = new Projetos("Fazenda automática", 75);
        } catch (NomeRepetidoException e){
            e.printStackTrace();
        }

        try {
            Projetos p = new Projetos("Fazenda automática", 75);
        } catch (NomeRepetidoException e){
            e.printStackTrace();
        }


        /*
        while(!(nomeaux.equals("sair"))){
            System.out.println("Digite o nome do projeto");
            nomeaux = sc.nextLine();
            System.out.println("Digite a nota do projeto");
            notaAux = sc.nextDouble();
            sc.nextLine();

            compare = p.compararNome(nomeaux);

            if(compare){
                System.out.println("Verificando nome");
                throw new NomeRepetidoException();
            }
            else{
                System.out.println("Inserindo projeto");
                p.inserirNoMap(nomeaux, notaAux);
            }
        }

        */

        /*
        try{
            p.aprovarProjetos();
        } catch (NotaInsuficienteException e){
            System.out.println("Nota insuficiente");
        }

         */

      sc.close();
    }
}
