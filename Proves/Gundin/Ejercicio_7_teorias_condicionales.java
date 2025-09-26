import java.util.Scanner;

public class Ejercicio_7_teorias_condicionales {
    public static void main(String[] args) throws Exception {
        //Pedir valor 1

        //Pedir valor 2

        //Pedir valor 3

        //Si valor 1 >= valor2 && valor 1 >= valor 3

            //Imprimir valor 1

        //Si valor2 >= valor 1 && valor 2 >= valor 3
	
            //Imprimir valor 2

        //Si valor 3 >= valor 1 && valor 3 >= valor 2

	        //Imprimir valor 3

           Scanner sc = new Scanner(System.in);
           int valor1, valor2, valor3;
           
           System.out.println("Escribe el valor 1: ");
                valor1 = sc.nextInt();
           System.out.println("Escribe el valor 2: ");
                valor2 = sc.nextInt();
           System.out.println("Escribe el valor 3: ");
                valor3 = sc.nextInt();

        
        if (valor1 >= valor2 && valor1 >= valor3) {
            System.out.println("El valor mas grande es el valor: " + valor1);
        }
        else if (valor2 >= valor1 && valor2 >= valor3) {
            System.out.println("El valor mas grande es el valor: " + valor2);
        }
        else if (valor3 >= valor1 && valor3 >= valor2) {
            System.out.println("El valor mas grande es el valor: " + valor3);
        }
    }
}
