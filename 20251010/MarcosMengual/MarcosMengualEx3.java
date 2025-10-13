import java.util.Scanner;

public class MarcosMengualEx3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int contador = 1; 
        System.out.println("Dime un numero");
        contador = src.nextInt();
        while (contador <= 200) {
            if (contador % 2 == 0) { 
                System.out.println("-->"+ contador);
            }
            contador++; 
        }
    }
}