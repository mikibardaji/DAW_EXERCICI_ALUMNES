/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8controlmon;

import java.util.Scanner;

/**
 *
 * @author cdi1866
 */
public class Exercici8ControlMon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.Inicio, declaraciones y Scanner
         Scanner sc =new Scanner (System.in);
         String estadoLibro, mensaje ;
         int creditsEst, creditsLlibre;
         //2. Recolección de datos: el preu del llibre en crèdits,
         //els crèdits actuals de l'estudiant al moneder, i l'estat de disponibilitat del producte ("Disponible" o "Reservat").
         System.out.print("Cuantos creditos tienes en el monedero?");
         creditsEst = sc.nextInt() ;
         System.out.print("Cuanto dinero cuesta el libro?");
         creditsLlibre = sc.nextInt() ;
         System.out.print("Estado del libro? (Disponible/Reservado)");
            sc.nextLine();
            estadoLibro = sc.nextLine();
           
           if (creditsLlibre<=creditsEst && estadoLibro.equals("Disponible"))
           {
               mensaje = "Compra realizada!";
           }
           else if (creditsLlibre>creditsEst)
           {
               mensaje = "Saldo insuficiente";
           }
           else 
           {
               mensaje = "Hay algún parametro no aceptable";
           }
           System.out.println(mensaje);
         
    }
    
}
