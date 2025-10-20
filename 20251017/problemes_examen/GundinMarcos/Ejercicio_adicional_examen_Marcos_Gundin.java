import java.util.Scanner;

public class Ejercicio_adicional_examen_Marcos_Gundin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;
        int comptador = 0;
        do {
            System.out.print("Introdueix un numero: ");
            nombre = sc.nextInt();
            if (nombre > 0 && nombre % 2 == 0)
                comptador++;
        } while (nombre > 0);
        System.out.println("Nombres parells introduits: " + comptador);
    }
}
