package rifi;

import java.util.Scanner;

public class Rifi_JuegodeCarta {

    public static int numeroCartaAleatorio() {
        int num = (int)(Math.random() * 10) + 1;
        if (num == 8) num = 10;
        else if (num == 9) num = 11;
        else if (num == 10) num = 12;
        return num;
    }

    public static int palCartaAleatorio() {
        return (int)(Math.random() * 4) + 1;
    }

    public static void imprimirCarta(int numero, int pal) {
        String nombrePal = "";
        if (pal == 1) nombrePal = "OROS";
        else if (pal == 2) nombrePal = "BASTOS";
        else if (pal == 3) nombrePal = "ESPADAS";
        else if (pal == 4) nombrePal = "COPAS";

        String nombreCarta = "";
        if (numero == 10) nombreCarta = "SOTA";
        else if (numero == 11) nombreCarta = "CABALLO";
        else if (numero == 12) nombreCarta = "REY";
        else nombreCarta = String.valueOf(numero);

        System.out.println("Carta: " + nombreCarta + " de " + nombrePal);
    }

    public static double puntosCarta(int numero) {
        if (numero >= 1 && numero <= 7) return numero;
        else return 0.5;
    }

    public static boolean bancaDemanaCarta(double puntosJugador, double puntosBanca) {
        if ((puntosJugador <= 7.5 && puntosBanca < puntosJugador) || puntosBanca < 5)
            return true;
        else
            return false;
    }

    public static boolean ganaJugador(double puntosJugador, double puntosBanca) {
        if ((puntosJugador <= 7.5 && puntosJugador > puntosBanca) || puntosBanca > 7.5)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double puntosJugador = 0;
        double puntosBanca = 0;
        boolean continuar = true;

        System.out.println("Bienvenido al juego de Siete y Media");

        do {
            int numero = numeroCartaAleatorio();
            int pal = palCartaAleatorio();
            imprimirCarta(numero, pal);
            puntosJugador += puntosCarta(numero);
            System.out.println("Puntos del jugador: " + puntosJugador);

            if (puntosJugador > 7.5) {
                System.out.println("Te has pasado de 7.5");
                continuar = false;
                break;
            }

            System.out.print("¿Quieres otra carta? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) continuar = false;

        } while (continuar);

        System.out.println("\n--- Turno de la banca ---");
        while (bancaDemanaCarta(puntosJugador, puntosBanca)) {
            int numero = numeroCartaAleatorio();
            int pal = palCartaAleatorio();
            imprimirCarta(numero, pal);
            puntosBanca += puntosCarta(numero);
            System.out.println("Puntos de la banca: " + puntosBanca);
        }

        System.out.println("\n--- Resultado final ---");
        System.out.println("Jugador: " + puntosJugador + " puntos");
        System.out.println("Banca: " + puntosBanca + " puntos");

        if (ganaJugador(puntosJugador, puntosBanca))
            System.out.println("Has ganado");
        else
            System.out.println("Ha ganado la banca");

        sc.close();
    }
}

