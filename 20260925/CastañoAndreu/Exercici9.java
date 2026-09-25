/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisequencial9;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciSequencial9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//9. Programa que transforma las milles nàutiques a metres .
//Inicio
//Definir constante: millasAmetros: 1852
int millasAmetros = 1852;
double millas, metros;
Scanner teclado = new Scanner(System.in);
//Mostrar: “¿Cuántas millas náuticas?"
System.out.println("¿Cuantas mullas nauticas?");
//Esperar: millas
millas = teclado.nextDouble();
//Calcular: metros = millas * millasAmetros
metros = millas * millasAmetros;
//Mostrar: “Los metros son “ + metros
System.out.println("Los metros son " + metros);
//Fin

    }
    
}
