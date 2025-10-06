import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el peso al usuario
        System.out.print("Introduce tu peso en kg: ");
        double peso = scanner.nextDouble();
        
        // Mostrar el menú de medicamentos
        System.out.println("\n--- MENÚ DE MEDICAMENTOS ---");
        System.out.println("0- Ibuprofeno");
        System.out.println("1- Xarelto");
        System.out.println("2- Amoxicilina");
        System.out.println("3- Fluoxetina");
        System.out.print("Selecciona el medicamento (0-3): ");
        
        int opcion = scanner.nextInt();
        String medicamento = "";
        String cantidad = "";
        
        // PARTE COMPLICADA: Determinar la dosis según el medicamento y peso
        switch (opcion) {
            case 0: // Ibuprofeno
                medicamento = "Ibuprofeno";
                if (peso < 70) {
                    cantidad = "500mg";
                } else {
                    cantidad = "1g";
                }
                break;
                
            case 1: // Xarelto
                medicamento = "Xarelto";
                // PARTE COMPLICADA: Múltiples condiciones para Xarelto
                if (peso < 60) {
                    cantidad = "10mg";
                } else if (peso >= 60 && peso <= 80) {
                    cantidad = "15mg";
                } else {
                    cantidad = "20mg";
                }
                break;
                
            case 2: // Amoxicilina
                medicamento = "Amoxicilina";
                if (peso < 65) {
                    cantidad = "500mg";
                } else {
                    cantidad = "1g";
                }
                break;
                
            case 3: // Fluoxetina
                medicamento = "Fluoxetina";
                if (peso < 80) {
                    cantidad = "20mg";
                } else {
                    cantidad = "40mg";
                }
                break;
                
            default:
                System.out.println("Opción no válida. Debe ser un número entre 0 y 3.");
                scanner.close();
                return; // Salir del programa si la opción no es válida
        }
        
        // Mostrar el resultado final
        System.out.println("\nCon el peso de " + peso + "kg ha de tomar " + cantidad + " de " + medicamento);
        
        // Cerrar el scanner
        scanner.close();
    }
}