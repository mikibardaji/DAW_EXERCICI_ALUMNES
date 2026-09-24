/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;

/**
 *
 * @author myths
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Inicio
//Declaración de variables y System
        Scanner sc = new Scanner(System.in);
       double precio_Art;
        int porcen_Desc;
        double precio_Final;
//Mostrar: Cuanto vale el articulo?
        System.out.println("Cuanto vale el articulo?");
//Esperar precio_Art
        precio_Art = sc.nextDouble ();
//Mostrar: Que porcentaje de descuento se aplica sobre el articulo?
        System.out.println("Que porcentaje de descuento se aplica sobre el articulo");
//Esperar porcen_Desc
        porcen_Desc =(int) sc.nextDouble ();
//Calcular precio_Final = precio_Art - (precio_Art * porcen_Desc / 100)
        precio_Final = precio_Art - (precio_Art * porcen_Desc / 100);       
//Mostrar: “Su articulo vale” + precio_Final
        System.out.println("Su articulo vale " + precio_Final);
 //Fin

    }
    
}
