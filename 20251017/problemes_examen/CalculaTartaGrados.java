import java.util.Random;
import java.util.Scanner;

public class CalculaTartaGrados {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int ordenador_piensa_grados = rd.nextInt(160,221);
        int numero, contador = 0;
        System.out.print("Ajusta la temperatura del horno (Entre 160º y 220º)"); 
        
         do {
        numero = sc.nextInt();
        contador++;
        if (numero < ordenador_piensa_grados) {
            System.out.println("Demasiado frío. ¿Te gusta comer tarta congelada?.");
        }
        else if (numero > ordenador_piensa_grados) {
            System.out.println("Demasiado caliente. Vas a comer tarta quemada.");
        }
        else if (numero == ordenador_piensa_grados) {
            System.out.println("¡¡Perfecto!! " + ordenador_piensa_grados + "º es la temperatura ideal.");
        } 
      } while (numero != ordenador_piensa_grados && contador <= 10);

          if (numero == ordenador_piensa_grados) {
            System.out.println("Menos mal... ¡Qué aproveche!");
      }
      else {
        System.out.println("Demasiados intentos. Dedícate a otra cosa, no se te da bien hacer postres.");
      }
    

    }
}
