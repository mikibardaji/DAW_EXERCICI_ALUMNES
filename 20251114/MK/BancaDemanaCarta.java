package Tarjetas;

public class BancaDemanaCarta {
    public static boolean bancaDemanaCarta(double puntsJugador, double puntsBanca) {
        if ((puntsJugador <= 7.5 && puntsBanca < puntsJugador) || puntsBanca < 5) {
            return true;
        } else {
            return false;
        }
    }
}
