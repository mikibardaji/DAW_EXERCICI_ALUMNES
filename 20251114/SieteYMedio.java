import java.util.Scanner;

public class SieteYMedio {

    // Devuelve un número de carta: 1..7 o 10,11,12
    public static int numero_carta_aleatori() {
        int numero = (int) (Math.random() * 10) + 1; // 1..10
        if (numero >= 8) {
            numero = numero + 2; // 8,9,10 -> 10,11,12
        }
        return numero;
    }

    // Devuelve un palo entre 1 y 4
    public static int pal_carta_aleatori() {
        return (int) (Math.random() * 4) + 1;
    }

    // Imprime la carta
    public static void imprimir_carta(int numeroCarta, int palCarta) {
        String pal;
        if (palCarta == 1) {
            pal = "OROS";
        } else if (palCarta == 2) {
            pal = "BASTOS";
        } else if (palCarta == 3) {
            pal = "ESPADAS";
        } else {
            pal = "COPAS";
        }
        System.out.println("Carta: " + numeroCarta + " de " + pal);
    }

    // Devuelve los puntos de la carta
    public static double punts_carta(int numeroCarta) {
        if (numeroCarta >= 1 && numeroCarta <= 7) {
            return numeroCarta;
        } else {
            return 0.5;
        }
    }

    // Decide si la banca pediría otra carta (pero aquí solo la usamos una vez)
    public static int banca_demana_carta(double puntsJugador, double puntsBanca) {
        if (puntsJugador <= 7.5 && (puntsBanca < puntsJugador || puntsBanca < 5)) {
            return 1;
        } else {
            return 0;
        }
    }

    // Decide quién gana
    public static int guanya_jugador(double puntsJugador, double puntsBanca) {
        if (puntsJugador <= 7.5 &&
            (puntsJugador > puntsBanca || puntsBanca > 7.5)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double puntsJugador = 0.0;
        double puntsBanca = 0.0;

        // Carta jugador
        System.out.println("Carta del JUGADOR:");
        int numJugador = numero_carta_aleatori();
        int palJugador = pal_carta_aleatori();
        imprimir_carta(numJugador, palJugador);
        puntsJugador = puntsJugador + punts_carta(numJugador);
        System.out.println("Puntos jugador: " + puntsJugador);
        System.out.println();

        // Carta banca
        System.out.println("Carta de la BANCA:");
        int numBanca = numero_carta_aleatori();
        int palBanca = pal_carta_aleatori();
        imprimir_carta(numBanca, palBanca);
        puntsBanca = puntsBanca + punts_carta(numBanca);
        System.out.println("Puntos banca: " + puntsBanca);
        System.out.println();

        // Solo mostramos qué haría la banca (pero no seguimos jugando)
        int d = banca_demana_carta(puntsJugador, puntsBanca);
        if (d == 1) {
            System.out.println("La banca PEDIRÍA otra carta (no implementado).");
        } else {
            System.out.println("La banca se PLANTARÍA (no implementado).");
        }

        // Decidimos ganador con solo una carta cada uno
        int res = guanya_jugador(puntsJugador, puntsBanca);
        System.out.println();
        System.out.println("RESULTADO FINAL (solo una ronda):");
        if (res == 1) {
            System.out.println("Ha ganado el JUGADOR.");
        } else {
            System.out.println("Ha ganado la BANCA.");
        }

    }}