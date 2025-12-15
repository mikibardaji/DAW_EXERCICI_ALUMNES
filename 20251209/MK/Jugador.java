public class Jugador {

    private String nom;
    private int puntuacio;
    private int distanciaAcumulada;
    private int energia;
    private boolean powerUp;

    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distanciaAcumulada = 0;
        this.energia = 50;
        this.powerUp = false;
        System.out.println("Jugador creat: " + nom);
    }

    public void correr() {
        int metres = 2;
        if (powerUp) {
            metres *= 3;
            System.out.println("POWER-UP actiu! Corre el triple!");
        }
        distanciaAcumulada += metres;

        System.out.print("Jugador corre: ");
        for (int i = 0; i < metres; i++) {
            System.out.print("- ");
        }
        System.out.println(distanciaAcumulada + " metres totals");
    }

    public void recollirMoneda(Moneda coin) {
        puntuacio += coin.getValor();
        System.out.println("Moneda recollida: +" + coin.getValor() + " punts");

        if (coin.hasPowerUp()) {
            powerUp = true;
            System.out.println("POWER-UP ACTIVAT!");
        } else {
            powerUp = false;
            System.out.println("POWER-UP DESACTIVAT");
        }
    }

    public void xocar(Obstacle o) {
        energia -= o.getDificultat();
        powerUp = false;
        System.out.println("Xoc amb obstacle: " + o.getTipus()
                + " | Energia perduda: " + o.getDificultat());
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
}
 