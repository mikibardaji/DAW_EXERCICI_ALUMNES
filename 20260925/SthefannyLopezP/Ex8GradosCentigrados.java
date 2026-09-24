/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8gradoscentigrados;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class Ex8GradosCentigrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double F, C;
        // TODO code application logic here
        //entrada temperatura Fahrenheit 
        //proceso convertir F a C 
        //salida temperatura en Celsius
        
        //mostrar "Indica la Temperatura en Fahrenheit: "
        System.out.print("Indica la Temperatura en Fahrenheit: ");
        //esperar F
        F = sc.nextDouble();
        
        //calcular C = ( - 32) * 5 / 9
        C = (F - 32) * 5 / 9;
        //mostrar " La temperatura en Celcius es: " + C;
        System.out.println("La temperatura en Celsius es: " + C + "ºC");
    }
    
}
