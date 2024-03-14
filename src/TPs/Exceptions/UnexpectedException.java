package TPs.Exceptions;

/**
 * @Overview : exception non-vérifiée
 */
public class UnexpectedException extends RuntimeException{
    public UnexpectedException() {
        super();
    }

    public UnexpectedException(String message) {
        super(message);
    }
}
