import java.util.Scanner;

public class FiguereoDanielEx7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Pedir 3 numeros
    int num1, num2, num3;
    System.out.println("Ingrese el primer numero: ");
    num1 = sc.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    num2 = sc.nextInt();   
    System.out.println("Ingrese el tercer numero: ");
    num3 = sc.nextInt();
    //Si num1 > num2 y num1 > num3
    if (num1>=num2 && num1>=num3)
    {
        System.out.println("El numero mas grande es " + num1);
    }
    else if (num2>=num1 && num2>=num3)
    {
        System.out.println("El numero mas grande es " + num2);
    }
    else if (num3>=num1 && num3>=num2)
    {
        System.out.println("El numero mas grande es " + num3);
    }
 }
}
