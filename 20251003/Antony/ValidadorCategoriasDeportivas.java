import java.util.Scanner;

public class ValidadorCategoriasDeportivas {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el año de nacimiento al usuario
        System.out.print("Introduce el año de nacimiento del federado: ");
        int añoNacimiento = scanner.nextInt();
        
        // Variable para almacenar la categoría
        String categoria;
        
        // Validar que el año no sea anterior a 1924
        if (añoNacimiento < 1924) {
            System.out.println("Este año no es válido para jugar en categorías actuales");
            return; // Salimos del programa inmediatamente
        } 
        // Determinar la categoría según el año
        // Verificamos en orden de años más recientes a más antiguos
        else if (añoNacimiento >= 2013) {
            categoria = "sin categoría";
        } else if (añoNacimiento >= 2011) {
            categoria = "S14";
        } else if (añoNacimiento >= 2009) {
            categoria = "S16";
        } else if (añoNacimiento >= 2007) {
            categoria = "S18";
        } else if (añoNacimiento >= 1991) {
            categoria = "Absoluta";
        } else {
            categoria = "Veteranos";
        }
        
        // Mostrar el resultado final
        System.out.println("El/la jugador/a estará federado en la categoría " + categoria);
        
        // Cerrar el scanner
        scanner.close();
    }
}
