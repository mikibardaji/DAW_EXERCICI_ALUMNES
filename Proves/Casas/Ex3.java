import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        double valor1;
        double valor2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un valor: ");
        valor1 = sc.nextDouble();

        System.out.println("Dime otro valor");
        valor2 = sc.nextDouble();

        if(valor1>valor2){
            System.out.println("El numero mas grande es " + valor1);
        }else if(valor2>valor1){
            System.out.println("El numero mas grande es " + valor2);
        }
    }
}
