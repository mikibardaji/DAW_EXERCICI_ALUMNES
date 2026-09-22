/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcula.l.àrea.d.un.quadrat.el.costat;

import java.util.Scanner;

/**
 *
 * @author smo9104
 */
public class CalculaLÀreaDUnQuadratElCostat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Costat;
        int Area;
        Scanner lector = new Scanner (System.in);
        //  Mostrar “Cual es el costat?”
        System.out.println("Cual es el costat");
        // Espera Costat
        Costat = lector.nextInt();
        // Calcula Area = Costat * Costat
         Area = Costat * Costat;
        // Mostrar “Al Area del Costat” + Area
        System.out.println("Al Area del Costat es " + Area);


        
        

    }
    
}
