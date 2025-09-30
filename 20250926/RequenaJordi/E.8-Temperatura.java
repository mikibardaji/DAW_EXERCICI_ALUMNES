import java.util.Scanner;

public class Temperatura {

public static void main(String[] args) {
    
//Preguntar grados Farenheit al usuario
 Scanner sc = new Scanner(System.in);
 System.out.println(" Introduce los grados Farenheit: ");
 int gFarenheit = sc.nextInt();

//Calcular Celcius 
int resta = gFarenheit - 32;
int multiplicacion = resta * 5;
double gCelsius = (double) multiplicacion / 9;

//Mostrar grados celcius al usuario
System.out.println("Hace una temperatura de " + gCelsius + " grados");



}



}
