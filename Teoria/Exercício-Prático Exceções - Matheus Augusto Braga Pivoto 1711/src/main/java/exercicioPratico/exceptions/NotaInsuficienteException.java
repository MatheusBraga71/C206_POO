package exercicioPratico.exceptions;

// Exceção do tipo checked
public class NotaInsuficienteException extends Exception {

    public NotaInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
