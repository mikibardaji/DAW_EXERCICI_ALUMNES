import java.util.Scanner;

public class Ejercicio_5_teorias_condicionales {
    public static void main(String[] args) throws Exception {
        
        //Pedir numero 1

        //Pedir numero 2

        //Si numero 1 > numero 2

	        //Imprimir numero2 i numero 1

        //sinó si numero 2 > numero 1

	        //Imprimir numero1 i numero 2

        //sinó imprimir numero 1	

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Escribe el primer valor: ");
            valor1 = sc.nextInt();
        System.out.println("Escribe el segundo valor: ");
            valor2 = sc.nextInt();

        if (valor1>valor2) {
            System.out.println("Estos son tus numeros ordenados " + valor2 + " i " + valor1);
        }
        else if (valor1<valor2) {
            System.out.println("Estos son tus numeros ordenados " + valor1 + " i " + valor2);
        }
        else {
            System.out.println("Tus valores son exactamente iguales");
        }
    }
}
