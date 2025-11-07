public class F6 {

    
    public static int aumentar_punto(int score) {
        return score + 1;
    }

    public static void main(String[] args) {
        int puntosJugador = 3;
        puntosJugador = aumentar_punto(puntosJugador);
        System.out.println("Puntos del jugador: " + puntosJugador); 
    }
}
