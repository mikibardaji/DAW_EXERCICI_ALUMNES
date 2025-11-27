import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("=== CREACIÓN DE PERSONA ===");

        System.out.print("Introduce el DNI: ");
        String dni = sc.nextLine();

        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce los apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Creamos la persona con el constructor nuevo
        Persona p = new Persona(dni, nombre, apellidos, edad);

        System.out.println("\nPersona creada:");
        System.out.println(p.toString());
        System.out.println();


       
        Vaso vaso1 = new Vaso();

       
        System.out.print("Introduce el material para el vaso 2: ");
        String materialUsuario = sc.nextLine();
        VasoPremium vaso2 = new VasoPremium(materialUsuario);

       
        System.out.println("\n=== DATOS DE LOS VASOS ===");
        System.out.println("Vaso 1 material: " + vaso1.getMaterial() +
                           ", capacidad: " + vaso1.getCapacitat() + " ml");
        System.out.println("Vaso 2 material: " + vaso2.getMaterial() +
                           ", capacidad: " + vaso2.getCapacitat() + " ml");

       
        vaso1.rellenar(8);
        vaso2.rellenar(4);

        System.out.println("\nContenido vaso 1: " + vaso1.getContenido());
        System.out.println("Contenido vaso 2: " + vaso2.getContenido());

  
        System.out.println("\n=== VERTER DE DOS ===");
        System.out.println("Vaso 1 vierte: " + vaso1.verterDeDos());
        System.out.println("Vaso 2 vierte: " + vaso2.verterDeDos());

  
        System.out.println("\n=== BEBER DE GOLPE ===");
        System.out.println("Vaso 1 bebido de golpe: " + vaso1.beberDeGolpe());
        System.out.println("Vaso 2 bebido de golpe: " + vaso2.beberDeGolpe());

        sc.close();
    }
}
