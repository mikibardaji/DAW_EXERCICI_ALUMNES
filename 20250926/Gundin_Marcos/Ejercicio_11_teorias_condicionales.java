import java.util.Scanner;

public class Ejercicio_11_teorias_condicionales {
    public static void main(String[] args) throws Exception {

        // Pedir precio

        // Preguntar cuanto dinero a pagado

        // Calcular la diferencia = dinero - precio

        // Si diferencia == 0 → Mostrar "Pago exacto"

        // Si diferencia > 0 → Mostrar "Sobran X euros"

        // Si diferencia < 0 → Mostrar "Faltan X euros"

        // Mostrar el resultado al usuario

        double precio, dinero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        precio = sc.nextDouble();

        System.out.print("Introduce el dinero con el que vas a pagar: ");
        dinero = sc.nextDouble();

        double resta = dinero - precio;

        if (resta > 0) {
            System.out.println("Te Sobran " + resta + " euros.");
        } else if (resta < 0) {
            System.out.println("Te Faltan " + (-resta) + " euros.");
        } else {
            System.out.println("No tienes nigun cambio, el pago es exacto");
        }
    }
}
