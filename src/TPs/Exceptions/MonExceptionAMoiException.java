package TPs.Exceptions;

/**
 * @Overview : exception non-vérifiée
 */
public class MonExceptionAMoiException extends RuntimeException{
    public MonExceptionAMoiException() {
        super();
    }

    public MonExceptionAMoiException(String message) {
        super(message);
    }
}
