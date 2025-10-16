import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) throws Exception {
       
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int ordenador_piensa = rd.nextInt(1,100);
        int numero;
        System.out.print("¿Qué número crees que he pensado?"); 
        

      do {
        numero = sc.nextInt();
        if (numero < ordenador_piensa) {
            System.out.println("El número que me has dicho es más pequeño, dime uno más grande.");
        }
        else if (numero > ordenador_piensa) {
            System.out.println("El número que me has dicho es más grande, dime otro más pequeño.");
        }
        else if (numero == ordenador_piensa) {
            System.out.println("¡¡Has acertado!!");
        } 
      } while (numero != ordenador_piensa);
      
    

    }
}
