import java.util.Scanner;

public class Ejercicio__12__teorias_condicionales {
    public static void main(String[] args) throws Exception {

        // Pedir color del semáforo al usuario

        // Si color == "V"

        // Mostrar "Puedes pasar"

        // Si color == "N"

        // Mostrar "Debes correr"

        // Si el color == "R"

        // Mostrar "Tienes que parar"

        Scanner sc = new Scanner(System.in);

        char color;

        System.out.println("Introduce el color del semaforo (V-verde, N-Naranja, R-Rojo): ");

        color = sc.next().charAt(0);

        if (color == 'V') {

            System.out.println("Puedes pasar");

        } else if (color == 'N') {

            System.out.println("Debes correr");

        } else if (color == 'R') {

            System.out.println("Tienes que parar");
        } else {

            System.out.println("Valor incorrecto, introduce V, N o R");
        }

    }
}
