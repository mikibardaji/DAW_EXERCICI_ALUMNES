import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del artículo: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce la cantidad pagada: ");
        double pagado = sc.nextDouble();

        if (pagado == precio) {
            System.out.println("Pago lo justo");
        } 
        else if (pagado > precio) {
            double cambio = pagado - precio;
            System.out.printf("Sobran " + cambio + "euros");
        } 
        else {
            double falta = precio - pagado;
            System.out.printf("Faltan " + falta + "euros");
        }

        sc.close();
    }
}