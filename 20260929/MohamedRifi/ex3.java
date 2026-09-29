import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double creditActual, preuCreditHores, totalHoresContrat, costTotalReserva;
        boolean saldoSuficient;
        
        System.out.print("Introdueix els crèdits actuals disponibles: ");
        creditActual = sc.nextDouble();
        
        System.out.print("Introdueix el preu en crèdits per hora del servei: ");
        preuCreditHores = sc.nextDouble();
        
        System.out.print("Introdueix el nombre total d'hores que vols contractar: ");
        totalHoresContrat = sc.nextDouble();
       
        costTotalReserva = preuCreditHores * totalHoresContrat;
        saldoSuficient = (costTotalReserva <= creditActual);
      
        System.out.println("El cost total de la reserva és: " + costTotalReserva);
        System.out.println("Té saldo suficient: " + saldoSuficient);
        
    
    }
}
