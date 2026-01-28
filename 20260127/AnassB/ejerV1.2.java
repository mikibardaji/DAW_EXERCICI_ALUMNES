import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosEnteros = new int[10];
        String opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("A -> Mostrar valores");
            System.out.println("B -> Introducir valor");
            System.out.println("C -> Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("a")) {
                mostrarNumeros(numerosEnteros);
            } else if (opcion.equalsIgnoreCase("b")) {
                cambiarValor(numerosEnteros, sc);
            }
        } while (!opcion.equalsIgnoreCase("c"));
        
        System.out.println("Programa finalizado.");
    }

    private static void mostrarNumeros(int[] numerosEnteros) {
        System.out.print("Contenido del array: ");
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.print(numerosEnteros[i] + (i < numerosEnteros.length - 1 ? " - " : ""));
        }
        System.out.println();
    }

    private static void cambiarValor(int[] numerosEnteros, Scanner sc) {
        int posicion;
        
        do {
            System.out.print("¿En qué posición (1 a " + numerosEnteros.length + ") quieres entrar el valor?: ");
            posicion = sc.nextInt();
            
            if (posicion < 1 || posicion > numerosEnteros.length) {
                System.out.println("Error: La posición debe estar entre 1 y " + numerosEnteros.length);
            }
        } while (posicion < 1 || posicion > numerosEnteros.length);

        int indice = posicion - 1; 

        boolean proceder = true;
        if (numerosEnteros[indice] != 0) {
            System.out.print("La posición ya tiene el valor " + numerosEnteros[indice] + ". ¿Quieres machacarlo? (s/n): ");
            sc.nextLine(); 
            String respuesta = sc.nextLine();
            
            if (!respuesta.equalsIgnoreCase("s")) {
                proceder = false;
                System.out.println("Operación cancelada.");
            }
        }

        if (proceder) {
            System.out.print("Introduce el nuevo valor V: ");
            int valor = sc.nextInt();
            numerosEnteros[indice] = valor;
            System.out.println("Valor guardado correctamente.");
        }

        sc.nextLine(); 
    }
}
