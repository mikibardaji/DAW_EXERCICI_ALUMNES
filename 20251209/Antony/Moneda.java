import java.util.Random;

public class Moneda {
    private int valor;
    private static final int VALOR_MINIM = 1;
    private static final int VALOR_MAXIM = 100;
    
    public Moneda() {
        Random rand = new Random();
        this.valor = rand.nextInt(VALOR_MAXIM - VALOR_MINIM + 1) + VALOR_MINIM;
        System.out.println("Moneda creada amb valor: " + valor);
    }
    
    public int getValor() { return valor; }
    
    public boolean hasPowerUp(int monedesRecollides) {
        if (monedesRecollides % 3 == 0) {
            System.out.println("Moneda múltiple de 3! - POT donar power-up");
            return true;
        }
        return false;
    }
}