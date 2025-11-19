import java.util.Random;
import java.util.Scanner;

public class Capitan_Tsubasa_Marcelo_Quintana_Reyes {
    public static void main(String[] args)  {

    }

     public static char elegirLadoJugador () {
            Scanner sc = new Scanner(System.in);
            char opcion;

            do {
           
            System.out.println("Elige una opción (O = Left, 1 = Right, 2 = Center):");
            opcion = sc.next().charAt(0);

            if (opcion != 'L' && opcion != 'R' && opcion !=  'C') {
                System.out.println("Opción no válida, inténtalo de nuevo.");
            }
             
            } while (opcion != 'L' && opcion != 'R' && opcion !=  'C');
            return opcion;
        } 

    public static char elegirLadoMaquina () {
            Random rd = new Random();
            int opcionaleatoria = rd.nextInt(0,3);

            if (opcionaleatoria == 0) {
                return 'L';
            } else if (opcionaleatoria == 1) {
                return 'R';
            } else if (opcionaleatoria == 2) {
                return 'C';
            } 
            return 0;
        }

    public static boolean hay_gol(String tirador, String portero) {
        if (tirador.equals(portero)) {
            System.out.println("<<Paradón>>");
            return false;
        } else {
            System.out.println("¡¡¡GOOOOOOL!!!");
            return true;
        }
    }

    public static void marcador(int golesJugador, int golesMaquina) {
        System.out.println("********************");
        System.out.println("*  Jugador  " + golesJugador + "  *");
        System.out.println("*  Máquina  " + golesMaquina + "  *");
        System.out.println("********************");
    }

    public static boolean hayQueSeguirTirando(int golesjugador, int golesmaquina, int numero_tanda_penaltis) {
             int diferencia;
             int tandasQueQuedan = 5 - numero_tanda_penaltis;  

             if (golesjugador > golesmaquina) {
                diferencia = golesjugador - golesmaquina;
             } else {
                diferencia = golesmaquina - golesjugador;
             }

            if (diferencia > tandasQueQuedan) {
               return false; 
             } else {
               return true; 
             }
        }

}
    
