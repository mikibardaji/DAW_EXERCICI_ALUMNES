/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6preudescompte;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ex6PreuDescompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double preu, descompte, preuDefinitiu, preuDescomptat;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuanto cuesta el producto");
        preu = teclado.nextDouble();
        System.out.println("Ahora dime cuanto porcentaje de descuento hay");
        descompte = teclado.nextDouble();
        descompte /= 100;
        preuDescomptat = preu * descompte;
        preuDefinitiu = preu - preuDescomptat;
        System.out.println("El precio a pagar es "+preuDefinitiu+" €");
        System.out.println("");
    }
    
}
