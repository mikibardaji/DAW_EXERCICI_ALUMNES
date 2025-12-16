public class Guardia {
    private final String nom = "Ted Lutz";
    private int distanciaRecorreguda;
    
    public Guardia() {
        this.distanciaRecorreguda = 0;
        System.out.println("Guardia " + nom + " creat");
    }
    
    public void correr() {
        distanciaRecorreguda++;
        System.out.println("Guardia " + nom + " corre 1 metre");
    }
    
    public boolean detingut(Jugador jugador) {
        correr();
        System.out.println("Guardia: " + distanciaRecorreguda + "m | Jugador: " + jugador.getDistanciaAcumulada() + "m");
        
        if (distanciaRecorreguda >= jugador.getDistanciaAcumulada()) {
            System.out.println("¡" + nom + " ha atrapat al jugador!");
            return true;
        }
        return false;
    }
}