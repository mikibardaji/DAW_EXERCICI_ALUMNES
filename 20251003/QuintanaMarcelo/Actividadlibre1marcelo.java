
// 1. Declarar variable temperatura
// 2. Pedir al usuario que introduzca la temperatura actual
// 3. Evaluar la temperatura:
//      Si temperatura < 10
//          Mostrar "Hace bastante frío. ¡Abrígate bien!"
//      Sino, si temperatura == 20
//          Mostrar "La temperatura es perfecta, ni frío ni calor."
//      Sino, si temperatura < 25
//          Mostrar "El clima está templado. ¡Perfecto para salir!"
//      Sino
//          Mostrar "Hace mucho calor. ¡No olvides hidratarte!"

import java.util.Scanner;

public class Actividadlibre1marcelo {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int temperatura;
    System.out.println("Introduce la temperatura actual:");
    temperatura = sc.nextInt();
    if (temperatura < 10) {
        System.out.println("Hace bastante frío. ¡Abrígate bien!");
    } else if (temperatura == 20) {
        System.out.println("La temperatura es perfecta, ni frío ni calor.");
    } else if (temperatura < 25) {
        System.out.println("El clima está templado. ¡Perfecto para salir!");
    } else {
        System.out.println("Hace mucho calor. ¡No olvides hidratarte!");






    }
    }
}


