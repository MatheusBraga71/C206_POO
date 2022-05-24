package exercicioPratico.fetin;

import exercicioPratico.exceptions.NomeRepetidoException;

import java.util.HashMap;
import java.util.Map;

public class Projetos {

    private String nome;
    private double nota;

    Map<String, Double> mapaProjetos = new HashMap<String, Double>();

    public void inserirNoMap(String nome, double nota) throws NomeRepetidoException{
        mapaProjetos.forEach((chave, valor) ->{
            if(chave.equals(nome)){
                throw new NomeRepetidoException();
            } else{
                mapaProjetos.put(nome, nota);
            }
        });
    }


}
