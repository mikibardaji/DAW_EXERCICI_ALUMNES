import java.util.Random;

public class juegoCartas {
    public static void main(String[] args) {

    }

    public static int numeroCartaAleatoria() {
        Random rd = new Random();

        int numero = rd.nextInt(10) + 1;

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
}
