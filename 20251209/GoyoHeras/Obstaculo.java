package objetos;

import java.util.Random;

public class Obstaculo {
    private String tipo;
    private int dificultad;

    private static final int minBarrera = 1;
    private static final int maxBarrera = 5;
    private static final int minTren = 5;
    private static final int maxTren = 10;

    public Obstaculo(String tipo, int dificultad) {
        this.tipo = tipo;
        this.dificultad = dificultad;
    }

    public Obstaculo() {
        Random rand = new Random();

        if (rand.nextBoolean()) {
            tipo = "barrera";
            dificultad = rand.nextInt(maxBarrera - minBarrera + 1) + minBarrera;
        } else {
            tipo = "tren";
            dificultad = rand.nextInt(maxTren - minTren + 1) + minTren;
        }
    }

    public int getDificultat() {
        return dificultad;
    }

    public String getTipo() {
        return tipo;
    }

    public void interactuar(Jugador jugador) {
        if (jugador != null) {
            jugador.chocar(this);
        }
    }

    public static Obstaculo obstaculomaximo() {
        return new Obstaculo("tren", maxTren);
    }
    
    public void setDificultat(int dificultad) {
        this.dificultad = dificultad;
    }
}
