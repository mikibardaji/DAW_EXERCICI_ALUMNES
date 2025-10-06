import java.util.Scanner;

public class Festivals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ticketPrice, basePrice, finalPrice;
        int numberOfTickets;
        final double vat = 0.21;
        final double fivePercent = 0.05;
        final double tenPercent = 0.10;

        System.out.println("HELLO welcome, how many ticket do you ");
        numberOfTickets = sc.nextInt();

        System.out.println("What is the price of one ticket?");
        ticketPrice = sc.nextDouble();

   
        if (numberOfTickets <=1) {
            basePrice = numberOfTickets * ticketPrice;
            finalPrice = basePrice + (basePrice * vat) ;
            System.out.println("YOou have buy "+numberOfTickets+" ticket, the base price is "+basePrice+" and the final price is "+finalPrice);

        }else if (numberOfTickets == 2 ) {

            basePrice = numberOfTickets * ticketPrice - (numberOfTickets * ticketPrice * tenPercent/2);
            finalPrice = basePrice + (basePrice * vat) ;
            System.out.println("YOou have buy "+numberOfTickets+" ticket, the base price is "+basePrice+" and the final price is "+finalPrice);
      
        }else if (numberOfTickets >2) {

            basePrice = numberOfTickets * ticketPrice - (numberOfTickets * ticketPrice * fivePercent);
            finalPrice = basePrice + (basePrice * vat) ;
            System.out.println("YOou have buy "+numberOfTickets+" ticket, the base price is "+basePrice+" and the final price is "+finalPrice);
        
    }

    sc.close();

}
}
