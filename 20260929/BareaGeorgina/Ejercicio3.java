/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprojecte;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double credito, preciohora, horas, totalhoras, total;
        boolean cierto;
        // Mostrar "Dime tu credito total : "
        System.out.print("Dime tu credito : ");
        // Esperar credito
        credito = teclado.nextDouble();
        // Mostrar "Cuanto vale la hora : "
        System.out.print("Cuanto vale la hora : ");
        // Esperar preciohora
        preciohora = teclado.nextDouble();
        // Mostrar "Cuantas horas quieres contratar el servicio : "
        System.out.print("Cuantas horas quieres contratar el servicio : ");
        // Esperar horas
        horas = teclado.nextDouble();
        // Calcular totalhoras = preciohora * horas
        totalhoras = preciohora * horas;
        // ttoal + credito = flase
        cierto = totalhoras <= credito;
        System.out.println("Puedes pagarlo ? " + cierto);
    }
}
