package objetos;

import java.util.Random;

public class Obstacle {
    String tipus;
    int dificultat;

    public Obstacle() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            this.tipus = "barrera";
            this.dificultat = rand.nextInt(5) + 1;
        } else {
            this.tipus = "tren";
            this.dificultat = rand.nextInt(6) + 5;
        }
    }

    public static Obstacle obstacleMaxim() {
        Obstacle o = new Obstacle();
        o.tipus = "tren";
        o.dificultat = 10;
        return o;
    }

    public void interactuar(Jugador jugador) {
        jugador.xocar(this);
        System.out.println("Obstacle: Interactuant amb el jugador. Energia reduïda.");
    }
}
