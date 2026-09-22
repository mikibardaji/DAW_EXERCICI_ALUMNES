/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculararearectangulo;

import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class CalcularAreaRectangulo {

    /**
     * 1.	Inici
2.	Mostrar “Diguem la base del rectangle”
3.	Esperar Base
4.	Mostrar “Diguem la altura del rectangle”
5.	Esperar Altura
6.	Calcular Area = Base * Altura
7.	Mostrar “L’area del quadrat es Area”
8.	Fi

     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la base del rectangulo");
        base = teclado.nextDouble();
        System.out.println("Ahora dime la altura del rectangulo");
        altura = teclado.nextDouble();
        area = base * altura;
        System.out.println("El area del rectangulo es "+base+" * "+altura+" = "+area);
    }
    
}
