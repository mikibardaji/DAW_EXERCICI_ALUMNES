package utilitats;
public class marcaNotValidException extends Exception {

    public marcaNotValidException(String message) {
        super(message + " no es nuestra marca");
    }

}
