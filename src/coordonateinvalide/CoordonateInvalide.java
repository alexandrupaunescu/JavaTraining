/*
 * Exception CoordonateInvalide class
 */
package coordonateinvalide;

/**
 * Exception CoordonateInvalide class
 * @author 
 */
public class CoordonateInvalide extends RuntimeException{
    public CoordonateInvalide(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
