import java.util.Scanner;

public class condicionals3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Escribe el primer valor ");
        valor1 = sc.nextDouble();
        System.out.print("Escribe el segundo valor ");
        valor2 = sc.nextDouble();

        if (valor1 > valor2) {

            System.out.println("Aquest és el nombre més gran: " + valor1);

        }

        else if (valor2 > valor1) {
            System.out.println("Aquest és el nombre més gran: " + valor2);
        }

        else if (valor1 == valor2){
            System.out.println("Aquests números són iguals");
        }

    }
}