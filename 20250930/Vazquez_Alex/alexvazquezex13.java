import java.util.Scanner;

public class alexvazquezex13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double si;
        System.out.print("Cuantos euros: ");
        double euros = sc.nextDouble();

        System.out.println("1. Dolares (D)");
        System.out.println("2. Yenes (Y)");
        System.out.println("3. Pesos mexicanos (P)");
        System.out.print("Introduce la monedas que quieras cambiar(D, Y, P): ");
        char cambio = sc.next().charAt(0);

        switch (cambio) {
            case 'd':
            case 'D':
                si = euros * 1.17;
                System.out.println("Tienes " + si + "Dolares");
                break;
            
            case 'y':
            case 'Y':
                si = euros * 173.90;
                System.out.println("Tienes " + si + " Yenes");
                break;    
            
            case 'p':
            case 'P':
                si = euros * 21.55;
                System.out.println("Tienes " + si + " Pesos mexicanos");
                break;
        
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        sc.close();

    
    
    
    }    


}
