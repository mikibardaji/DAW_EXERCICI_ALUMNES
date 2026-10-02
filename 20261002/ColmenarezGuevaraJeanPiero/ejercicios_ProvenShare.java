import java.util.Scanner;

class Main {
    public static void main(String[] args) {  
        //Definir
        Scanner teclado = new Scanner (System.in);
        String producto_estado;
        String usuario, rol;
        int servicios, servicios_credits;


        //Ejercicio 1
        System.out.println("Como esta el estado del producto, Nou, Com Nou, Bo o Acceptable?");
        producto_estado = teclado.nextLine();
        if (producto_estado.equalsIgnoreCase("Nou") || producto_estado.equalsIgnoreCase("Com Nou")) {
            System.out.println("Producte excellent. Es publicara rapidament.");
    } else {
            System.out.println("Producte acceptat per al cataleg");
        }
//Ejercicio 3
    System.out.println("Introduce tu nombre de usuario: ");
        usuario = teclado.nextLine();
    System.out.println("Introduce tu rol (estudiant / administrador): ");
        rol = teclado.nextLine();


    if (rol.equalsIgnoreCase("administrador")) {
        System.out.println("Acces permes. Pots gestionar els usuaris");
    } else {
        System.out.println ("Acces denegat. Nomes els administradors tenen aquest permis ");
    }

    //EJercicio 4
        System.out.println("Cuanto servicios ofreces para premiarte con creditos? ");
        servicios = teclado.nextInt();
        if(servicios == 0){
            servicios_credits = 10;
        }
        else if (servicios == 1 || servicios == 2) {
            servicios_credits = 50;
        }
            //Segunda opcion
       // else if (servicios => 1 || servicios <= 2) {
     //       servicios_credits = 50;
        //}
        else {
            servicios_credits = 100;
        }
            
System.out.println("Creditos adquiridos a " + usuario + " : " + servicios_credits + " proven-credits.");
        
    }
        
}
