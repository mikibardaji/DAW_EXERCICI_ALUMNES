import java.util.Scanner;
public class tellezmarkEx11 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce el precio en euros:");
double precioEuros = scanner.nextDouble();
System.out.println("Introduce la cantidad que pagaste en euros:");
double cantidadPagada = scanner.nextDouble();

if (cantidadPagada == precioEuros) {
    System.out.println("No hay cambio que devolver.");
} else if (cantidadPagada > precioEuros) {
    double cambio = cantidadPagada - precioEuros;
    System.out.printf("El cambio a devolver es: %.2f euros%n", cambio);
} else {
    double cantidadFaltante = precioEuros - cantidadPagada;
    System.out.printf("Faltan %.2f euros para completar el pago.%n", cantidadFaltante);
     
}
scanner.close();

}
}
/*Leer precio
Leer pago

si pago == precio entonces
    Escribir "Pago justo"
sino si pago > precio entonces
    cambio = pago - precio
    Escribir "Sobran ", cambio, " €"
sino
    falta = precio - pago
    Escribir "Falten ", falta, " €"
 */