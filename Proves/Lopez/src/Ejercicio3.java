import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        while (numero <= 200) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
