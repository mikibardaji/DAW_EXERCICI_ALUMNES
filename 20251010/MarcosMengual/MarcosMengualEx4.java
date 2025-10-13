import java.util.Scanner;

public class MarcosMengualEx4 {

    public static void main(String[] args) {
        
        Scanner src = new Scanner(System.in);
        int numero;
        int contador = 1;
        System.out.println("Dime un numero");
        numero = src.nextInt();
        while (contador <= numero) 
        {
            System.out.println("-->"+ contador); 
            contador ++;
        }
    }
}
