import java.util.Scanner;

public class SemaforsInfantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Color del semáforo (V-Verde, T-Amarillo, R-Rojo): ");
        String color = scanner.nextLine().toUpperCase();
        
        if (color.equals("V")) {
            System.out.println("Puedes pasar");
        } else if (color.equals("T")) {
            System.out.println("Espera, va a cambiar a rojo");
        } else if (color.equals("R")) {
            System.out.println("¡PARATE! Espera a que se ponga verde");
        } else {
            System.out.println("Color no válido");
        }
        
        scanner.close();
    }
}
