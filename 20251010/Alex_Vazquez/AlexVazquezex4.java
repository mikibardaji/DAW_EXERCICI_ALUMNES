import java.util.Scanner;

public class AlexVazquezex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero: ");
        int contador = sc.nextInt();
        for(numero=1;numero<=contador;numero++){
            System.out.print(numero);
        }
    }

}
