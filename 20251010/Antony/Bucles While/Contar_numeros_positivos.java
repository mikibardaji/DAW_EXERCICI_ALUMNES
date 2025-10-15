import java.util.Scanner;

public class Contar_numeros_positivos {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int Contarpositivos = 0;
        do {
            System.out.println("Dime un numero positivo");
            numero = sc.nextInt();
            if (numero >= 1) {
                Contarpositivos++;

            }
        }

        while (numero != 0);
        System.out.println("numeros " + Contarpositivos);
    }
}
