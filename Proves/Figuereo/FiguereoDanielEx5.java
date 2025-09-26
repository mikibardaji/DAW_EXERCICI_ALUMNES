import java.util.Scanner;

public class FiguereoDanielEx5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Pedir 2 numeros
    int num1, num2;
    System.out.println("Introduce un numero: ");
    num1 = sc.nextInt();
    System.out.println("Introduce otro numero:");
    num2 = sc.nextInt();
    //Si num1 > num2
    //Mostrar num2, num1
    if (num1>num2)
    {
        System.out.println(num2 + ", " + num1);
    }
      //Sino si num2>num1
    //Mostrar num1, num2
    else if (num1<num2)
    {
        System.out.println(num1 + ", " + num2);
    }
    
    //Sino mostrar son iguales
    else
    {
        System.out.println(num1);
    }
}
}
