// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {  
        //Definir
        Scanner teclado = new Scanner (System.in);
        String producto_estado;
        String usuario, rol;


        //Ejercicio 1
        System.out.println("Como esta el estado del producto, Nou, Com Nou, Bo o Acceptable?");
        producto_estado = teclado.nextLine();
        if (producto_estado.equalsIgnoreCase("Nou") || producto_estado.equalsIgnoreCase("Com Nou")) {
            System.out.println("Producte excellent. Es publicara rapidament.");
    } else {
            System.out.println("Producte acceptat per al cataleg");
        }
//Ejercicio 2
    System.out.println("Introduce tu nombre de usuario: ");
        usuario = teclado.nextLine();
    System.out.println("Introduce tu rol (estudiant / administrador): ");
        rol = teclado.nextLine();


    if (rol.equalsIgnoreCase("administrador")) {
        System.out.println("Acces permes. Pots gestionar els usuaris");
    } else {
        System.out.println ("Acces denegat. Nomes els administradors tenen aquest permis ");
    }


        
    }
        
}
