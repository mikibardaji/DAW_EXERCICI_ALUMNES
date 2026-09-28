/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provensharea1secuenciales;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class ComprobacionCredito {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        double creditActual, precioCreditHoras, totalHorasContrat, costeTotalReserva;
        boolean saldoSuficiente;
        
        //comprobar, mediante operadores de comparación
        //Entrada— creditActuales, precioCreditHoras, totalHoraContrat
        //Proceso calcular costeTotalReserva, saldoSuficiente, 
        //Salida   —- el resultado final ( booleano)
         
        
        System.out.print("Ingrese el credito actual disponible: ");
        creditActual= sc.nextDouble();
        
        System.out.print("Ingrese el precio en creditos por horas del servicio: ");
        precioCreditHoras= sc.nextDouble();
        
        System.out.print("Ingrese el total de numero de horas que quiere contratar: ");
        totalHorasContrat= sc.nextDouble();
        
        costeTotalReserva= precioCreditHoras*totalHorasContrat;
        
        System.out.println("El coste total de la reserva es : " + costeTotalReserva);
        
        saldoSuficiente= (costeTotalReserva <= creditActual);
        System.out.println("Tiene saldo suficiente: " + saldoSuficiente);
        
        

    }
    
}
