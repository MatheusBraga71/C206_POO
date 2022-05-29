package exercicioPratico.exceptions;

// Exceção do tipo unchecked
public class NomeRepetidoException extends RuntimeException {

    public NomeRepetidoException(String mensagem){
        super(mensagem);
    }
}
