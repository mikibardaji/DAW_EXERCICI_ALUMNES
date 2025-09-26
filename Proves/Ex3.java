import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dime un numero: ");
        num1 = sc.nextInt();
        System.out.println("Dime otro numero: ");
        num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("El numero mas grande es "+num1);

        }
        else if(num1<num2){
        System.out.println("El numero mas grande es "+num2);

        }
        else{
            System.out.println("Son iguales");

        }
    }
}
