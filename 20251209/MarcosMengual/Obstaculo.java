package Joc;

import java.util.Random;

public class Obstaculo {
    
    public static final int MIN_BARRERA = 1;
    public static final int MAX_BARRERA = 5;

    public static final int MIN_TREN = 5;
    public static final int MAX_TREN = 10;
    
   
    private String tipus;
    private int dificultat;

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }
    
    
        public Obstaculo(String tipus, int dificultat) {
        this.tipus = tipus;
        this.dificultat = dificultat;
    }
    
     public Obstaculo() {
        Random rand = new Random();

      
        if (rand.nextBoolean()) {
            tipus = "barrera";
            dificultat = rand.nextInt(MAX_BARRERA - MIN_BARRERA + 1) + MIN_BARRERA;
        } else {
            tipus = "tren";
            dificultat = rand.nextInt(MAX_TREN - MIN_TREN + 1) + MIN_TREN;
        }
               
    }
     
      public void interactuar(Jugador jugador) {
        if (jugador == null) return;

        jugador.chocar(this);
    }
     
         public static Obstaculo obstacleMaxim() {
     
        return new Obstaculo("tren", MAX_TREN);
    }    
}

