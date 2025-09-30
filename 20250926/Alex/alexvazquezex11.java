import java.util.Scanner;

public class alexvazquezex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu un preu: ");
        double preu = sc.nextDouble();

        System.out.print("Quina quantitat pagues: ");
        double quantitat = sc.nextDouble();

        if (preu > quantitat){
            double resta = preu - quantitat;
            System.out.println("Et sobran " + resta);

        } else if (quantitat>preu) {
            double resta = quantitat - preu;
            System.out.println("Et queden " + resta);

        }
        sc.close();
    }
}
