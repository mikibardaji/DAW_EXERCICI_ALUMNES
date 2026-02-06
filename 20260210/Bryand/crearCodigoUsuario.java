import java.util.Scanner;
public class crearCodigoUsuario {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce el primer apellido");
        String apellido1 = sc.nextLine();
        System.out.println("Introduce el segundo apellido");
        String apellido2 = sc.nextLine();

            String codigoUsuario = nombre.substring(0, 3).toUpperCase() + apellido1.substring(0, 3).toUpperCase() + apellido2.substring(0, 3).toUpperCase();
            System.out.println("El codigo de usuario es: " + codigoUsuario);
        }
    }