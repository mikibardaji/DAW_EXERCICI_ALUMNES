/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5circumferencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex5Circumferencia {

    /**
     * Programa que pren com a dada d'entrada un n�mero que correspon a la longitud d'un radi 
     * i ens escriu la longitud de la circumfer�ncia, 
     * l'�rea del cercle i el volum de l'esfera que es corresponen amb aquest radi.
     */
    public static void main(String[] args) {
       final double PI = 3.14;
        double radio, longitudCircum, areaCirculo;
        
        Scanner lector = new Scanner (System.in);
        // definir constante PI=3.14
        // Mostrar cual es el radio de circum?
        System.out.println("Cual es el radio de circum? ");
        //Esperar radio
        radio = lector.nextDouble();
        //Calcular longitudCircum = 2*PI*radio
        longitudCircum = 2 * PI * radio;
        //Mostrar Longitud circumferencia es , longitudCircum
        System.out.println("LA longitud es " + longitudCircum);
        //Calcular areaCirculo = (PI*radio*radio)
        areaCirculo = PI+radio*radio;
         //Mostrar areaCirculo
        System.out.println("LA area es " + areaCirculo);
    }
    
}
