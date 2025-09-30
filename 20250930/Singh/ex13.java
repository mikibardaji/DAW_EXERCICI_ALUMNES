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
        //Pedir euros
        System.out.print("Introdueix un import en euros: ");
        double euros = sc.nextDouble();

        final double DOLAR_EURO = 1.17; //1 Euro = 1.17 Dólar (USD)
        final double INDIAN_EURO = 104.31; //1 Euro = 104.31 Indian rupee (INR)
        final double POUND_EURO = 0.86; //1 Euro = 0.86 Pound (GBP)

        //Menu de monedas
        System.out.println("Tria una moneda per convertir:");
        System.out.println("1. Dòlar (USD)");
        System.out.println("2. Indian rupee (INR)");
        System.out.println("3. Pound (GBP)");
        System.out.print("Introdueix el número de la moneda (1-3): ");
        int opcio = sc.nextInt();
        double conversio;
        //Decidir acció segons la resposta utilitzant switch
        switch (opcio){
            case 1:
                conversio = euros * DOLAR_EURO; 
                System.out.println( euros + " Euros són " + conversio + " Dòlar (USD).");
                break;
            case 2:
                conversio = euros * INDIAN_EURO; 
                System.out.println( euros + " Euros són " + conversio + " Indian rupee (INR).");
                break;
            case 3:
                conversio = euros * POUND_EURO;
                System.out.println( euros + " Euros són " + conversio + " Pound (GBP).");
                break;
            default: //Si no es ninguna de las opciones
                System.out.println("Opció no vàlida. Si us plau, tria una opció entre 1 a 3.");
                break;  
            }

            //Otra forma de hacerlo con if else
            /*if (opcio==1){
                conversio = euros * DOLAR_USD; 
                System.out.println( euros + " Euros són " + conversio + " Dòlar (USD).");
            }
            else if (opcio==2)
            {
                conversio = euros * INDIAN_RUPEE; 
                System.out.println( euros + " Euros són " + conversio + " Indian rupee (INR).");
            }
            else if (opcio==3)
            {
                conversio = euros * POUND_GBP;
                System.out.println( euros + " Euros són " + conversio + " Pound (GBP).");
            }
            else
            {
                System.out.println("Opció no vàlida. Si us plau, tria una opció entre 1 a 3.");
                
            }*/
    }
}
