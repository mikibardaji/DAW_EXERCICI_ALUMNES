import java.util.Random;

public class funcionbola {
    public static int bola(){
        Random rd = new Random();
        int numero_bola = rd.nextInt(0,37);
        return numero_bola;
    }
}
