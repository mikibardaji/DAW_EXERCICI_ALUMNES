/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4fitxaobj;

import java.util.Scanner;

/**
 *
 * @author myths
 */
public class Ex4FitxaObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Inicio
        //2.Declaracion variables y Scanner
        Scanner sc = new Scanner(System.in);
        String nombreProducto, calidad, sitioEntrega;
        //3. Mostrar: "Cual es el nombre del producto?"
        System.out.print("Cual es el nombre del producto que ofreces?  ");
        //4..Esperar: nombreProducto
        nombreProducto = sc.nextLine();
        //5. Mostrar: Cual es el estado de conservacion del producto? (Mala, Buena, Excelente)
        System.out.print("Cual es el estado de conservacion del producto?  ");
        //6. Esperar: calidad
         calidad = sc.nextLine();
        //7.Mostrar: Donde entregaras el producto?
        System.out.print("Donde puedes entregar el producto? ");
        //9.Esperar: sitio
        sitioEntrega = sc.nextLine();
        //10. Mostrar: "Estos son los datos de tu producto: " + nombreProducto + calidad + sitioEntrega
        System.out.println("Estos son los datos de tu producto:  ");
           System.out.println (nombreProducto);
                   System.out.println (calidad);
                           System.out.println (sitioEntrega);
        //11. Fin
    }
    
}
