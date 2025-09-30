import java.util.Scanner;

public class CondicionalOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Tell me the price of the product ");
        double precio = sc.nextDouble();
        System.out.print("the me the amount of cash  you gave: ");
        double pagado = sc.nextDouble();

        if (pagado == precio) {
            System.out.println("you gave the same amount");
        } 
        else if (pagado > precio) {
            double cambio = pagado - precio;
            System.out.printf("your change is  " + cambio + "euros");
        } 
        else {
            double falta = precio - pagado;
            System.out.printf("you still have to pay " + falta + "euros");
        }

        sc.close();
    }

}
