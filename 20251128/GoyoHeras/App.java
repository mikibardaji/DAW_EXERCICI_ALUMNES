import java.util.Scanner;

import Objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
    
//     Scanner sc = new Scanner(System.in);
//    System.out.println("Introduce los datos de la primera persona:");

//         System.out.print("DNI");
//         String dni1 = sc.nextLine();

//         System.out.print("Nombre");
//         String nombre1 = sc.nextLine();

//         System.out.print("Apellidos");
//         String apellidos1 = sc.nextLine();

//         System.out.print("Edad");
//         int edad1 = sc.nextInt();
//         sc.nextLine(); 

//         Persona p1 = new Persona(dni1, nombre1, apellidos1, edad1);
//         System.out.println("\nIntroduce los datos de la segunda persona:");

//         System.out.print("DNI");
//         String dni2 = sc.nextLine();

//         System.out.print("Nombre");
//         String nombre2 = sc.nextLine();

//         System.out.print("Apellidos");
//         String apellidos2 = sc.nextLine();

//         System.out.print("Edad");
//         int edad2 = sc.nextInt();
//         sc.nextLine(); 

//         Persona p2 = new Persona(dni2, nombre2, apellidos2, edad2);

//         System.out.println(" RESULTADOS ");
//         System.out.println( p1.getNombre() + " " + p1.getApellidos() +  " con DNI " + p1.getDni() +  (p1.esMayorDeEdad() ? " es mayor de edad." : " no es mayor de edad.")
//         );

//         System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + (p2.esMayorDeEdad() ? " es mayor de edad." : " no es mayor de edad."));


        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();


     p1.setDni("98765432A");
        p1.setNombre("Izan");
        p1.setApellidos("Gordillo");
        p1.setEdad(17);

        p2.setDni("25874639A");
        p2.setNombre("Goyo");
        p2.setApellidos("Heras");
        p2.setEdad(18);


    //     System.out.println("Persona 1: " + p1.getNombre() + " " + p1.getApellidos() + ", DNI " + p1.getDni() + ", edad " + p1.getEdad());
    //     System.out.println("Persona 2: " + p2.getNombre() + " " + p2.getApellidos() + ", DNI " + p2.getDni() + ", edad " + p2.getEdad());
    //     System.out.println("Persona 3: " + p3.getNombre() + " " + p3.getApellidos() + ", DNI " + p3.getDni() + ", edad " + p3.getEdad());

    
          System.out.println("Funcion imprime :");
        p1.imprime();
        p2.imprime();

        System.out.println("Funcion mayor edad : ");
         System.out.println("¿Izan es mayor de edad? " + p1.esMayorDeEdad());
        System.out.println("¿Goyo es mayor de edad? " + p2.esMayorDeEdad());

        System.out.println("Funcion jubilacion ");
          System.out.println("¿Izan es jubilado? " + p1.esJubilado());
        System.out.println("¿Goyo  es jubilada? " + p2.esJubilado());


        System.out.println("Funcion diferencia de edad : ");
       System.out.println("Diferencia de edad entre Miquel  y Laura : " +
                p1.diferenciaEdad(p2) + " años");

    }
}
