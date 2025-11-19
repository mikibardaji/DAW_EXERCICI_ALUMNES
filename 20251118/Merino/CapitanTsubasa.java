import java.util.Random;
import java.util.Scanner;

public class CapitanTsubasa {
    public static void main(String[] args) throws Exception {
         
         
    }
        
        public static char elegirLadoJugador () {
            Scanner sc = new Scanner(System.in);
            char opcion;

            do {
           
            System.out.println("Elige una opción (L = Left, R = Right, C = Center):");
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


        public static boolean hayGol (int opcion, int opcionaleatoria) {
            if (opcion != opcionaleatoria) {
                System.out.println("¡¡¡GOOOOOOL!!!");
                return true;
            } else {
                System.out.println("<<Paradón>>");
                return false;
            }
        }

        public static void marcador (int golesjugador, int golesmaquina) {
            System.out.println("********************");
            System.out.println("*  Jugador " + golesjugador + "  *");
            System.out.println("*  Máquina " + golesmaquina + "  *");
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
    

