package exercicioPratico;

import exercicioPratico.exceptions.NomeRepetidoException;
import exercicioPratico.exceptions.NotaInsuficienteException;
import exercicioPratico.fetin.Projetos;

public class Main {

    public static void main(String[] args){

        Projetos p = new Projetos();

        try{
            p.inserirNovoProjeto("Fazenda Automática", 75);
        } catch(NomeRepetidoException | NotaInsuficienteException e){
            e.printStackTrace();
        }

        try{
            p.inserirNovoProjeto("Fazenda Automática", 90);
        } catch(NomeRepetidoException | NotaInsuficienteException e){
            e.printStackTrace();
        }

        try{
            p.inserirNovoProjeto("Trava Eletrônica", 20);
        } catch(NomeRepetidoException | NotaInsuficienteException e){
            e.printStackTrace();
        }

        System.out.println("Final da main");

    }
}
