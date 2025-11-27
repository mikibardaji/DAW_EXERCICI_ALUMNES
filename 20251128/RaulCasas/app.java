/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;

import Objetos.Persona;
import java.util.Scanner;

/**
 *
 * @author rasu2
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Persona a1 = new Persona();
        Persona a2 = new Persona();

        System.out.println("DNI de la primera persona: ");
        a1.setDni(sc.nextLine());
        System.out.print("Nombre de la primera persona: ");
        a1.setNombre(sc.nextLine());
        System.out.print("Apellido de la primera persona:  ");
        a1.setApellidos(sc.nextLine());
        System.out.print("Edad de la primera persona:  ");
        a1.setEdad(sc.nextInt());
        sc.nextLine();
        
        System.out.println();
        System.out.println("DNI de la segunda persona: ");
        a2.setDni(sc.nextLine());
        System.out.print("Nombre de la segunda persona: ");
        a2.setNombre(sc.nextLine());
        System.out.print("Apellido de la segunda persona: ");
        a2.setApellidos(sc.nextLine());
        System.out.print("Edad de la segunda persona: ");
        a2.setEdad(sc.nextInt());
        sc.nextLine();
        
        System.out.println();       
        System.out.println("primera persona:");
        a1.imprime();
        System.out.println();
        System.out.println("segunda persona:");
        a2.imprime();      
    }
}
