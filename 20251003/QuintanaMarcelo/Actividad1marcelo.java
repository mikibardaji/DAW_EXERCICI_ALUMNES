
// Que te diga si hace frío, templado o calor

// 1. Declarar variable temperatura
// 2. Pedir al usuario que introduzca la temperatura actual
// 3. Si temperatura < 10 → mostrar "Hace bastante frío. ¡Abrígate bien!"
// 4. Si temperatura == 20 → mostrar "La temperatura es perfecta, ni frío ni calor."
// 5. Si temperatura < 25 → mostrar "El clima está templado. ¡Perfecto para salir!"
// 6. Si no (else) → mostrar "Hace mucho calor. ¡No olvides hidratarte!"

import java.util.Scanner;

public class Actividad1marcelo {
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
