import java.util.Random;

public class Joc {
    private Jugador jugador;
    private String nivellDificultat;
    private Guardia guardia;
    
    public Joc(String nom, String nivell) {
        this.jugador = new Jugador(nom);
        
        if (nivell.equalsIgnoreCase("dificil")) {
            this.nivellDificultat = "dificil";
        } else {
            this.nivellDificultat = "facil";
        }
        
        this.guardia = new Guardia();
        System.out.println("Joc iniciat - Nivell: " + this.nivellDificultat);
    }
    
    public void jugar() {
        System.out.println("\n=== MODO " + nivellDificultat.toUpperCase() + " ===");
        Random rand = new Random();
        
        while (jugador.estaViu() && !guardia.detingut(jugador)) {
            // El jugador corre
            jugador.correr();
            
            // Decidir qué encuentra según nivel
            int probabilidadMoneda = nivellDificultat.equals("facil") ? 70 : 30;
            
            if (rand.nextInt(100) < probabilidadMoneda) {
                // Encuentra moneda
                Moneda moneda = new Moneda();
                jugador.recollirMoneda(moneda);
            } else {
                // Encuentra obstáculo
                int tipoObstacle = rand.nextInt(2);
                if (tipoObstacle == 0) {
                    jugador.xocar(new Obstacle("barrera"));
                } else {
                    jugador.xocar(new Obstacle("tren"));
                }
            }
            
            try { Thread.sleep(600); } catch (Exception e) {}
        }
        
        mostrarResultats();
    }
    
    public void jugarOpcioFacil() {
        System.out.println("\n=== OPCIÓ FÀCIL ===");
        Random rand = new Random();
        
        while (jugador.estaViu()) {
            // 1. Correr
            jugador.correr();
            
            // 2. Random 1-2
            if (rand.nextInt(2) + 1 == 1) {
                // Crear barrera
                jugador.xocar(new Obstacle("barrera"));
            } else {
                // Crear tren
                jugador.xocar(new Obstacle("tren"));
            }
            
            // 3. Recoger moneda
            jugador.recollirMoneda(new Moneda());
            
            try { Thread.sleep(500); } catch (Exception e) {}
        }
        
        mostrarResultats();
    }
    
    private void mostrarResultats() {
        System.out.println("\n" + "═".repeat(40));
        System.out.println("=== RESULTATS FINALS ===");
        System.out.println("Distància recorreguda: " + jugador.getDistanciaAcumulada() + " metres");
        System.out.println("Monedes recollides: " + jugador.getMonedesRecollides());
        System.out.println("Puntuació final: " + jugador.getPuntuacio());
        
        // ASCII Art del tren
        mostrarTrenAscii();
    }
    
    private void mostrarTrenAscii() {
        System.out.println("\n        ____");
        System.out.println("  _____|____\\_____");
        System.out.println("  |  SUBWAY       |");
        System.out.println("  |  SURFERS      |");
        System.out.println("  |_______________|");
        System.out.println("  (@)(@)*******(@)(@)");
    }
    
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR SUBWAY SURFERS ===\n");
        
        // Ejemplo 1: Juego normal fácil
        Joc joc1 = new Joc("Jugador1", "facil");
        joc1.jugar();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Ejemplo 2: Opción fácil
        Joc joc2 = new Joc("Jugador2", "dificil");
        joc2.jugarOpcioFacil();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demostración del obstáculo máximo
        System.out.println("\nDEMOSTRACIÓ: Obstacle màxim");
        Obstacle obstacleMax = Obstacle.obstacleMaxim();
        System.out.println("Tipus: " + obstacleMax.getTipus());
        System.out.println("Dificultat: " + obstacleMax.getDificultat());
    }
}