package Tarjetas;

public class ImprimirCarta {
    public static void imprimirCarta(int numero, int pal) {
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
}
