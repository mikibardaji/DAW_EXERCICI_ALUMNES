// Escriu un programa que mostri per pantalla els 10 múltiples de 7 a partir del numero que indiqui el usuari.


import java.util.Scanner;

public class Actividad1_reforç_Marcelo {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int numero;
System.out.println("Introduce un numero: ");
numero = sc.nextInt();
for (int i = 1; i <= 10; i++) {
    int multiplo = numero * i;
    System.out.println("Múltiplo " + i + " de " + numero + " es: " + multiplo);
}



 }
}
