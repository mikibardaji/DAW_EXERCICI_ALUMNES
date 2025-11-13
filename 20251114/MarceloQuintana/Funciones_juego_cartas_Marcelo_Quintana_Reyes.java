import java.util.Random;
import java.util.Scanner;

public class Funciones_juego_cartas_Marcelo_Quintana_Reyes {

public static void main(String[] args) {
}
public static int numero_carta_aleatori() {
    Random rd = new Random();
    int numero_alea = rd.nextInt(0, 11);

    if (numero_alea == 8) {
        return 10;
    } else if (numero_alea == 9) {
        return 11;
    } else if (numero_alea == 10) {
        return 12;
    } else {
        return numero_alea;
    }
}

public static int pal_carta_aleatori () {
    Random rd = new Random();
    int valor = rd.nextInt(0, 5);
    return valor;
}

   public static void imprimir_carta(int numeroCarta, int paloCarta) {

        System.out.print("Carta: ");
        if (numeroCarta >= 1 && numeroCarta <= 7) {
            System.out.print(numeroCarta);
        } else if (numeroCarta == 10) {
            System.out.print("SOTA");
        } else if (numeroCarta == 11) {
            System.out.print("CABALLO");
        } else if (numeroCarta == 12) {
            System.out.print("REY");
        }

        System.out.print(" de ");
        if (paloCarta == 1) {
            System.out.println("OROS");
        } else if (paloCarta == 2) {
            System.out.println("BASTOS");
        } else if (paloCarta == 3) {
            System.out.println("ESPADAS");
        } else if (paloCarta == 4) {
            System.out.println("COPAS");
        }
    }

public static double punts_carta(int numero_carta) {
    if (numero_carta >=1 && numero_carta <=7) {
        return numero_carta;  
    }
    else if (numero_carta == 10 || numero_carta == 11 || numero_carta ==12) {
       return 0.5;
    }
     else {
        return 0; 
    }
}  
public static boolean banca_demana_carta(double puntsJugador, double puntsBanca) {

    if (puntsJugador <= 7.5 && puntsBanca < puntsJugador) {
        return true;
    }
    if (puntsBanca < 5) {
        return true;
    }
    return false;
}

public static boolean guanya_jugador (double puntsJugador, double puntsBanca) {

    if (puntsJugador <= 7.5 && puntsJugador > puntsBanca) {
        System.out.println(" Ha ganado el jugador ");
        return true;
    }
    else if (puntsBanca > 7.5) {
        System.out.println(" Ha ganado el jugador ");
        return true;
    }
    else  {
        System.out.println(" Gano la Banca ");
        return false;
    }
}

}
