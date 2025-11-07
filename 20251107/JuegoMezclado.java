import java.util.Random;
import java.util.Scanner;

public class JuegoMezclado {
    public static void main(String[] args) {
        Random rd = new Random();
        int numero = rd.nextInt(0, 3);
        System.out.println("Número aleatorio: " + numero);

        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero");
        int user = sc.nextInt();
        int point = aumenta_punto(user);
        System.out.println("punto aumentado " + point);

    }

    // 1//

    public static int jugada(String frase) {
        Scanner sc = new Scanner(System.in);
        int jugada;

        do {
            System.out.print(frase);
            jugada = sc.nextInt();

            if (jugada < 0 || jugada > 2) {
                System.out.print("Solo puedes poner 0, 1 o 2.");
            }

        } while (jugada < 0 && jugada > 2);

        return jugada;
    }

    // 3//
    public static void imp_jugada(String quien_juega, int choose) {
        if (choose == 0) {
            System.out.println(quien_juega + " ha elegido Piedra");
        } else if (choose == 1) {
            System.out.println(quien_juega + " ha elegido Papel");
        } else if (choose == 2) {
            System.out.println(quien_juega + " ha elegido Tijera");
        } else {
            System.out.println(quien_juega + " ha elegido una opción no válida");
        }
    }

    // 4//
    public static void imp_ganador(int ganador) {
        if (ganador == 0) {
            // System.out.println("hay empate");
        } else if (ganador == 1) {
            // System.out.println("has ganado");
        } else if (ganador == 2) {
            // System.out.println("ha ganado el ordenador");
        }
    }

    // 5//
    public static void marcador(int point_player1, int point_player2) {
        System.out.println(" MARCADOR ");
        System.out.println("Jugador 1: " + point_player1 + " puntos");
        System.out.println("Jugador 2: " + point_player2 + " puntos");
    }

    // 6//
    public static int aumenta_punto(int score) {
        final int aumentaDeUno = 1;
        return score + aumentaDeUno;
    }

    // 7//

    public static int gandor(int choose_player1, int choose_player2) {
        int winner;

        if (choose_player1 == 0 && choose_player2 == 2) { // j1 piedra-tijera
            // System.out.print("ha ganado el jugador --> ");
            return 1;
        } else if (choose_player1 == 1 && choose_player2 == 0) { // j1 papel-piedra
            // System.out.print("ha ganado el jugador --> ");
            return 1;
        }

        else if (choose_player1 == 2 && choose_player2 == 1) { // j1 tijera-papel
            // System.out.print("ha ganado el jugador --> ");
            return 1;
        }
        // ******************EMPATES**********//
        else if (choose_player1 == 0 && choose_player2 == 0) {
            // System.out.print("hay empate --> ");
            return 0;
        } else if (choose_player1 == 1 && choose_player2 == 1) {
            // System.out.print("hay empate --> ");
            return 0;
        } else if (choose_player1 == 2 && choose_player2 == 2) {
            // System.out.print("hay empate --> ");
            return 0;
        } else {
            // System.out.print("ha ganado el ordenador --> ");
            return 2;
        }
    }

    //8//
    public static int pedirPuntosPartida() {
Scanner sc = new Scanner(System.in);
int puntos = 0;

while (true) {
System.out.print("¿A cuántos puntos quieres que sea la partida? (1-20): ");

if (sc.hasNextInt()) {
puntos = sc.nextInt();

if (puntos > 0 && puntos <= 20) {
return puntos;
} else {
System.out.println("La puntuación debe ser positiva y no superar 20.");
}
} else {
System.out.println("️Debes ingresar un número entero válido.");
sc.next();
}

}
    }
}
