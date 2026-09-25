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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double euro, provenshare;
        //Mostrar "Quantitat de euros reales : "
        System.out.print("Quantiat d'euros reals : ");
        // Esperar euro
        euro = teclado.nextDouble();
        // Calcular provenshare = euro * 8
        provenshare = euro * 8;
        //mostrar "Al cambio son : " + provenshare + "creditos provenshare"
        System.out.println("Al cambio son : " + provenshare + " creditos ProvenShare");
    }
}
