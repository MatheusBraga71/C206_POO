package exercicioPratico.fetin;

import exercicioPratico.exceptions.NomeRepetidoException;
import exercicioPratico.exceptions.NotaInsuficienteException;

import java.util.HashMap;
import java.util.Map;

public class Projetos {

    private String nome;
    private double nota;

    Map<String, Double> mapaProjetos = new HashMap<String, Double>();

    public Projetos(String nome, double nota) throws NomeRepetidoException{
        mapaProjetos.forEach((chave, valor) ->{
            if(chave.equals(nome)){
                try {
                    throw new NomeRepetidoException();
                } catch (NomeRepetidoException e) {
                    e.printStackTrace();
                }
            }
            else{
                mapaProjetos.put(nome, nota);
            }
        });

    }


    public boolean compararNome(String nome){
        final boolean[] compAux = {false};
        mapaProjetos.forEach((chave, valor) ->{
            if(chave.equals(nome)){
               compAux[0] = true;
            }
        });
        return compAux[0];
    }

    /*
    public void inserirNoMap(String nome, double nota){
        mapaProjetos.forEach((chave, valor) ->{
            if(chave.equals("nome")){
                throw new NomeRepetidoException("Esse nome já foi utilizado");
            }
        });


     */



        //mapaProjetos.put(nome, nota);

}
