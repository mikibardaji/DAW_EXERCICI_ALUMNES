import java.util.Scanner;

public class FiguereoDanielEx3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Pedir valor 1, valor 2
    int valor1, valor2;
    System.out.println("Introduce 1 valor: ");
    valor1 = sc.nextInt();
    System.out.println("Introduce un segundo valor: ");
    valor2 = sc.nextInt();
    //Si valor 1 > valor 2
    //Mostrar valor 1 es mayor
    if (valor1>valor2)
    {
        System.out.println("El valor 1 es mayor");
    }

    //Sino mostrar valor 2 es mayor
      else if (valor1<valor2)
    {
        System.out.println("El valor 2 es mayor");
    }
}
}
