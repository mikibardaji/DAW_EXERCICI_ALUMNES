import java.util.Scanner;

public class exercic3mohamed {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("pone la numero 1: ");
        valor1 = sc.nextInt();
        System.out.println("pone la numero 2: ");
        valor2 = sc.nextInt();

        if (valor1>valor2){
            System.out.println("el numero el grande es:" + valor1);
        }
        else {
            System.out.println("el numero el grande es:" + valor2);
        }
    }
}

