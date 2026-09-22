/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excalculnumeros;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExCalculNumeros {

    /**
     * Mostrar “Introdueix el primer número”
     * Esperar primer_numero
     * Mostrar “Introdueix el segon número”
     * Esperar segon_numero
     * Calcular suma_nums=primer_numero + segon_numero
     * Mostrar “Suma: “ + suma_nums
     * Calcular resta_nums=primer_numero - segon_numero
     * Mostrar “Resta: “ + resta_nums
     * Calcular producte_nums = primer_numero * segon_numero
     * Mostrar “Producte: “ + producte_nums
     * Calcular divisio_nums=primer_numero / segon_numero
     * Mostrar “Divisio: “ + divisio_nums

     */
    public static void main(String[] args) {
        int num1, num2, suma_nums, resta_nums, producte_nums, divisio_nums;
       
        Scanner texto =new Scanner(System.in);
       
        System.out.println("Introdueix el primer numero");
        num1=texto.nextInt();
       
        System.out.println("Introdueix el segon numero");
        num2=texto.nextInt();
       
        suma_nums = num1+num2;
        System.out.println("Suma: " + suma_nums);
        resta_nums = num1-num2;
        System.out.println("Resta: " + resta_nums);
        producte_nums = num1*num2;
        System.out.println("Producte: " + producte_nums);
        divisio_nums = (double) num1/num2;
        System.out.println("Divisio: " + divisio_nums);
    }
   
}
