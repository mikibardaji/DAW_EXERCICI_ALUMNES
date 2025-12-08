import java.util.Random;

public class Moneda {

    private int valor;

    public Moneda() {
        valor = new Random().nextInt(100) + 1;
        System.out.println("Apareix moneda: valor " + valor);
    }

    public int getValor() {
        return valor;
    }

    public boolean hasPowerUp() {
        long ms = System.currentTimeMillis();
        return ms % 3 == 0;
    }
}
