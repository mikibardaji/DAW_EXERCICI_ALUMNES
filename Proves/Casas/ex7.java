import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) throws Exception {
        double num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num1 = sc.nextDouble();

        System.out.println("Dime otro numero: ");
        num2 = sc.nextDouble();

        System.out.println("Dime otro numero: ");
        num3 = sc.nextDouble();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("El numero mas grande es: " + num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("El numero mas grande es: " + num2);
        }else if(num3 >= num1 && num3 >= num2){
            System.out.println("El numero mas grande es: " + num3);
        }
    }
}
