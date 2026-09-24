/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.ejer8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejer8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       final double CELSIUS  = 32;
       
        double gr_fahrenheit,gr_celsius;
        //Mostra "pregunta cuanto es la temperatura"
        System.out.println("Pregunta cuanto es la tempertaura");
        //espera temperatura Mostra "graus Fahrenheit"
        gr_fahrenheit = teclado.nextDouble();
        //calcula
        gr_celsius = ( gr_fahrenheit - CELSIUS ) * 5/9;
        //Mostra "gr_celsius"
        System.out.println("greus celsius" + gr_celsius +"C");
    }
}

