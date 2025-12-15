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

        if (tipus.equalsIgnoreCase("barrera")) {
            dificultat = r.nextInt(BARRERA_MAX - BARRERA_MIN + 1) + BARRERA_MIN;
        } else {
            dificultat = r.nextInt(TREN_MAX - TREN_MIN + 1) + TREN_MIN;
        }

        System.out.println("Obstacle creat: " + tipus + " dificultat " + dificultat);
    }

    public static Obstacle obstacleMaxim() {
        return new Obstacle("tren");
    }

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }
}
