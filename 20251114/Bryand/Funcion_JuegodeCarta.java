import java.util.Random;

public class Funcion_JuegodeCarta {
    static Random rd = new Random();
    public static void main(String[] args) {
        int numero = numero_carta_aleatori();
        int pal = pal_carta_aleatori();

        imprimir_carta(numero, pal);
        double punts = punts_carta(numero);
        System.out.println("Punts de la carta: " + punts);
    }

    public static int numero_carta_aleatori() {
        int num = rd.nextInt(1, 11);

        if (num == 8) { 
            num = 10;
        }
        if (num == 9) { 
            num = 11;
        }
        if (num == 10) { 
            num = 12;
        }
        return num;
    }

    public static int pal_carta_aleatori() {
        int palo = rd.nextInt(1,5);
        return palo;
    }

    public static void imprimir_carta(int numero, int pal) {
          String nomPal = "";
        if (pal == 1) {
            nomPal = "OROS";
        } else if (pal == 2) {
            nomPal = "BASTOS";
        } else if (pal == 3) {
            nomPal = "ESPADAS";
        } else if (pal == 4) {
            nomPal = "COPAS";
        } else {
            nomPal = "DESCONOCIDO";
        }

        String nomCarta = "";
        if (numero == 10) {
            nomCarta = "SOTA";
        } else if (numero == 11) {
            nomCarta = "CABALLO";
        } else if (numero == 12) {
            nomCarta = "REY";
        } else {
            nomCarta = String.valueOf(numero);
        }

        System.out.println("Carta: " + nomCarta + " de " + nomPal);
    }

    public static double punts_carta(int numero) {
        if (numero >= 1 && numero <= 7) return numero;
        else return 0.5;
    }

    public static boolean banca_demana_carta(double puntsJugador, double puntsBanca) {
        return (puntsJugador <= 7.5 && puntsBanca < puntsJugador) || (puntsBanca < 5);
    }

    public static boolean guanya_jugador(double puntsJugador, double puntsBanca) {
        return (puntsJugador <= 7.5 && puntsJugador > puntsBanca) || (puntsBanca > 7.5);
    }
}

