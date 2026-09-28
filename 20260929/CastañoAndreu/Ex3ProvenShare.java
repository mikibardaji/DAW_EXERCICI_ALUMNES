/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3creditssuficients;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Ex3CreditsSuficients {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double creditos, creditosPrecio, cantidadHoras, costeTotal;
        boolean cierto;
        Scanner teclado = new Scanner(System.in);
//Inicio
//Mostrar: “Cuántos créditos tienes actualmente?”
System.out.println("Cuantos creditos tienes actualmente?");
//Esperar. creditos
creditos = teclado.nextDouble();
//Mostrar: “Cuántos créditos por hora cuesta el servicio?”
System.out.println("Cuantos creditos por hora cuesta el servicio?");
//Esperar: creditosPrecio
creditosPrecio = teclado.nextDouble();
//Mostrar: “Cuántas horas quieres contratar?”
System.out.println("Cuantas horas quieres contratar?");
//Esperar: cantidadHoras
cantidadHoras = teclado.nextDouble();
//Calcular: costeTotal = (creditosPrecio * cantidadHoras) < creditos
costeTotal = creditosPrecio * cantidadHoras;
//Si precioTotal > creditosInicio = false
//Si precioTotal <= creditosInicio = true
cierto = costeTotal <= creditos;
//Mostrar: “Puedes pagarlo?” + cierto
System.out.println("Puedes pagarlo? " + cierto);
//Final

    }
    
}
