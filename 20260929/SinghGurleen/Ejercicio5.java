/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        final double ProvenShare = 8;
        double euro,creditos;
       
        System.out.println("Cuanto dinero tines?");
        euro = teclado.nextDouble();
        System.out.println("Dinero que tengo es:" + euro);
        creditos = euro * ProvenShare;
        System.out.println("Creditos:" + creditos);    }
}
