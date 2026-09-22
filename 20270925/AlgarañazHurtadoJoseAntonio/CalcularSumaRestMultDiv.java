/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularsumarestmultdiv;

import java.util.Scanner;

/**
 *
 * @author jal6318
 */
public class CalcularSumaRestMultDiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma, resta, mult, div;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce un valor: ");
        num1=scan.nextInt();
        System.out.println("Intruduce un segundo valor: ");
        num2=scan.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        System.out.println(num1+"+"+num2+"="+suma);
        System.out.println(num1+"-"+num2+"="+resta);
        System.out.println(num1+"*"+num2+"="+mult);
        System.out.println(num1+"/"+num2+"="+div);

    }
    
}
