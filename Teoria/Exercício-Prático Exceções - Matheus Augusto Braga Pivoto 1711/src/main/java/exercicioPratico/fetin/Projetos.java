package exercicioPratico.fetin;

import exercicioPratico.exceptions.NomeRepetidoException;
import exercicioPratico.exceptions.NotaInsuficienteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Projetos {

    Map<String, Double> mapaProjetos = new HashMap<>();

    List<String> nomes = new ArrayList<>();

    public void inserirNovoProjeto(String nome, double nota) throws NomeRepetidoException, NotaInsuficienteException{

        if(!(nomes.contains(nome))){
            mapaProjetos.put(nome, nota);
        } else
            throw new NomeRepetidoException("Esse nome já está em uso!");
        nomes.add(nome);

        if(nota >= 60){
            System.out.println("Projeto aprovado");
        } else{
            throw new NotaInsuficienteException("Nota insuficiente para a aprovação!");
        }
    }

    /*
    public void compararNome(String nome){
        if(!nomes.contains(nome)){
            nomes.add(nome);
        } else{
            throw new NomeRepetidoException("Esse nome já está em uso!");
        }
    }

    */

    public void mostraInfo(){
        mapaProjetos.forEach((nome, nota) ->{
            System.out.println("Nome do projeto: " + nome);
            System.out.println("Nota do projeto: " + nota);
        });
    }



}
