/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosestructuressequencials;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciosEstructuresSequencials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double lado, area_cuadrado;
    Scanner teclado = new Scanner (System.in);

//Inici
//Mostrar: “Quants mesura un costat?”
System.out.println("Cuanto mide el lado del cuadrado?");
//Esperar: mesura_costat
lado = teclado.nextDouble();
//Calcular: area_quadrat = mesura_costat * mesura_costat
area_cuadrado = lado * lado;
//Mostrar: “Area del quadrat es de” + area_quadrat + “metres”
System.out.println("El area del cuadrado es de " + area_cuadrado);
//Fi

    }
    
}
