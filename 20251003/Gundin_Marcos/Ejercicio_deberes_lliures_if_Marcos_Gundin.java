import java.util.Scanner;

public class Ejercicio_deberes_lliures_if_Marcos_Gundin {
    public static void main(String[] args) throws Exception {

        // Pedir edad al usuario

        // Comprobar si es mayor de 18 anyos
        // Si no es mayor de edad pero tiene mas de 16 anyos no puede sacarse el carnet
        // pero si puede empezar a estudiar
        // Si es menor de 16 no puede hacer nada

        // Si es mayor preguntar si tiene el teorico
        // si tiene teorico empezar las practicas de conduccion

        // Si no lo tiene empezar a estudiar para el teorico

        // Mostrar resultado al usuario

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");

        int edad = sc.nextInt();

        // Comprobamos primero si tiene la edad mínima
        if (edad >= 18) {
            System.out.print("¿Has aprobado el examen teórico? (s/n): ");
            char teorico = sc.next().charAt(0);

            if (teorico == 's' || teorico == 'S') {
                System.out.println("¡Perfecto! Puedes continuar con las clases prácticas. ");
            } else {
                System.out.println("Primero debes aprobar el examen teórico. ");
            }
        } else if (edad >= 16 && edad < 18) {
            System.out.println("Puedes empezar a estudiar, pero aún no sacarte el carnet. ");
        } else {
            System.out.println("Eres demasiado joven para sacarte el carnet. ");
        }

    }
}
