/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularareacuadrado;

import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class CalcularAreaCuadrado {

    /**
     * 1.	Inici
2.	Mostrar “Diguem quant mesura el costat del quadrat”
3.	Esperar Costat
4.	Calcular Area = Costat * Costat
5.	Mostrar “El area del quadrat es = Area”
6.	Fi

     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lado, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado");
        lado = teclado.nextDouble();
        area = lado * 2;
        System.out.println("El area es "+lado+" * "+lado+" = "+area);
    }
    
}
