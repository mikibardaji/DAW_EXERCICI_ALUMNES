import java.util.Scanner;

public class ej3Condi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el primer numero ");
        double num = sc.nextDouble();
        System.out.println("Dime el segundo numero ");
        double num2 = sc.nextDouble();

        if (num>num2) 
            {
             System.out.println("El orden es " + num + " y " + num2);
            }
        else if (num<num2) 
            {
             System.out.println("El orden es " + num2 + " y " + num);
            }
    }

}
