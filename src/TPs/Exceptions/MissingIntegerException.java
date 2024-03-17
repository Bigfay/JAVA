package TPs.Exceptions;

/**
 * @Overview : exception non-vérifiée
 */
public class MissingIntegerException extends Exception{
    public MissingIntegerException() {
        super();
    }

    public MissingIntegerException(String message) {
        super(message);
    }
}
