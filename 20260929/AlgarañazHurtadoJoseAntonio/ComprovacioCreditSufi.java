/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comprovaciocreditsufi;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ComprovacioCreditSufi {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        //1.- INICIO
        double creditoact, preciohora, hora, costtotal;
        boolean permitir;
        Scanner scan=new Scanner (System.in);
        //2.- Mostrar "Cuantos creditos tienes? "
        System.out.println("Cuaqntos creditos tienes?: ");
        //3.- Esperar creditosActual
        creditoact=scan.nextDouble();
        //4.- Mostrar "Cual es el precio en creditos por hora? "
        System.out.println("Caul es el precio de la hora?: ");
        //5.- Esperar precioHora
        preciohora=scan.nextDouble();
        //6.- Mostrar "Cuantas horas quieres contratar: "
        System.out.println("Cauntas horas quieres contratar?: ");
        //7.- Esperar horas
        hora=scan.nextDouble();
        //8.- Calcular costotal=precioHora*horas
        costtotal=preciohora*hora;
        //9.- Calcular permitir=costotal-creditosActual;
        permitir=costtotal<=creditoact;
        
        //10.-Mostrar "Se puede permitir la compra?: "
        System.out.println("Se puede permitir la compra?: "+ permitir);
        //11.- FIN
    }
    
}
