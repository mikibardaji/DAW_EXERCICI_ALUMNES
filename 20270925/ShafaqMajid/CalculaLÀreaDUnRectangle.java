/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcula.l.àrea.d.un.rectangle;

import java.util.Scanner;

/**
 *
 * @author smo9104
 */
public class CalculaLÀreaDUnRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, Area;
        Scanner lector = new Scanner (System.in);
        // Mostrar “Cuál es la base”?
        System.out.println("Cual es la base? ");
        //Espera Base
        base = lector.nextInt();
        //Mostrar “Cuál es la altura”?
        System.out.println("Cual es la altura? ");
        //Espera Altura
        altura = lector.nextInt();
        //Calcula Area = Base * Altura
        Area = base * altura;
        //Mostrar “l'àrea d'un rectangle es ” + Area
        System.out.println("l'area d'un rectangle es " + Area);

        



    }
    
}
