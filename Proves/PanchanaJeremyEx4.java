import java.util.Scanner;

public class PanchanaJeremyEx4 {



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num1;
        System.out.println("Escribe el numero 1 ");
        num1 = sc.nextInt();

        if(num1>0){

            System.out.println("Positivo");

        }
        else if (num1<0){

            System.out.println("Negativo");

        }
        else if (num1==0){

            System.out.println("0");
        }



    }
}
