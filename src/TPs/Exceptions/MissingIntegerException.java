package TPs.Exceptions;

/**
 * @Overview : exception non-vérifiée
 */
public class MissingIntegerException extends RuntimeException{
    public MissingIntegerException() {
        super();
    }

    public MissingIntegerException(String message) {
        super(message);
    }
}
