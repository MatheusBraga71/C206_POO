package exercicio;

import exercicio.carros.Carro;
import exercicio.carros.Hatch;
import exercicio.carros.SUV;
import exercicio.carros.Sedan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String aux; // String auxiliar para a entrada de dados

        ArrayList<String> nome = new ArrayList<>(); // ArrayList Auxiliar para receber o parametro String

        ArrayList<Carro> listaCarros = new ArrayList<>(); // ArrayList para armazenar os carros

        System.out.println("Digite o nome de 6 carros");
        System.out.println("Sendo eles 2 Sedans, 2 Hatch e 2 SUVs!");

        // Adicionando as Strings no ArrayList auxiliar
        for(int i = 0; i < 6; i++){
            aux = sc.nextLine();
            nome.add(aux);
        }

        // Instanciando os objetos do tipo Carro
        Carro c1 = new Hatch(nome.get(0), new Random().nextDouble()*100);
        Carro c2 = new Hatch(nome.get(1), new Random().nextDouble()*100);
        Carro c3 = new Sedan(nome.get(2), new Random().nextDouble()*100);
        Carro c4 = new Sedan(nome.get(3), new Random().nextDouble()*100);
        Carro c5 = new SUV(nome.get(4), new Random().nextDouble()*100);
        Carro c6 = new SUV(nome.get(5), new Random().nextDouble()*100);

        // Adicionando as instancias ao ArrayList carros
        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);
        listaCarros.add(c4);
        listaCarros.add(c5);
        listaCarros.add(c6);

        // Antes de ordenar
        System.out.println("Exibindo sem ordenação: ");
        for(int i = 0; i< listaCarros.size(); i++){
            System.out.println("Nome: " + listaCarros.get(i).getNome());
            System.out.println("Preço: " + listaCarros.get(i).getPreco());
        }
        System.out.println("----------------------");
        // Ordenando de forma decrescente
        Collections.sort(listaCarros, Collections.reverseOrder());

        // Depois de ordenar
        System.out.println("Exibindo após ordenar por preço de forma decrescente: ");
        for(int i = 0; i< listaCarros.size(); i++){
            System.out.println("Nome: " + listaCarros.get(i).getNome());
            System.out.println("Preço: " + listaCarros.get(i).getPreco());
        }

        sc.close();
    }
}
