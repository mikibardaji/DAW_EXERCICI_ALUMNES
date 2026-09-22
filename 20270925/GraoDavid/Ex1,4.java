/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.pkg4;

import java.util.Scanner;

/**
 *
 * @author dgr4354
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion, division;
    
        System.out.println("Introduce el primer numero");
    num1 = teclado.nextDouble();
    System.out.println("Introduce el segundo numero");
    num2= teclado.nextDouble();
    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;
        System.out.println("La suma de los dos números da " + suma);
        System.out.println("La resta de los dos números da " + resta);
        System.out.println("La multiplicación de los dos números da " + multiplicacion);
        System.out.println("La división de los dos números da " + division);
        
    }
    
}
