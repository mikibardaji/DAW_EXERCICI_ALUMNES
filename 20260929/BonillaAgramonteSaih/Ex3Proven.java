/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3comprovaciódecrèditssuficients;

import java.util.Scanner;
/**
 *
 * @author saihb
 */
public class Ex3ComprovacióDeCrèditsSuficients {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditosActuales, precioHora, horas, costeTotal;
        boolean tienesSaldo;
        //Mostrar creditos actuales
        System.out.println("Introduce creditos actuales");
        
        //Esperar creditos actuales
        creditosActuales = sc.nextInt();
        
        //Mostrar precio en credito por hora del servicio
        System.out.println("Precio en creditos por hora del servivio");
        
        //Esperar precio_hora
        precioHora = sc.nextInt();
        
        //Mostrar numero de horas que deseas contratar 
        System.out.println("Numero de horas que desea contratar");
        
        //Esperar
        horas = sc.nextInt();
        
        //Calcular coste total reserva 
        costeTotal = precioHora * horas;
        
        //Mostrar resultado final
        tienesSaldo = creditosActuales >= costeTotal;
        
       //Use if para mostrar tienes saldo y else para mostrar que no tienes (se tienen que crear llaver)
        if (tienesSaldo) {
        System.out.println("Tienes saldo");
        } else { 
        System.out.println("No tienes saldo");
        }
        
    }
    
}
