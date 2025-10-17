import java.util.Scanner;

public class Ejercicio_Deberes_adivinar_numero_Marcos_Gundin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int intento;
        char respuesta;

        System.out.println("Piensa en un número del 1 al 100 y no me lo digas...");
        System.out.println("Presiona ENTER cuando estés listo.");
        sc.nextLine();

        do {
            intento = (min + max) / 2;
            System.out.println("¿Es " + intento + " tu número?");
            System.out.print("Responde con (M = mayor / N = menor / C = correcto): ");
            respuesta = sc.next().charAt(0);

            if (respuesta == 'M' | respuesta == 'm') {
                min = intento + 1;
            } else if (respuesta == 'N' | respuesta == 'n') {
                max = intento - 1;
            } else if (respuesta != 'C' && respuesta != 'c') {
                System.out.println("Respuesta no válida. Usa solo M, N o C.");
            }

        } while (respuesta != 'C' && respuesta!= 'c');

        System.out.println("He adivinado tu numero!");
    }
}