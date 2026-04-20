package Modelo;

/**
 *
 * @author mabardaji
 */
public class NotValidWeightException extends Exception{

    public NotValidWeightException() {
        super("El peso del luchador no es valido (0-200)");
    }
    
    
    
}
