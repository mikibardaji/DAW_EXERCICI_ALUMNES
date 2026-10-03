/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5devaluaciopreus;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex5DevaluacioPreus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, preciofinal=0, descuento;
        String estado, texto=null;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce el precio original del producto: ");
        precio=scan.nextDouble();
        scan.nextLine();//para que el string funcione despues de pedir un int
        System.out.println("Introduce el estado del producto: ");
        estado=scan.nextLine();
        if (estado.equalsIgnoreCase("Nou")) {
            texto="El producto no tiene descuento ya que es nuevo.";
            preciofinal=precio;
            
        }else if (estado.equalsIgnoreCase("Bo")) {
            texto="Tiene un 20% de descuento";
            descuento=precio*20/100;
            preciofinal=precio-descuento;
            
        }else if (estado.equalsIgnoreCase("Aceptable")) {
            texto="Tienes un 50% de descuento";
            descuento=precio*50/100;
            preciofinal=precio-descuento;            
            
        }
        System.out.println(texto+" el precio final es de: "+preciofinal);
    }
    
}
