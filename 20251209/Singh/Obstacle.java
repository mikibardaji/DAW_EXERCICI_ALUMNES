import java.util.Random;

public class Obstacle {

    public static final int BARRERA_MIN = 1;
    public static final int BARRERA_MAX = 5;
    public static final int TREN_MIN = 5;
    public static final int TREN_MAX = 10;

    private String tipus;
    private int dificultat;

    public Obstacle(String tipus) {
        this.tipus = tipus;
        Random r = new Random();

        if (tipus.equals("barrera")) {
            dificultat = r.nextInt(BARRERA_MAX - BARRERA_MIN + 1) + BARRERA_MIN;
        } else {
            dificultat = r.nextInt(TREN_MAX - TREN_MIN + 1) + TREN_MIN;
        }
    }

    public int getDificultat() { 
        return dificultat; 
    }
    
        public String getTipus() { 
        return tipus; 
    }

    public void interactuar(Jugador j) {
        j.xocar(this);
    }

    public static Obstacle obstacleMaxim() {
        Obstacle o = new Obstacle("tren");
        o.dificultat = TREN_MAX;
        return o;
    }

}
