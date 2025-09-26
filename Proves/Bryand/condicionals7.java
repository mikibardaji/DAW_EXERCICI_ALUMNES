import java.util.Scanner;

public class condicionals7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dato1,dato2,dato3;

        System.out.print("Escribe el primer numero ");
        dato1 = sc.nextInt();

        System.out.print("Escribe el segundo numero ");
        dato2 = sc.nextInt();

        System.out.print("Escribe el tercer numero ");
        dato3 = sc.nextInt();

        if (dato1 >= dato2 && dato1 >= dato3) {
            System.out.println(dato1 + " es el mas grande");

        } else if (dato2 >= dato1 && dato1 >= dato3) {
            System.out.println(dato2+ " es el mas grande");
        }

        else if (dato3 >= dato1 && dato3 >= dato2) {
            System.out.println(dato3 + " es el mas grande");
        }

    }
}