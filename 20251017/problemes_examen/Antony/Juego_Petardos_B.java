import java.util.Random;
import java.util.Scanner;

public class Juego_Petardos_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Juego de los pertados - version B");
        System.out.print("Elige un petardo (1, 2 o 3): ");
        int eleccion = sc.nextInt();
        
        // Crear los tres petardos con valores aleatorios
        int petardo1 = rand.nextInt(21);
        int petardo2 = rand.nextInt(21);
        int petardo3 = rand.nextInt(21);
        
        System.out.println("Los petardos tienen estos valores:");
        System.out.println("Petardo 1: " + petardo1);
        System.out.println("Petardo 2: " + petardo2);
        System.out.println("Petardo 3: " + petardo3);
        
        // Encontrar cuál es el más grande
        int masGrande = petardo1;
        if (petardo2 > masGrande) {
            masGrande = petardo2;
        }
        if (petardo3 > masGrande) {
            masGrande = petardo3;
        }
        
        // Comprobar si has ganado
        int miPetardo = 0;
        if (eleccion == 1) {
            miPetardo = petardo1;
        }
        if (eleccion == 2) {
            miPetardo = petardo2;
        }
        if (eleccion == 3) {
            miPetardo = petardo3;
        }
        
        if (miPetardo == masGrande) {
            System.out.println("¡Has GANADO! ");
        } else {
            System.out.println("¡Has PERDIDO! ");
        }
        
        // Ahora pintamos los caminos con bucle
        System.out.println("\nPintando los caminos...");
        System.out.println("P1  P2  P3");
        System.out.println("--  --  --");
        
        // Encontrar la altura máxima para saber cuántas filas pintar
        int alturaMaxima = masGrande;
        
        // Bucle para pintar de arriba a abajo
        for (int fila = alturaMaxima; fila >= 1; fila--) {
            
            // Para el petardo 1
            if (petardo1 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }
            
            // Para el petardo 2
            if (petardo2 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }
            
            // Para el petardo 3
            if (petardo3 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }
            
            System.out.println();  // Salto de línea
            Thread.sleep(500);     // Esperar medio segundo
        }
        
        // Pie de la tabla
        System.out.println("P1  P2  P3");
        System.out.println(petardo1 + "  " + petardo2 + "  " + petardo3);
        
        sc.close();
    }
}