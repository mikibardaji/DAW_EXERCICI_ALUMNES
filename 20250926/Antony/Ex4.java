import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int num1;
         System.out.println("Escribe un numero: ");
         num1 = dato.nextInt();

         if (num1 > 0) {
            System.out.println("Positivo");          
         }
         else if (num1 < 0) {
            System.out.println("Negativo");
         }
         else if (num1 == 0) {
            System.out.println("zero");
         }
    }
}
