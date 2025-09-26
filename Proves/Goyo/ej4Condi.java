import java.util.Scanner;

public class ej4Condi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero ");
        double num = sc.nextDouble();
        System.out.println("Dime el segundo numero ");
        double num2 = sc.nextDouble();
        System.out.println("Dime el tercer numero ");
        double num3 = sc.nextDouble();

        if (num>=num2 && num>=num3) 
            {
             System.out.println("El numero más grande es " + num);
            }
        else if (num2>=num && num2>=num3) 
            {
             System.out.println("El numero más grande es " + num2);
            }
        else if (num3>=num && num3>=num2) 
            {
             System.out.println("El numero más grande es " + num3);
            }
    }

}
