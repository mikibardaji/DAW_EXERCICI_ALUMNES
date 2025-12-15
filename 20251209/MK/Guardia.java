public class Guardia {

    private final String nom = "Ted Lutz";
    private int distancia;

    public Guardia() {
        this.distancia = 0;
        System.out.println("Guardia creat: " + nom);
    }

    public void correr() {
        distancia += 1;
        System.out.println("Guardia corre 1 metre. Distància: " + distancia);
    }

    public boolean detingut(Jugador j) {
        if (distancia >= j.getDistanciaAcumulada()) {
            System.out.println("🚨 El guardia ha atrapat el jugador!");
            return true;
        }
        return false;
    }
}
