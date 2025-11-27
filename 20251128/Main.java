package Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Scanner sc = new Scanner(System.in);

       // Persona1 p1 = new Persona1();
       // Persona1 p2 = new Persona1();

        //Persona1 p1 = new Persona1(dni, nombre, apellidos, edad);
       // Persona1 p2 = new Persona1(dni2, nombre2, apellidos2, edad2);

        //System.out.println("Datos de la primera persona:");
        //System.out.print("Nombre: ");
        //p1.nombre = sc.nextLine();
        //System.out.print("Apellidos: ");
       // p1.apellidos = sc.nextLine();
       // System.out.print("DNI: ");
       // p1.dni = sc.nextLine();
       // System.out.print("Edad: ");
        //p1.edad = sc.nextInt();

        //System.out.println("Datos de la segunda persona:");
        //System.out.print("Nombre: ");
        //p2.nombre = sc.nextLine();
        //System.out.print("Apellidos: ");
        //p2.apellidos = sc.nextLine();
       // System.out.print("DNI: ");
        //p2.dni = sc.nextLine();
       // System.out.print("Edad: ");
        //p2.edad = sc.nextInt();

       // if (p1.esMayorDeEdad()) {
       //     System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " es mayor de edad.");
       // } else {
       //     System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " no es mayor de edad.");
       // }

        //if (p2.esMayorDeEdad()) {
       //     System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " es mayor de edad.");
      //  } else {
       //     System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " no es mayor de edad.");
       // }


    Persona1 p1 = new Persona1();
    Persona1 p2 = new Persona1();

    p1.setDni("12345678I");
    p1.setNombre("Yuji");
    p1.setApellidos("Ita Dori");
    p1.setEdad(32);


    p2.setDni("87654321G");
    p2.setNombre("Satoru");
    p2.setApellidos("Go Jo");
    p2.setEdad(28);


System.out.println("Persona 1: " + p1.getNombre() + " " + p1.getApellidos() + " (" + p1.getDni() + "), edad " + p1.getEdad());
System.out.println("Persona 2: " + p2.getNombre() + " " + p2.getApellidos() + " (" + p2.getDni() + "), edad " + p2.getEdad());

p1.setEdad(32);
p2.setNombre("Satoru");

System.out.println("Datos modificados: ");
System.out.println("P1 nueva edad: " + p1.getEdad());
System.out.println("P2 nuevo nombre: " + p2.getNombre());



       
    }
}