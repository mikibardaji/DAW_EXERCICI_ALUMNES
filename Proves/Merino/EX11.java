package Condicionales;

import java.util.Scanner;

public class EX11 {
   public static void main(String[] args) {
    
    /*Desenvolupeu un programa que demani a l’usuari que introdueixi un preu en € i la quantitat de € que
paga. El programa compararà les dues quantitats i escriurà els € que li falten per pagar o bé els que
li han de tornar. Ex. Si l’usuari introdueix preu=102€ i paga=150€, el programa li dirà “Sobren 48€”. Si
l’usuari introdueix preu=102€ i paga=100€, el programa li dirà “Falten 2€”. */

/* Pedir un precio en €
 * Pedir la cantidad de € que pagas
 * Compara las dos cantidades
 * Indicar qué falta por pagar o lo que se le ha de devolver
 * Mostrar resultado
 */
Scanner sc =new Scanner (System.in);

System.out.println("Dime el precio del producto");
double precio€;
precio€ = sc.nextDouble();

System.out.println("¿Cuánto dinero pagas?");
double dinero€;
dinero€ = sc.nextDouble();

if (precio€>dinero€)
{double falta€ = precio€ - dinero€;
System.out.println("Falta por pagar" + falta€ + " €");
}

if (dinero€>precio€) {
    double cambio = dinero€ - precio€;
    System.out.println("El cambio es de " + cambio + " €");
    
}
if (precio€==dinero€) {
    double exacto = dinero€ - precio€;
    System.out.println("No hay vuelta, el cambio es " + exacto + " €");
}
    

}

}
