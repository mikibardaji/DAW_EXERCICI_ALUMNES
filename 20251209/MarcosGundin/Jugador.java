package objetos;

public class Jugador {
    String nom;
    int puntuacio;
    int distanciaAcumulada;
    int energia;
    boolean powerUp;

    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distanciaAcumulada = 0;
        this.energia = 50;
        this.powerUp = false;
    }

    public void correr() {
        int metres = 2;
        if (powerUp) {
            metres *= 3;
        }
        distanciaAcumulada += metres;
        System.out.print("Jugador: " + nom + " ha corregut " + metres + " metres. Distància total: " + distanciaAcumulada + " metres. ");
        for (int i = 0; i < metres; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }

    public void recollirMoneda(Moneda coin) {
        puntuacio += coin.valor;
        System.out.println("Jugador: " + nom + " ha recollit una moneda de valor " + coin.valor + ". Puntuació total: " + puntuacio);
        
        if (coin.hasPowerUp()) {
            powerUp = true;
            System.out.println("Jugador: Power-up activat!");
        } else {
            powerUp = false;
            System.out.println("Jugador: Power-up desactivat.");
        }
    }

    public void xocar(Obstacle obstacle) {
        energia -= obstacle.dificultat;
        powerUp = false;
        System.out.println("Jugador: " + nom + " ha xocat amb un obstacle de tipus " + obstacle.tipus + " i dificultat " + obstacle.dificultat + ". Energia restant: " + energia);
    }

    public int getEnergia() {
        return energia;
    }

    public int getDistanciaAcumulada() {
        return distanciaAcumulada;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public boolean isPowerUp() {
        return powerUp;
    }

    public void setPowerUp(boolean powerUp) {
        this.powerUp = powerUp;
    }
}
