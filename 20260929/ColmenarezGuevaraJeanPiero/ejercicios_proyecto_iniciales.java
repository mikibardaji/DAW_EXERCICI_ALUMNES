```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Ejercicio 1   
        // Definir
        Scanner teclado = new Scanner(System.in);
        String nom_usuari;
        int oferta, cartera_total, pago_total;
        int dinero_inicial = 300;
        int cartera = 0;
        int valoracion1, valoracion2, valoracion3;
        double valoracionUser;
        double dinero_real, creditos_recargado;

        // Ejercicio 1
        System.out.println("Cual es tu nombre de usuario? ");
        nom_usuari = teclado.nextLine();
        System.out.println("Bienvenidos al campus ProvenShare, " + nom_usuari + "!");
        cartera_total = cartera + dinero_inicial;   
        System.out.println("Este es tu monedo Inicial, que obtendras 300 de regalo");
        
        System.out.println("Cartera Personal: " + cartera_total);

        System.out.println("Cuanto vale el libro que quieres comprar?");
        oferta = teclado.nextInt();
        pago_total = cartera_total - oferta;
        System.out.println("Se ha realizado un pago de " + oferta);
        System.out.println("Ahora tienes " + pago_total);
        
        // Ejercicio 2
        System.out.println("dime tu primera valoracion: ");
        valoracion1 = teclado.nextInt();
        System.out.println("dime tu segunda valoracion: ");
        valoracion2 = teclado.nextInt();
        System.out.println("dime tu tercera valoracion: ");
        valoracion3 = teclado.nextInt();
        valoracionUser = (double)(valoracion1 + valoracion2 + valoracion3) / 3;
        System.out.println("tu valoracion promedio es: " + valoracionUser);

        // Ejercicio 3
        System.out.println("Dime tu dinero real? ");
        dinero_real = teclado.nextDouble();
        creditos_recargado = dinero_real * 8.0;
        System.out.println(dinero_real + " * 8");
        System.out.println("Recargaste " + dinero_real + " x 8.0 para los creditos virtuales " + "tienes " + creditos_recargado);
    }
}
```