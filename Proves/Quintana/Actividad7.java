// Pedir el valor 1
// Pedir el valor 2
// Pedir el valor 3
//Valor 1 > valor 2 && valor1 > valor 3 
//Valor 2 > valor 1 && valor2  > valor 3 
//Valor 3 > valor 1 && valor3 > valor 2

import java.util.Scanner;  
public class Actividad7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num1; 
     int num2;
     int num3;

    System.out.println( "Pedir num 1 ? ");
    num1 = sc.nextInt();
    System.out.println( "Pedir num 2  ");
    num2 = sc.nextInt();
    System.out.println( "Pedir num 3 ? ");
    num3 = sc.nextInt();
    if (num1>num2 && num1>num3)
    {
        System.out.println("El numero grande es " + num1);
    }
    else if (num2>num1 && num2>num3)
    {
        System.out.println("El numero grande es  " + num2);
    }
    else if (num3>num1 && num3>num2)
    {
        System.out.println("El numero grande es  " + num3);
    }
}
}
