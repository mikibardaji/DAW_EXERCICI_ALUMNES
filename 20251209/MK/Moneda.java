import java.util.Random;

public class Moneda {

    private int valor;

    public Moneda() {
        Random r = new Random();
        valor = r.nextInt(100) + 1;
        System.out.println("Moneda creada amb valor: " + valor);
    }

    public int getValor() {
        return valor;
    }

    public boolean hasPowerUp() {
        boolean premi = valor % 3 == 0;
        System.out.println("Moneda múltiple de 3? " + premi);
        return premi;
    }
}
