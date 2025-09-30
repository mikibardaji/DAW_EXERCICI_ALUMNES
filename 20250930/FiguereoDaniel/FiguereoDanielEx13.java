
import java.util.Scanner;

public class FiguereoDanielEx13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 //Conversor de monedas
 //Establecer variables
 double valorEuros;
final double valorDolar = 1.17;
final double valorYenes = 174.00;
final double valorDirham = 10.66;
    //Pedir valor en euros
    System.out.println("Introduce la cantidad en euros: ");
    valorEuros = sc.nextDouble();
    //Pedir a que moneda convertir (dolar, yenes, Driham)
    System.out.println("Introduce la moneda a la que deseas convertir (Dolar (D), Yenes (Y), Dirham (H)) ");
    int moneda = sc.next().charAt(0);
    double resultado;
    //Establecer condiciones
     //Si dolar
    //Mostrar valor en dolares
    //Sino si yenes
    //Mostrar valor en yenes
    //Sino si Driham
    //Mostrar valor en Driham
    //Sino
    //Moneda no encontrada
    switch (moneda) {

        case 'd':
        case 'D':
            resultado = valorEuros * valorDolar;
            System.out.println("El valor en dolares es: " + resultado);    
        break;

        case 'y':
        case 'Y':
            resultado = valorEuros * valorYenes;
            System.out.println("El valor en yenes es: " + resultado);
        break;

        case 'h':
        case 'H':
            resultado = valorEuros * valorDirham;
            System.out.println("El valor en Dirham es: " + resultado);
        break;

        default:
            System.out.println("Moneda no encontrada");
    }
    
   
}
}

