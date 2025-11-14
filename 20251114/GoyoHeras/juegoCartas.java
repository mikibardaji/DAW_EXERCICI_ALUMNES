import java.util.Random;
import java.util.Scanner;

public class juegoCartas {
    public static void main(String[] args) {

        int carta = numeroCartaAleatoria();
        int palo = paloCartaAleatorio();
        double puntosJugador = 0, puntosBanca = 0, puntosCarta;

        do {
            imprimirCarta(carta, palo);
            puntosCarta = puntosCarta(carta);
            puntosJugador = puntosJugador + puntosCarta;
            System.out.println(puntosJugador);
            System.out.println("Tu puntuacion es " + puntosJugador);
            decision();
        } while (decision() == 'n');

        do{
            carta = numeroCartaAleatoria();
            palo = paloCartaAleatorio();
            System.out.println("La banca saca ");
            imprimirCarta(carta, palo);
            puntosCarta = puntosCarta(carta);
            puntosBanca = puntosBanca + puntosCarta;
            System.out.println("Puntuacion banca es " + puntosBanca + " tu te plantaste a " + puntosJugador);
        }while (bancaPideCarta(puntosJugador, puntosCarta));

        if (ganaJugador(puntosJugador, puntosBanca)) {
            System.out.println();
        }
    }

    public static int numeroCartaAleatoria() {
        Random rd = new Random();

        int numero = rd.nextInt(1, 11);

        if (numero == 8) {
            numero = 10;
        } else if (numero == 9) {
            numero = 11;
        } else if (numero == 10) {
            numero = 12;
        }

        return numero;
    }

    public static int paloCartaAleatorio() {
        Random rd = new Random();

        int palo = rd.nextInt(4) + 1;

        return palo;
    }

    public static void imprimirCarta(int numeroCartaAleatoria, int paloCartaAleatorio) {

        String nombreNumero = "";
        String nombrePalo = "";

        if (numeroCartaAleatoria == 10) {
            nombreNumero = "SOTA";
        } else if (numeroCartaAleatoria == 11) {
            nombreNumero = "CABALLO";
        } else if (numeroCartaAleatoria == 12) {
            nombreNumero = "REY";
        } else {
            nombreNumero = "" + numeroCartaAleatoria;
        }

        if (paloCartaAleatorio == 1) {
            nombrePalo = "OROS";
        } else if (paloCartaAleatorio == 2) {
            nombrePalo = "BASTOS";
        } else if (paloCartaAleatorio == 3) {
            nombrePalo = "ESPADAS";
        } else if (paloCartaAleatorio == 4) {
            nombrePalo = "COPAS";
        }

        System.out.println("Carta: " + nombreNumero + " de " + nombrePalo);
    }

    public static double puntosCarta(int numeroCarta) {

        if (numeroCarta >= 10 && numeroCarta <= 12) {
            return 0.5;
        } else {
            return numeroCarta;
        }
    }

    public static boolean bancaPideCarta(double puntosJugador, double puntosBanca) {

        if (puntosJugador <= 7.5 && puntosBanca < puntosJugador) {
            return true;
        } else if (puntosBanca < 5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ganaJugador(double puntosJugador, double puntosBanca) {

        if (puntosJugador <= 7.5 && puntosJugador > puntosBanca) {
            return true;
        } else if (puntosBanca > 7.5) {
            return true;
        } else {
            return false;
        }
    }

    public static int decision() {
        Scanner sc = new Scanner(System.in);
        char respuesta;

        do {
            System.out.println("Quieres seguier jugando? (s/n)");
            respuesta = sc.next().charAt(0);
        } while (respuesta != 's' && respuesta != 'n');

        return respuesta;
    }
}
