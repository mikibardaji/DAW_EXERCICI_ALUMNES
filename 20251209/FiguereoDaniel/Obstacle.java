package Joc;
import java.util.Random;

public class Obstacle {
    
    public static final int minBarrera = 1;
    public static final int maxBarrera = 5;

    public static final int minTren = 5;
    public static final int maxTren = 10;
    
    
    
    private String tipus;
    private int dificultat;

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }
    
    
        public Obstacle(String tipus, int dificultat) {
        this.tipus = tipus;
        this.dificultat = dificultat;
    }
    
     public Obstacle() {
        Random rand = new Random();

      
        if (rand.nextBoolean()) {
            tipus = "barrera";
            dificultat = rand.nextInt(maxBarrera - minBarrera + 1) + minBarrera;
        } else {
            tipus = "tren";
            dificultat = rand.nextInt(maxTren - minTren + 1) + minTren;
        }
        
        
        
        
        
    }
     
      public void interactuar(Jugador jugador) {
        if (jugador == null) return;

        jugador.xocar(this);
    }
     
         public static Obstacle obstacleMaxim() {
     
        return new Obstacle("tren", maxTren);
    }
     
     
     
     
    
}

