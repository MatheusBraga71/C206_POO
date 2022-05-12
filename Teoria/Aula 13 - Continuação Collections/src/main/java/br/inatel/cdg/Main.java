package br.inatel.cdg;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numVal = 100000;

        long TI, TF; // Variáveis para armazenar o tempo inicial e final

        ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
        Set<Integer> conjuntoInteiros = new HashSet<>();
        Map<Integer, Integer> mapaInteiros = new HashMap<>();

        // Inserindo usando Array List
       TI = System.currentTimeMillis();
       for(int i = 0; i < numVal; i++){
           listaInteiros.add(i);
       }
       TF = System.currentTimeMillis();
        System.out.println("Tempo para inserir na List: " + (TF-TI));

        // Inserindo usando HashSet
        TI = System.currentTimeMillis();
        for(int i = 0; i < numVal; i++){
            conjuntoInteiros.add(i);
        }
        TF = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashSet: " + (TF-TI));

        // Inserindo usando HashMap
        TI = System.currentTimeMillis();
        for(int i = 0; i < numVal; i++){
            mapaInteiros.put(i, i);
        }
        TF = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashMap: " + (TF-TI));

        // Busca na Lista
        TI = System.currentTimeMillis();
        for(int i = 0; i < numVal; i++){
            listaInteiros.contains(i);
        }
        TF = System.currentTimeMillis();
        System.out.println("Tempo para buscar na List: " + (TF-TI));

        // Busca no HashSet
        TI = System.currentTimeMillis();
        for(int i = 0; i < numVal; i++){
            conjuntoInteiros.contains(i);
        }
        TF = System.currentTimeMillis();
        System.out.println("Tempo para buscar no HashSet: " + (TF-TI));

        // Busca no HashMap
        TI = System.currentTimeMillis();
        for(int i = 0; i < numVal; i++){
            mapaInteiros.containsKey(i);
        }
        TF = System.currentTimeMillis();
        System.out.println("Tempo para buscar no HashMap: " + (TF-TI));
    }

}
