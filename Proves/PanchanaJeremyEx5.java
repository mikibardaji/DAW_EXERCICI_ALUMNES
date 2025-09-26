import java.util.Scanner;

public class PanchanaJeremyEx5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2;
        System.out.println("Escribe el num1 : ");
        num1 = sc.nextInt();
    
        System.out.println("Escribe el num2 :");

        num2 = sc.nextInt();


        if (num1>num2){

            System.out.println(" 1 - " + num2);
            System.out.println( "2- " + num1);

        }
        else if (num2>num1){

            System.out.println(" 1 - " + num1);
            System.out.println( "2- " + num2);

        }


        else{
            System.out.println(num1);
        }
    }
}
