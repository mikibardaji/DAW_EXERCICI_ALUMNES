import java.util.Scanner;

public class ClashRoyaleCartas {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        // PASO 1: RECOGER DATOS
        System.out.print("Introduce tu número de copas: ");
        int copas = dato.nextInt();
        dato.nextLine(); // Limpiar buffer
        
        char opcionCarta;
        
        // Mostrar opciones según las copas
        if (copas < 2000) {
            System.out.println("Opciones disponibles:");
            System.out.println("m - Mago Electrico");
            System.out.println("e - Esbirro mega");
            System.out.print("Elige tu carta (m/e): ");
        } else if (copas >= 2000 && copas < 3000) {
            System.out.println("Opciones disponibles:");
            System.out.println("c - Caballero");
            System.out.println("b - Bandida");
            System.out.print("Elige tu carta (c/b): ");
        } else {
            System.out.println("Opciones disponibles:");
            System.out.println("e - Ejercito de esqueletos");
            System.out.println("g - Gigante");
            System.out.print("Elige tu carta (e/g): ");
        }
        
        opcionCarta = dato.nextLine().charAt(0);
        
        // PASO 2: PROCESOS
        String cartaElegida;
        
        if (copas < 2000) {
            if (opcionCarta == 'm' || opcionCarta == 'M') {
                cartaElegida = "Mago Electrico";
            } else if (opcionCarta == 'e' || opcionCarta == 'E') {
                cartaElegida = "Esbirro mega";
            } else {
                cartaElegida = "Opción inválida";
            }
        } else if (copas >= 2000 && copas < 3000) {
            if (opcionCarta == 'c' || opcionCarta == 'C') {
                cartaElegida = "Caballero";
            } else if (opcionCarta == 'b' || opcionCarta == 'B') {
                cartaElegida = "Bandida";
            } else {
                cartaElegida = "Opción inválida";
            }
        } else {
            if (opcionCarta == 'e' || opcionCarta == 'E') {
                cartaElegida = "Ejercito de esqueletos";
            } else if (opcionCarta == 'g' || opcionCarta == 'G') {
                cartaElegida = "Gigante";
            } else {
                cartaElegida = "Opción inválida";
            }
        }
        
        // PASO 3: MOSTRAR RESULTADO
        System.out.println("Has escollit " + cartaElegida);
        
        dato.close();
    }
}

