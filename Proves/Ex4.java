import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int num1;  
        System.out.println("Dime un numero: ");
        num1 = sc.nextInt();
        if(num1>0){
            System.out.println("El numero es positivo");

        }
        else if(num1<0){
        System.out.println("El numero es negativo");

        }
        else{
            System.out.println("El numero es 0");

        }
}
}
