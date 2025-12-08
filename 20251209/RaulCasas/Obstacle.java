/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author rasu2
 */
public class Obstacle {
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
    
    
        public Obstacle(String tipus, int dificultat) {
        this.tipus = tipus;
        this.dificultat = dificultat;
    }
    
     public Obstacle() {
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

        jugador.xocar(this);
    }
     
         public static Obstacle obstacleMaxim() {
     
        return new Obstacle("tren", MAX_TREN);
    }
}
