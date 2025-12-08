public class Jugador {

    private String nom;
    private int puntuacio;
    private int distancia;
    private int energia = 50;
    private boolean powerUp;

    public Jugador(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPowerUp() {
        return powerUp;
    }

    public void correr() {
        int inc = powerUp ? 6 : 2;
        distancia += inc;

        System.out.print("Corrent: ");
        for (int i = 0; i < inc; i++) System.out.print("- ");
        System.out.println(distancia + " metres");
    }

    public void recollirMoneda(Moneda m) {
        puntuacio += m.getValor();
        System.out.println("Moneda recollida: +" + m.getValor());

        if (m.hasPowerUp()) {
            powerUp = true;
            System.out.println("Power-Up aconseguit!");
        }
    }

    public void xocar(Obstacle ob) {
        energia -= ob.getDificultat();
        if (energia < 0) energia = 0;

        powerUp = false;

        System.out.println("Xoc amb " + ob.getTipus() +
                           " dificultat " + ob.getDificultat());
    }
}
