import java.util.Scanner;
import java.util.Random; 

public class CapitanTsubasa {

    public static void main(String[] args) {
        iniciarTanda();
        scanner.close(); 
    }

    public static int golesJugador = 0;
    public static int golesMaquina = 0;
    public static int rondaActual = 1; 

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static String repeatString(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String elegir_lado_jugador() {
        String opcion;
        boolean valida = false;
        
        do {
            System.out.print("Tria la posició (Izquierda/Derecha/Centro): ");
            opcion = scanner.nextLine().trim().toUpperCase();
            
            if (opcion.equals("Izquierda") || opcion.equals("Derecha") || opcion.equals("Centro")) {
                valida = true;
            } 
            
            else {
                System.out.println("Opció no vàlida. Introdueix Izquierda, Derecha o Centro.");
            }
        } while (!valida);
        
        return opcion;
    }

    public static String elegir_lado_maquina() {
        String[] opciones = {"Izquierda", "Derecha", "Centro"};
        int index = random.nextInt(opciones.length);
        return opciones[index];
    }

    public static boolean hay_gol(String tirador, String portero, String nomTirador) {
        boolean gol = !tirador.equals(portero);
        if (gol) {
            System.out.println("GOOOL! Marcador: " + nomTirador);
        } 
        
        else {
            System.out.println("Parada! Del porter: " + (nomTirador.equals("Jugador") ? "Màquina" : "Jugador"));
        }

        return gol;
    }

    public static void marcador(int j, int m) {
        System.out.println();
        System.out.println("Jugador 1: " + repeatString("*", j));
        System.out.println("Màquina 2: " + repeatString("*", m));
        System.out.println();
    }

    public static boolean hay_que_seguir_tirando(int j, int m, int ronda) {
        final int MAX_RONDAS = 5;
        
        if (ronda > MAX_RONDAS) {
            return j == m; 
        }
        
        int tirsRestants = MAX_RONDAS - ronda; 
        int diferenciaGols = Math.abs(j - m);
        
        if (diferenciaGols > tirsRestants) {
             return false; 
        }
        
        return true;
    }
    
    public static void iniciarTanda() {
        String opcionTiro;
        String opcionParada;
        boolean esGol;
        boolean seguir;

        do {
            System.out.println(" Ronda " + rondaActual );


            System.out.println("[JUGADOR TIRA]");
            opcionTiro = elegir_lado_jugador();     
            opcionParada = elegir_lado_maquina();   
            
            esGol = hay_gol(opcionTiro, opcionParada, "Jugador");
            if (esGol) golesJugador++;
            marcador(golesJugador, golesMaquina);


            System.out.println("[MÀQUINA TIRA]");
            opcionTiro = elegir_lado_maquina();
            opcionParada = elegir_lado_jugador();
            
            esGol = hay_gol(opcionTiro, opcionParada, "Màquina");
            if (esGol) golesMaquina++;
            marcador(golesJugador, golesMaquina);

            rondaActual++; 

            seguir = hay_que_seguir_tirando(golesJugador, golesMaquina, rondaActual - 1); 

        } while (seguir);

        System.out.println("*** FI DE LA TANDA DE PENALS ***");
        if (golesJugador > golesMaquina) {
            System.out.println("EL GUANYADOR ÉS EL JUGADOR!");
        }
        
        else if (golesMaquina > golesJugador) {
            System.out.println("EL GUANYADOR ÉS LA MÀQUINA!");
        } 
        
        else {
            System.out.println("EMPATS!");
        }
    }
}
