package SubwaySurfers;

import java.util.Random;

public class Obstaculo {

    public static final int MIN_BARRERA = 1;
    public static final int MAX_BARRERA = 5;

    public static final int MIN_TREN = 5;
    public static final int MAX_TREN = 10;

    private String tipo;    
    private int dificultad;  

    public Obstaculo(String tipo, int dificultad) {
        this.tipo = tipo;
        this.dificultad = dificultad;
    }

    public Obstaculo() {
        Random r = new Random();

        if (r.nextBoolean()) {
            tipo = "barrera";
            dificultad = r.nextInt(MIN_BARRERA, MAX_BARRERA + 1); 

        } else {
            tipo = "tren";
            dificultad = r.nextInt(MIN_TREN, MAX_TREN + 1);
        }

        System.out.println("Aparece el obstáculo: " + tipo + " con dificultad " + dificultad);
    }

    public String getTipo() {
        return tipo;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void interactuar(Jugador jugador) {
        if (jugador == null) {
            return;
        }
        jugador.chocar(this);
    }

    public static Obstaculo obstaculoMaximo() {
        return new Obstaculo("tren", MAX_TREN);
    }
}
