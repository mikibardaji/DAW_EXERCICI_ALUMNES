/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.pkg1;

import java.util.Scanner;

/**
 *
 * @author dgr4354
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nombre;
        System.out.println("¿Como te llamas?");
        nombre = teclado.nextLine();
        System.out.println("Buenos días, " + nombre);
    }
    
}
