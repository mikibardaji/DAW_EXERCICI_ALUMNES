import java.util.Scanner;

import Objeto.Persona;

public class Mainpersona {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     Persona p1 = new Persona();
     Persona p2 = new Persona();


        System.out.println(" DNI de la primera persona: ");
            p1.setDni(sc.nextLine());
            System.out.print("  Nombre de la primera persona: ");
            p1.setNombre(sc.nextLine());
            System.out.print("  Apellido de la primera persona:  ");
            p1.setApellidos(sc.nextLine());
            System.out.print("  Edad de la primera persona  ");
            p1.setEdad(sc.nextInt());
            sc.nextLine();

        System.out.println();

        System.out.println("    DNI de la segunda persona:   ");
         p2.setDni(sc.nextLine());
        System.out.print("  Nombre de la segunda persona:    ");
            p2.setNombre(sc.nextLine());
            System.out.print(" Apellido de la segunda persona:   ");
            p2.setApellidos(sc.nextLine());
            System.out.print("  Edad de la segunda persona:  ");
            p2.setEdad(sc.nextInt());
            sc.nextLine();

      

         System.out.println();

        System.out.println("Información de la primera persona:");
        p1.imprime();
        System.out.println();
        System.out.println("Información de la segunda persona:");
        p2.imprime();
        
    }
}








