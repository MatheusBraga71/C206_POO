package exercicioPratico.exceptions;

// Exceção do tipo checked
public class NomeRepetidoException extends Exception {

    public NomeRepetidoException(){
        System.out.println("Esse nome já foi usado");
    }
}
