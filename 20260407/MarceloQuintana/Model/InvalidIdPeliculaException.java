package Model;

public class InvalidIdPeliculaException extends Exception{

    public InvalidIdPeliculaException() {
        super("Id peli debe ser positiva");
    }
    
    
}