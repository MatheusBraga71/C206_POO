package exercicioPratico.exceptions;

// Exceção do tipo checked
public class NomeRepetidoException extends Throwable {

    public NomeRepetidoException(){
        super("Nome já cadastrado!");
    }
}
