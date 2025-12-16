import java.util.Random;

public class Obstacle {
    private String tipus;
    private int dificultat;
    private static final int MIN_BARRERA = 1;
    private static final int MAX_BARRERA = 5;
    private static final int MIN_TREN = 5;
    private static final int MAX_TREN = 10;
    
    public Obstacle(String tipus) {
        this.tipus = tipus;
        Random rand = new Random();
        
        if (tipus.equals("barrera")) {
            this.dificultat = rand.nextInt(MAX_BARRERA - MIN_BARRERA + 1) + MIN_BARRERA;
        } else { // "tren"
            this.dificultat = rand.nextInt(MAX_TREN - MIN_TREN + 1) + MIN_TREN;
        }
        
        System.out.println("Creat obstacle: " + tipus + " (dificultat: " + dificultat + ")");
    }
    
    public static Obstacle obstacleMaxim() {
        Obstacle obstacle = new Obstacle("tren");
        obstacle.dificultat = MAX_TREN;
        return obstacle;
    }
    
    public String getTipus() { return tipus; }
    public int getDificultat() { return dificultat; }
}