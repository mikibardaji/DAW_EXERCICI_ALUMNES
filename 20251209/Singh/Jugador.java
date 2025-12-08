public class Jugador {
    private String nom;
    private int puntuacio;
    private int distancia_acumulada;
    private int energia;
    private boolean power_up;

    // Constructor por defecto
    public Jugador() {
        this.nom = "";
        this.puntuacio = 0;
        this.distancia_acumulada = 0;
        this.energia = 50;
        this.power_up = false;
    }

    // Constructor con nombre
    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distancia_acumulada = 0;
        this.energia = 50;
        this.power_up = false;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPower_up() {
        return power_up;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setDistancia_acumulada(int distancia_acumulada) {
        this.distancia_acumulada = distancia_acumulada;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setPower_up(boolean power_up) {
        this.power_up = power_up;
    }

    public void correr() {
        int metres = powerUp ? 2 * 3 : 2;
        distanciaAcumulada += metres;
    }

    public void recollirMoneda(Moneda coin) {
        puntuacio += coin.getValor();
        powerUp = coin.hasPowerUp();
    }

    public void xocar(Obstacle ob) {
        energia -= ob.getDificultat();
        powerUp = false;
        if (energia < 0) energia = 0;
    }
}
