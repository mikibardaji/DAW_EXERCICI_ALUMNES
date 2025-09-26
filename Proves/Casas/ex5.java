import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) throws Exception {
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num1 = sc.nextDouble();
        System.out.println("Dime otro numero: ");
        num2 = sc.nextDouble();

        if(num1>num2){
            System.out.println(num2);
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
    }
}
