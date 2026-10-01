import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Rol (estudiante / administrador): ");
        String rol = sc.nextLine();

        if (rol.equalsIgnoreCase("administrador")) {
            System.out.println("Acceso permitido. Puedes gestionar los usuarios.");
        } else {
            System.out.println("Acceso denegado. Solo los administradores tienen este permiso.");
        }
    }
}
