public class Jugador {
    private String nom;
    private int puntuacio;
    private int distanciaAcumulada;
    private int energia;
    private boolean powerUp;
    private int monedesRecollides;
    private static final int ENERGIA_INICIAL = 50;
    
    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distanciaAcumulada = 0;
        this.energia = ENERGIA_INICIAL;
        this.powerUp = false;
        this.monedesRecollides = 0;
    }
    
    public void correr() {
        int metres = 2;
        if (powerUp) {
            metres *= 3;
            System.out.println(nom + " corre amb POWER-UP! " + metres + " metres");
        } else {
            System.out.println(nom + " corre " + metres + " metres");
        }
        distanciaAcumulada += metres;
        
        // Mostrar progresión visual
        System.out.print("Progressió: ");
        for (int i = 0; i < distanciaAcumulada; i++) {
            if (i % 10 == 0 && i > 0) System.out.print(" ");
            System.out.print("-");
        }
        System.out.println(" " + distanciaAcumulada + " metres");
    }
    
    public void recollirMoneda(Moneda moneda) {
        monedesRecollides++;
        puntuacio += moneda.getValor();
        System.out.println(nom + " recull moneda #" + monedesRecollides + " (" + moneda.getValor() + " punts)");
        
        if (moneda.hasPowerUp(monedesRecollides)) {
            powerUp = true;
            System.out.println("¡POWER-UP ACTIVAT!");
        } else {
            powerUp = false;
        }
    }
    
    public void xocar(Obstacle obstacle) {
        System.out.println(nom + " xoca amb un " + obstacle.getTipus());
        powerUp = false;
        
        // MODIFICACIÓN: Restar distancia en lugar de energía
        int distanciaPerduda = obstacle.getTipus().equals("tren") ? 4 : 2;
        distanciaAcumulada = Math.max(0, distanciaAcumulada - distanciaPerduda);
        System.out.println("Perd " + distanciaPerduda + " metres de distància");
        
        // Mostrar estado actual
        System.out.println("Distància actual: " + distanciaAcumulada + "m, Energia: " + energia);
    }
    
    // Getters
    public String getNom() { return nom; }
    public int getPuntuacio() { return puntuacio; }
    public int getDistanciaAcumulada() { return distanciaAcumulada; }
    public int getEnergia() { return energia; }
    public int getMonedesRecollides() { return monedesRecollides; }
    public boolean estaViu() { return energia > 0; }
    public boolean tePowerUp() { return powerUp; }
}