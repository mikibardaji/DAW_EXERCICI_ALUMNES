import java.util.Scanner;

public class Ejercicio_4_teorias_condicionales {
    public static void main(String[] args) throws Exception {
        
        //Pedir numero 1

        //Si numero 1 > 0

            //Imprimo positivo

        //sinó si numero 1 < 0

	        //Imprimo negativo

        //si numero 1 = 0 

	        //imprimo 0

        Scanner sc = new Scanner(System.in);
        double valor1;
        final int valor0 = 0;
        System.out.println("Escribe tu valor: ");
        valor1 = sc.nextDouble();

        if (valor1>valor0) {
            System.out.println("Tu valor es positivo");
        }
        else if (valor1<valor0) {
            System.out.println("Tu valor es negativo");
        }
        else{
            System.out.println("Tu valor es 0");
        }
    }
}
