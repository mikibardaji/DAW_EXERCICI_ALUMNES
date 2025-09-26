import java.util.Scanner;

public class ej2Condi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero ");
        double num = sc.nextDouble();

        if (num>0) 
            {
             System.out.println("El numero " + num + " es positivo");
            }
        else if (num<0) 
            {
             System.out.println("El numero " + num + " es negativo");
            }
        else if (num == 0) 
            {
             System.out.println("El numero es " + num);
            } 
    }

}
