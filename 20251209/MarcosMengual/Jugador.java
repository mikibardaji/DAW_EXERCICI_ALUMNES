package Joc;

public class Jugador {
    
    private String nombre ;
    private int puntuacion;
    private int distancia_acumulada = 0;
    private int energia = 50;
    private boolean power_up = false;

    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
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
    
 public void recogerMoneda(Moneda coin) {
     if (coin == null) return;

        puntuacion += coin.getValor();

     
        if (coin.hasPowerUp()) {
            power_up = true;
        }
}
  
 public void chocar(Obstaculo ob) {
   if (ob == null) return;

        energia -= ob.getDificultat();
        if (energia < 0) energia = 0;

        power_up = false;
}

}

