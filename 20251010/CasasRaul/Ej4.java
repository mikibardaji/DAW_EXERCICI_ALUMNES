/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author rasu2
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
        
        System.out.print("Dime un numero");
        numero = sc.nextInt();
        
        do{
            contador++;
            System.out.println(contador);
        }while(contador != numero);
    }
    
}
