package objetos;

import java.util.Random;

public class Moneda {
    private int valor;

    public Moneda() {
        Random rand = new Random();
        valor = rand.nextInt(100) + 1;
    }

    public int getValor() {
        return valor;
    }

    public boolean tienePowerUp() {
        long mls = System.currentTimeMillis();

        if (mls % 3 == 0) {
            return true;
        }
        return false;
    }
}