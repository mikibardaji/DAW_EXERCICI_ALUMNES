import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // primer número par
        int numero = 2;

        while (numero <= 200) {
            System.out.println(numero); 
            // avanzar de 2 en 2
            numero = numero + 2;      
        }

        
    }
}
