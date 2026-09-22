/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.pkg3;

import java.util.Scanner;

/**
 *
 * @author dgr4354
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int base;
    int altura;
    int area;
        System.out.println("Introduce medida de la base del rectangulo");
    base = teclado.nextInt();
        System.out.println("Introduce medida de la altura del rectangulo");
    altura = teclado.nextInt();
    area = base * altura;
        System.out.println("El area del rectangulo es " + area);
        
    }
    
}
