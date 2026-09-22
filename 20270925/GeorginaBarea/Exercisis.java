/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisis;
import java.util.Scanner; 
/**
 *
 * @author gba0006
 */
public class Exercisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Programa que calcula l'?rea d'un QUADRAT el costat del qual s'introdueix per teclat.
        int alt;
        int area;
        int altRect;
        int ancho;
        int areaRect;
        int num1;
        int num2;
        int suma, resta, div, prod;
        System.out.println("CUADRADO");
        //Mostrar “Introduce altura”
        System.out.print("Introduce la altura: ");
        //Esperar alt
        alt = teclado.nextInt();
        //Calcular area = alt * alt;
        area = alt * alt;
        //Mostrar “El area de tu cuadrado es de ” + area
        System.out.println("El area de tu cuadrado es de " + area);
        //Programa que calcula l'?rea d'un RECTANGLE, dades d’entrada s'introdueixen per teclat.
        System.out.println("RECTANGULO");
        //Mostrar “Introduce altura”
        System.out.print("Introduce la altura: ");
        //Esperar altRct 
        altRect = teclado.nextInt();
        //Mostrar “Introduce ancho”
        System.out.print("Introduce el ancho: ");
        //Esperar ancho
        ancho = teclado.nextInt();
        //Calcular area = altrect * ancho;
        areaRect = altRect * ancho;
        //Mostrar “El area de tu rectangulo es de ” + area
        System.out.println("El area de tu rectangulo es de " + areaRect);
        //Programa que llegeixi DOS N?MEROS, calcula i mostra el valor de la suma, la resta, el producte i la divisió.
        System.out.println("SUMA, RESTA, MULTIPLICACION Y DIVISION");
        //Mostrar “Introduce el primer numero”
        System.out.print("Introduce el primer nuemro: ");
        //Esperar num1
        num1 =teclado.nextInt();
        //Mostrar “Introduce el segundo numero”
        System.out.print("Introduce el segundo numero: ");
        //Esperar num2
        num2 = teclado.nextInt();
        //Calcular suma = num1 + num2
        suma = num1 + num2;
        //Mostrar “La suma es” + sum
        System.out.println("La suma es " + suma);
        //Calcular resta = num1 - num2
        resta = num1 - num2;
        //Mostrar “La resta es” + resta
        System.out.println("La resta es " + resta);
        //Calcular prod = num1 * num2
        prod = num1 * num2;
        //Mostrar “El producte es” + prod
        System.out.println("La multiplicacion es " + prod);
        //Calcular div = num1 / num2
        div = num1 / num2;
        //Mostrar “La divisio es” + div
        System.out.println("La division es " + div);
    }
    
}
