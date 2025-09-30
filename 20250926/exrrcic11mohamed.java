import java.util.Scanner;

public class exrrcic11mohamed {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double preu, paga;

        System.out.println("introdueixi preu: ");
        preu = sc.nextInt();

        System.out.println("introdueixi caunto paga: ");
        paga = sc.nextInt();

        if(preu < paga){
            double tornar = paga - preu;
            System.out.println("que falten per pagar: " + tornar);
        }
        else if(preu > paga){
            double falten = preu - paga;
            System.out.println("que falten per pagar: " + falten);
        }
        else {
            System.out.println("no falten diners");
        }
    }

}
