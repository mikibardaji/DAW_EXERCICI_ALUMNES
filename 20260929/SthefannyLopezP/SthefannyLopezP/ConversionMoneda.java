/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provensharea1secuenciales;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class ConversionMoneda {
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);
         double euroReal, creditProven;
         final int CREDITOS_POR_EURO= 8;
  
        //ENTRADA — eurosReales creditCAmpus  1euro=8creditos
        //PROCESO  calcular crediCampus= eurosReales*8
        //SALIDA
        
        System.out.println("---Bienvenido al monedero ProvenShare---");
        System.out.println("");
        System.out.print("Ingrese la cantidad de euros que tiene: " );
        euroReal = sc.nextDouble();
        creditProven= euroReal*CREDITOS_POR_EURO;
        
        System.out.println("Usted tiene disponible: " + creditProven + " creditos ProvenShare");
        
    }
    
}
