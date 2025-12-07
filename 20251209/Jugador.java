/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author jpa2698
 */
public class Jugador {
    
    private String nom ;
    private int puntuacio;
    private int distancia_acumulada=0;
    private int energia =50;
    private boolean power_up = false;

    public Jugador(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }

    public void setDistancia_acumulada(int distancia_acumulada) {
        this.distancia_acumulada = distancia_acumulada;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isPower_up() {
        return power_up;
    }

    public void setPower_up(boolean power_up) {
        this.power_up = power_up;
    }
    
    
    
    
    public void correr() {
 
    int increment = 2;
    if (power_up) {
        increment *= 3;
    }
    distancia_acumulada += increment;
 
}
    
    
    
 public void recollirMoneda(Moneda coin) {
     if (coin == null) return;

        puntuacio += coin.getValor();

     
        if (coin.hasPowerUp()) {
            power_up = true;
        }
}
 
 
 
 public void xocar(Obstacle ob) {
   if (ob == null) return;

        energia -= ob.getDificultat();
        if (energia < 0) energia = 0;

        power_up = false;
}



 
 
 

    
    
    
    
    
    
}
