/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularoperaciones;

import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class CalcularOperaciones {

    /**
     * 1.	Inici
2.	Mostrar “Diguem un numero”
3.	Esperar num1
4.	Mostrar “Diguem un altre numero”
5.	Esperar num2
6.	Mostrar “Ara calcularem les operacions”
7.	Calcular Suma = num1 + num2
8.	Calcular Resta = num1 – num2
9.	Calcular Mult = num1 * num2
10.	Calcular Div = num1 / num2
11.	Mostrar “El resultat de la suma es Suma”
12.	Mostrar “El resultat de la resta es Resta”
13.	Mostrar “El resultat de la multiplicació es Mult”
14.	Mostrar “El resultat de la divisió es Div”
15.	Fi

     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, suma, resta, mult, div;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        num1 = teclado.nextDouble();
        System.out.println("Ahora dime otro");
        num2 = teclado.nextDouble();
        System.out.println("Ahora calcularemos las operaciones");
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        System.out.println("El resultado de la suma es "+num1+" + "+num2+" = "+suma);
        System.out.println("El resultado de la resta es "+num1+" - "+num2+" = "+resta);
        System.out.println("El resultado de la multiplicacion es "+num1+" * "+num2+" = "+mult);
        System.out.println("El resultado de la division es "+num1+" / "+num2+" = "+div);
    }
    
}
