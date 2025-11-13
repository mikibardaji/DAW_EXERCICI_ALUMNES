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
        int num = rd.nextInt(10) + 1;
        if (num == 8) num = 10;
        else if (num == 9) num = 11;
        else if (num == 10) num = 12;
        return num;
    }

    public static int pal_carta_aleatori() {
        return rd.nextInt(4) + 1;
    }

    public static void imprimir_carta(int numero, int pal) {
    String nomPal = "";
    switch (pal) {
        case 1:
            nomPal = "OROS";
            break;
        case 2:
            nomPal = "BASTOS";
            break;
        case 3:
            nomPal = "ESPADAS";
            break;
        case 4:
            nomPal = "COPAS";
            break;
        default:
            nomPal = "DESCONEGUT";
    }

    String nomCarta;
    switch (numero) {
        case 10:
            nomCarta = "SOTA";
            break;
        case 11:
            nomCarta = "CAVALL";
            break;
        case 12:
            nomCarta = "REI";
            break;
        default:
            nomCarta = String.valueOf(numero);
    }


    System.out.println("Carta: " + nomCarta + " de " + nomPal);
}


    public static double punts_carta(int numero) {
        if (numero >= 1 && numero <= 7) return numero;
        else if (numero >= 10 && numero <= 12) return 0.5;
        else return 0;
    }

    public static boolean banca_demana_carta(double puntsJugador, double puntsBanca) {
        return (puntsJugador <= 7.5 && puntsBanca < puntsJugador) || (puntsBanca < 5);
    }

    public static boolean guanya_jugador(double puntsJugador, double puntsBanca) {
        return (puntsJugador <= 7.5 && puntsJugador > puntsBanca) || (puntsBanca > 7.5);
    }
}
