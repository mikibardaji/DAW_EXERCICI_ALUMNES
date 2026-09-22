/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.pkg2;

import java.util.Scanner;

/**
 *
 * @author dgr4354
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int lado;
    int area;
        System.out.println("Introduce medida de un lado del cuadrado");
    lado = teclado.nextInt();
    area = lado * lado;
        System.out.println("El area del cuadrado es " + area);
    }
    
}
