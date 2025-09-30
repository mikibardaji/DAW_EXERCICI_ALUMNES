import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        //Desenvolupeu un programa que entri un import en euros, 
        //mostri un menú amb diferents monedes, llegeixi el nom de la moneda i 
        //mostri la conversió a la moneda escollida.
        
        //Pedir euros
        //Mostrar menu 
        //Perguntar Moneda
        //(IF) si moneda == 1 
        //-Euros * Cambio de dólares =?
        //sino si moneda == 2
        //-Euros * cambio de 

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un import en euros: ");
        double euros = sc.nextDouble();

        System.out.println("Tria una moneda per convertir:");
        System.out.println("1. Dòlar (USD)");
        System.out.println("2. Indian rupee (INR)");
        System.out.println("3. Pound (GBP)");
        System.out.print("Introdueix el número de la moneda (1-3): ");
        int opcio = sc.nextInt();
        double conversio;
        switch (opcio){
            case 1:
                conversio = euros * 1.17; 
                System.out.println( euros + " Euros són " + conversio + " Dòlar (USD).");
                break;
            case 2:
                conversio = euros * 104.31; 
                System.out.println( euros + " Euros són " + conversio + " Indian rupee (INR).");
                break;
            case 3:
                conversio = euros * 0.86; 
                System.out.println( euros + " Euros són " + conversio + " Pound (GBP).");
                break;
            default:
                System.out.println("Opció no vàlida. Si us plau, tria una opció entre 1 a 3.");
                break;  
            }
    }
}
