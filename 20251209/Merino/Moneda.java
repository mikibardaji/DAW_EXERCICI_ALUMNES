package SubwaySurfers;

import java.util.Random;

public class Moneda {

    private int valor;

    public Moneda() {
        Random r = new Random();
        valor = r.nextInt(1, 101);
        System.out.println("Aparece una moneda de valor: " + valor);
    }

    public int getValor() {
        return valor;
    }

    public boolean hasPowerUp() {
        long ms = System.currentTimeMillis();
        return ms % 3 == 0;
    }
}
