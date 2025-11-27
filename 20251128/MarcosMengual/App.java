import java.util.Scanner;

import Objetos.Persona;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        Persona a1 = new Persona();
        Persona a2 = new Persona();

         System.out.println(" DNI de la primera persona: ");
            a1.setDni(sc.nextLine());
            System.out.print("  Nombre de la primera persona: ");
            a1.setNombre(sc.nextLine());
            System.out.print("  Apellido de la primera persona:  ");
            a1.setApellidos(sc.nextLine());
            System.out.print("  Edad de la primera persona:  ");
            a1.setEdad(sc.nextInt());
            sc.nextLine();


        System.out.println();
        

            System.out.println(" DNI de la segunda persona: ");
            a2.setDni(sc.nextLine());
            System.out.print(" Nombre de la segunda persona: ");
            a2.setNombre(sc.nextLine());
            System.out.print(" Apellido de la segunda persona: ");
            a2.setApellidos(sc.nextLine());
            System.out.print(" Edad de la segunda persona: ");
            a2.setEdad(sc.nextInt());
            sc.nextLine();


        System.out.println();
        

            System.out.println("Información de la primera persona:");
            a1.imprime();
            System.out.println();
            System.out.println("Información de la segunda persona:");
            a2.imprime();
        
    }
}

