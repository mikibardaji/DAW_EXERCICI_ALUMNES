import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        double numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        numero = sc.nextDouble();

        if(numero>0){
            System.out.println("Tu numero es positivo");
        }else if(numero<0){
            System.out.println("Tu numero es negativo");
        }else{
            System.out.println("Su numero es 0");
        }
    }
}
