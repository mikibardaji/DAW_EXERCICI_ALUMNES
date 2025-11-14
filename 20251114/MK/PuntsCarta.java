package Tarjetas;

public class PuntsCarta {
    public static double puntsCarta(int numero) {
        if (numero >= 1 && numero <= 7) {
            return numero;
        } else if (numero >= 10 && numero <= 12) {
            return 0.5;
        } else {
            return 0;
        }
    }
}
