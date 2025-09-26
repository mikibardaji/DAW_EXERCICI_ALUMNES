import java.util.Scanner;

public class ejCondicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es el primer numero? ");
        double num = sc.nextDouble();
        System.out.println("Cual es el segundo numero? ");
        double num2 = sc.nextDouble();

        if (num>num2) 
            {
             System.out.println("El numero mas grande es " + num);
            }
        else if (num2>num) 
            {
             System.out.println("El numero mas grande es " + num2);
            }
    }

}
