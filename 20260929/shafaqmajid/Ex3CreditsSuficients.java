/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3creditssuficients;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex3CreditsSuficients {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
     // --- DECLARACIÓN DE VARIABLES ---
     double creditoDisponible = 0.0;
     double creditosPorHora = 0.0;
     double horasAContratar = 0.0;
     double costoReserva = 0.0;
     boolean tieneSaldoSuficiente = false;
     // Mostrar crédito disponible
     System.out.println("Introduce tu credito disponible:");
     // Esperar crédito disponible
     creditoDisponible = scanner.nextDouble();
     // Mostrar créditos por hora
     System.out.println("Introduce los creditos por hora del servicio:");
     // Esperar créditos por hora
     creditosPorHora = scanner.nextDouble();
     // Mostrar número de horas
     System.out.println("Introduce el numero total de horas a contratar:");
     // Esperar número de horas
     horasAContratar = scanner.nextDouble();
     // Calcular costo total
     costoReserva = creditosPorHora * horasAContratar;
     // Comprobar si hay saldo suficiente
     tieneSaldoSuficiente = creditoDisponible >= costoReserva;
     // Mostrar resultado
     System.out.println("Costo total: " + costoReserva);
     System.out.println("Resultado: " + tieneSaldoSuficiente);
    }
    
} 
