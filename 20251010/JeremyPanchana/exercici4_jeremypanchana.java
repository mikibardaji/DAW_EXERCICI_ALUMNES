import java.util.Scanner;

public class exercici4_jeremypanchana {





    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero;

        int inicio =1;
        System.out.println("Escribe el numero : ");

        numero = sc.nextInt();

        do{

            System.out.println(inicio);
            inicio++;
        }while(inicio<=numero);

        
    }
}
