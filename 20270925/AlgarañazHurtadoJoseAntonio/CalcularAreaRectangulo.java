/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculararearectangulo;

import java.util.Scanner;

/**
 *
 * @author jal6318
 */
public class CalcularAreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, altura, area;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el valor de la base: ");
        base=scan.nextInt();
        System.out.println("Introduce el valor de la altura: ");
        altura=scan.nextInt();
        area=base*altura;
        System.out.println("El area del rectangulo es= "+area);
     
    }
    
}
