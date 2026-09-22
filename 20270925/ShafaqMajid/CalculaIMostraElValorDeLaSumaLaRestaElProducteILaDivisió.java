/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcula.i.mostra.el.valor.de.la.suma.la.resta.el.producte.i.la.divisió;

import java.util.Scanner;

/**
 *
 * @author smo9104
 */
public class CalculaIMostraElValorDeLaSumaLaRestaElProducteILaDivisió {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Numero1, Numero2, resta, suma, multi, divisio;
        Scanner lector = new Scanner (System.in);
        // Mostrar “Un numero1”?
        System.out.println("Numero1");
        //Espera Numero1
        Numero1 = lector.nextInt();
        // Mostrar “Un numero2”?
        System.out.println("Numero2");
        //Espera Numero2
        Numero2 = lector.nextInt();
        // Calcula suma = Numero 1 + Numero 2 
        suma = Numero1 + Numero2;
        // MOstrar suma
        System.out.println("Suma de dos valor es " + suma);
        // Calcula resta = Numero 1 - Numero 2
        resta = Numero1 - Numero2;
        // MOstrar resta
        System.out.println("Resta de dos valor es " + resta);
         // Calcula Producte = Numero 1 * Numero 2
         multi = Numero1 - Numero2;
        // MOstrar producte
        System.out.println("Producte de dos valor es " + multi);
        // Calcula divisio  = Numero 1 / Numero 2
        divisio = Numero1 / Numero2;
        // MOstrar divisio
        System.out.println("Divisio de dos valor es " + divisio);
        
        
         
        
        
        
        

        
        


    }
    
}
