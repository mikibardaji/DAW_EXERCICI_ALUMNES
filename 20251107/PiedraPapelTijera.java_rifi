package rifi;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        int puntosObjetivo = puntosPartida();

        int puntosJugador = 0;
        int puntosMaquina = 0;

        while (puntosJugador < puntosObjetivo && puntosMaquina < puntosObjetivo) {

            int eleccionJugador = jugadas();
            int eleccionMaquina = jugada_ordenador();

            imp_jugada("Jugador", eleccionJugador);
            imp_jugada("Máquina", eleccionMaquina);

            int resultado = ganador(eleccionJugador, eleccionMaquina);
            String textoResultado = imp_ganador(resultado);
            System.out.println("Resultado: " + textoResultado);

            if (resultado == 1) {
                puntosJugador = sumar_punto(puntosJugador);
            } else if (resultado == 2) {
                puntosMaquina = sumar_punto(puntosMaquina);
            }

            System.out.println(marcador(puntosJugador, puntosMaquina));
        }

        if (puntosJugador == puntosObjetivo) {
            System.out.println("Has ganado la partida.");
        } else {
            System.out.println("La máquina ha ganado la partida.");
        }
    }

    //FUNCIONES

    public static int jugadas() {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("Elige una jugada: 0-Piedra, 1-Papel, 2-Tijeras");
            eleccion = sc.nextInt();
            if (eleccion < 0 || eleccion > 2) {
                System.out.println("Jugada no válida. Inténtalo de nuevo.");
            }
        } while (eleccion < 0 || eleccion > 2);
        return eleccion;
    }

    public static int jugada_ordenador() {
        Random rd = new Random();
        int eleccionmaquina = rd.nextInt(3);
        return eleccionmaquina;
    }

    public static void imp_jugada(String quien_juega, int choose) {
        System.out.print(quien_juega + " ha elegido ");
        if (choose == 0) {
            System.out.println("piedra");
        } else if (choose == 1) {
            System.out.println("papel");
        } else if (choose == 2) {
            System.out.println("tijeras");
        } else {
            System.out.println("Jugada no válida");
        }
    }

    public static String imp_ganador(int ganador) {
        if (ganador == 0) {
            return "Empate";
        } else if (ganador == 1) {
            return "Has ganado";
        } else {
            return "Ha ganado la máquina";
        }
    }

    public static String marcador(int puntos_jugador_1, int puntos_jugador_2) {
        String marcador = "";
        marcador += "--------------------\n";
        marcador += "|     MARCADOR     |\n";
        marcador += "--------------------\n";
        marcador += "| JUGADOR  MAQUINA |\n";
        marcador += "|    " + puntos_jugador_1 + "         " + puntos_jugador_2 + "   |\n";
        marcador += "--------------------";
        return marcador;
    }

    public static int sumar_punto(int score) {
        return score + 1;
    }

    public static int ganador(int choose_player1, int choose_player2) {
        if (choose_player1 == choose_player2) {
            return 0;
        } else if ((choose_player1 == 0 && choose_player2 == 2) || (choose_player1 == 1 && choose_player2 == 0) || (choose_player1 == 2 && choose_player2 == 1)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int puntosPartida() {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        do {
            System.out.print("¿A cuántos puntos quieres que sea la partida? (1-20): ");
            puntos = sc.nextInt();
            if (puntos < 1 || puntos > 20) {
                System.out.println("La puntuación debe estar entre 1 y 20.");
            }
        } while (puntos < 1 || puntos > 20);
        return puntos;
    }
}
