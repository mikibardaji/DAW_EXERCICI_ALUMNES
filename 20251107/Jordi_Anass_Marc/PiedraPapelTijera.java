import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntosJugador = 0;
        int puntosOrdenador = 0;

        // 1️⃣ Preguntar cuántos puntos será la partida
        int maxPuntos = puntosPartida();
        System.out.println("La partida será a " + maxPuntos + " puntos.\n");

        // 2️⃣ Ciclo principal del juego
        while (puntosJugador < maxPuntos && puntosOrdenador < maxPuntos) {

            // 2a️⃣ Jugada del jugador
            int eleccionJugador = jugada();

            // 2b️⃣ Jugada del ordenador
            int eleccionOrdenador = jugada_ordenador();

            // 2c️⃣ Mostrar las jugadas
            System.out.println("Tu elección: " + mostrarJugada(eleccionJugador));
            System.out.println("Elección del ordenador: " + mostrarJugada(eleccionOrdenador));

            // 2d️⃣ Determinar ganador de la ronda
            int resultado = ganador(eleccionJugador, eleccionOrdenador);

            // 2e️⃣ Imprimir quién ganó la ronda
            imp_ganador(resultado);

            // 2f️⃣ Actualizar puntos
            if (resultado == 1) puntosJugador = aumentar_punto(puntosJugador);
            else if (resultado == 2) puntosOrdenador = aumentar_punto(puntosOrdenador);

            // 2g️⃣ Mostrar marcador actualizado
            marcador(puntosJugador, puntosOrdenador);
        }

        // 3️⃣ Anunciar ganador final
        if (puntosJugador == maxPuntos) System.out.println("¡Felicidades! ¡Ganaste la partida!");
        else System.out.println("El ordenador ganó la partida. ¡Intenta otra vez!");
    }

    // --- Funciones del juego ---

    public static int puntosPartida() {
        Scanner sc = new Scanner(System.in);
        int puntos = -1;
        do {
            System.out.print("¿A cuántos puntos quieres jugar? (1-20): ");
            if (sc.hasNextInt()) {
                puntos = sc.nextInt();
                if (puntos < 1 || puntos > 20) System.out.println("Valor no válido. Debe ser entre 1 y 20.");
            } else {
                System.out.println("Debes introducir un número entero.");
                sc.next();
            }
        } while (puntos < 1 || puntos > 20);
        return puntos;
    }

    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("¿Qué sacas? (0 piedra, 1 papel, 2 tijera): ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion < 0 || opcion > 2) System.out.println("Valor no válido. Intenta de nuevo.");
            } else {
                System.out.println("Debes introducir un número (0, 1 o 2).");
                sc.next();
            }
        } while (opcion < 0 || opcion > 2);
        return opcion;
    }

    public static int jugada_ordenador() {
        Random rd = new Random();
        return rd.nextInt(3);
    }

    public static int ganador(int choose_player1, int choose_player2) {
        if (choose_player1 == choose_player2) return 0;
        if ((choose_player1 == 0 && choose_player2 == 2) ||
            (choose_player1 == 1 && choose_player2 == 0) ||
            (choose_player1 == 2 && choose_player2 == 1)) return 1;
        return 2;
    }

    public static void imp_ganador(int ganador) {
        if (ganador == 0) System.out.println("¡Empate!");
        else if (ganador == 1) System.out.println("¡Has ganado la ronda!");
        else System.out.println("Ha ganado el ordenador la ronda.");
    }

    public static void marcador(int point_player1, int point_player2) {
        System.out.println("----- MARCADOR -----");
        System.out.println("Jugador: " + point_player1 + " puntos.");
        System.out.println("Ordenador: " + point_player2 + " puntos.");
        System.out.println("-------------------\n");
    }

    public static int aumentar_punto(int score) {
        return score + 1;
    }

    public static String mostrarJugada(int jugada) {
        switch (jugada) {
            case 0: return "Piedra";
            case 1: return "Papel";
            case 2: return "Tijera";
            default: return "Desconocido";
        }
    }
}
