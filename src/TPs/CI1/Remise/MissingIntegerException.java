package TPs.Exceptions;

/**
 * @Overview : exception vérifiée
 */
public class MissingIntegerException extends Exception{
    public MissingIntegerException() {
        super();
    }

    public MissingIntegerException(String message) {
        super(message);
    }
}
