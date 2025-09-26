import java.util.Scanner;

public class Ex7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    System.out.println("Dime un numero: ");
    num1 = sc.nextInt();
    System.out.println("Dime un numero: ");
    num2 = sc.nextInt();
    System.out.println("Dime un numero: ");
    num3 = sc.nextInt();
    if(num1>=num2 && num1>=num3){

        System.out.println("El numero mas grande es: "+num1);
    }
    else if(num2>=num1 && num2>=num3){

        System.out.println("El numero mas grande es: "+num2);
    }
    else{

        System.out.println("El numero mas grande es: "+num3);
    }
}
}
