import java.util.Scanner;

public class Exercici11jeremy { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double preu, quantitat;
        System.out.println("Introdueix un  preu : ");
        preu = sc.nextDouble();
        System.out.println("Introdueix la quantitat : ");
        quantitat = sc.nextDouble();


        if (quantitat>preu ){

            double canvi = quantitat-preu ;
            System.out.println("Sobren " + canvi );

        }
        else if (quantitat <preu ){

            double faltadiners = preu - quantitat;
            System.out.println("Falten "  + faltadiners);
        }
        else {

            System.out.println("Compra completada sense canvi ni falta de diners");
        }


    }
}
