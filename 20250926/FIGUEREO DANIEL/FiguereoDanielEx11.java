import java.util.Scanner;

public class FiguereoDanielEx11 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Programa que compara 2 valores y dira cuantos euros le faltan o cuantos le sobran
    Double precioProducto, dineroUsuario, resultado;
    //Pedir valor precio producto
    System.out.println("Introduce el precio del producto: ");
    precioProducto = scanner.nextDouble();
    //Pedir valor dinero que tiene
    System.out.println("Introduce el dinero que tienes: ");
    dineroUsuario = scanner.nextDouble();
    //Comparar valores
    if (dineroUsuario < precioProducto)
        {
            resultado = precioProducto - dineroUsuario;
            System.out.println("Te faltan " + resultado + " euros para comprar. ");
        }
            else if (dineroUsuario > precioProducto) {
            resultado = dineroUsuario - precioProducto;
            System.out.println("Te sobran " + resultado + " euros. ");
        }
    else {
        System.out.println("Tienes el dinero justo para comprar. ");
    
        }
    }
}
