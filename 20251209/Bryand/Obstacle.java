import java.util.Random;

public class Obstacle {

    public static final int MIN_BARRERA = 1;
    public static final int MAX_BARRERA = 5;
    public static final int MIN_TREN = 5;
    public static final int MAX_TREN = 10;

    private String tipus;
    private int dificultat;

    public Obstacle() {
        Random r = new Random();
        if (r.nextBoolean()) {
            tipus = "barrera";
            dificultat = r.nextInt(MAX_BARRERA - MIN_BARRERA + 1) + MIN_BARRERA;
        } else {
            tipus = "tren";
            dificultat = r.nextInt(MAX_TREN - MIN_TREN + 1) + MIN_TREN;
        }
        System.out.println("Apareix obstacle: " + tipus + " dificultat " + dificultat);
    }

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }

    public void interactuar(Jugador j) {
        j.xocar(this);
    }

    public static Obstacle obstacleMaxim() {
        return new Obstacle("tren", MAX_TREN);
    }

    public Obstacle(String tipus, int dificultat) {
        this.tipus = tipus;
        this.dificultat = dificultat;
    }
}
