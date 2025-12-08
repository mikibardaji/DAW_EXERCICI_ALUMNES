package objetos;

import java.util.Random;

public class Moneda {
    int valor;

    public Moneda() {
        Random rand = new Random();
        this.valor = rand.nextInt(100) + 1;
    }

    public boolean hasPowerUp() {
        long mls = System.currentTimeMillis();
        return mls % 3 == 0;
    }
}
