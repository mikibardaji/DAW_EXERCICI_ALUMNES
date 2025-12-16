package subway.surfers;

/**
 * Clase que representa al jugador principal del juego
 */
public class Jugador {
    // Atributos
    private String nom;
    private int puntuacio;
    private int distanciaAcumulada;
    private int energia;
    private boolean powerUp;
    private int monedesRecollides;
    
    // Atributos final
    private static final int ENERGIA_INICIAL = 50;
    private static final int METRES_PER_CORRER = 2;
    private static final int MULTIPLICADOR_POWERUP = 3;
    
    // Constructor
    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distanciaAcumulada = 0;
        this.energia = ENERGIA_INICIAL;
        this.powerUp = false;
        this.monedesRecollides = 0;
        System.out.println("Jugador " + nom + " creat amb " + ENERGIA_INICIAL + " d'energia inicial");
    }
    
    // Getters
    public String getNom() {
        return nom;
    }
    
    public int getPuntuacio() {
        return puntuacio;
    }
    
    public int getDistanciaAcumulada() {
        return distanciaAcumulada;
    }
    
    public int getEnergia() {
        return energia;
    }
    
    public boolean tePowerUp() {
        return powerUp;
    }
    
    public int getMonedesRecollides() {
        return monedesRecollides;
    }
    
    // Setters (solo los necesarios)
    public void setPowerUp(boolean powerUp) {
        this.powerUp = powerUp;
    }
    
    // Métodos principales
    public void correr() {
        int metres = METRES_PER_CORRER;
        
        if (powerUp) {
            metres *= MULTIPLICADOR_POWERUP;
            System.out.println(nom + " corre amb POWER-UP! " + metres + " metres");
        } else {
            System.out.println(nom + " corre " + metres + " metres");
        }
        
        distanciaAcumulada += metres;
        mostrarProgressio();
    }
    
    public void recollirMoneda(Moneda moneda) {
        monedesRecollides++;
        int valorMoneda = moneda.getValor();
        puntuacio += valorMoneda;
        
        System.out.println(nom + " ha recollit una moneda de valor " + valorMoneda);
        System.out.println("Puntuació actual: " + puntuacio);
        System.out.println("Monedes recollides: " + monedesRecollides);
        
        // Comprobar si activa power-up
        if (moneda.hasPowerUp(monedesRecollides)) {
            powerUp = true;
            System.out.println("¡POWER-UP ACTIVAT! El jugador corre el triple de ràpid");
        } else {
            powerUp = false;
        }
    }
    
    public void xocar(Obstacle obstacle) {
        System.out.println(nom + " xoca amb un " + obstacle.getTipus());
        
        // Desactivar power-up al chocar
        powerUp = false;
        
        // Reducir energía según la dificultad del obstáculo
        int energiaPerduda = obstacle.getDificultat() * 2;
        energia -= energiaPerduda;
        
        System.out.println("Ha perdut " + energiaPerduda + " punts d'energia");
        System.out.println("Energia restant: " + energia);
        
        // Modificación: Restar distancia en lugar de energía (actualización)
        int distanciaPerduda = obstacle.getTipus().equals("tren") ? 4 : 2;
        distanciaAcumulada = Math.max(0, distanciaAcumulada - distanciaPerduda);
        System.out.println("També ha perdut " + distanciaPerduda + " metres de distància");
    }
    
    // Métodos auxiliares
    private void mostrarProgressio() {
        System.out.print("Progressió: ");
        for (int i = 0; i < distanciaAcumulada; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.print(" ");
            }
            System.out.print("-");
        }
        System.out.println(" " + distanciaAcumulada + " metres");
    }
    
    public void mostrarEstat() {
        System.out.println("\n=== ESTAT DEL JUGADOR ===");
        System.out.println("Nom: " + nom);
        System.out.println("Puntuació: " + puntuacio);
        System.out.println("Distància acumulada: " + distanciaAcumulada + " metres");
        System.out.println("Energia: " + energia + "/" + ENERGIA_INICIAL);
        System.out.println("Power-up actiu: " + (powerUp ? "SÍ" : "NO"));
        System.out.println("Monedes recollides: " + monedesRecollides);
    }
    
    public boolean estaViu() {
        return energia > 0;
    }
}
