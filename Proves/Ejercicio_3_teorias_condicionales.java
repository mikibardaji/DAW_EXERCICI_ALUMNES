import java.util.Scanner;

public class Ejercicio_3_teorias_condicionales {
    public static void main(String[] args) throws Exception {
        
        //Pedir valor 1

        //pedir valor 2

        //Si valor 1 > valor 2

	        //Imprime valor 1

        //sinó

	        //Imprime valor 2


        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Escribe el valor 1: ");
            valor1 = sc.nextInt();
        System.out.println("Escribe el valor 2: ");
            valor2 = sc.nextInt();

        if (valor1>valor2) {
            System.out.println("Este es el valor mas grande: "+ valor1);
        }
        else{
            System.out.println("Este es el valor mas grande: " + valor2);
        }
    }
}
