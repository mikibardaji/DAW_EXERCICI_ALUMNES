package Joc;

import java.util.Random;


public class Moneda {
    private int valor;

    public Moneda() {
        Random random = new Random();
        this.valor = random.nextInt(101);
    }

    public boolean hasPowerUp() {
        long mls = System.currentTimeMillis();
        return mls % 3 == 0;
    }

    public int getValor() {
        return valor;
    }
}

