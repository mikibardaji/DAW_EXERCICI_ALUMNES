import java.util.Scanner;

public class Contador_arriba {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        int numero;
        System.out.println("Añade un numero para empezar el contador ");
        numero = sc.nextInt();
        while (contador < numero) {
            System.out.println(contador );
            contador += 1;
            
            
        }
        sc.close();

    }
}
