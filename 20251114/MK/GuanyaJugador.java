package Tarjetas;

public class GuanyaJugador {
    public static boolean guanyaJugador(double puntsJugador, double puntsBanca) {
        if ((puntsJugador <= 7.5 && puntsJugador > puntsBanca) || puntsBanca > 7.5) {
            return true;
        } else {
            return false;
        }
    }
}
