import java.util.Scanner;

public class cambioMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos euros quieres cambiar? ");
        double euros = sc.nextDouble();

        char tipoMoneda;
        System.out.println("Introduce a la moneda que lo quieres cambiar:");
        System.out.println("D-Dolar");
        System.out.println("Y-Yen:");
        System.out.println("H-Dirham");
        tipoMoneda = sc.next().charAt(0);

        switch (tipoMoneda) {
            case 'd':
            case 'D':
                double cambioDolares = euros*1.17;
                System.out.println("Convirtiendolo serán " + cambioDolares + " Dolares");
                break;
            case 'y':
            case 'Y':
                double cambioYenes = euros*173;
                System.out.println("Convirtiendolo serán " + cambioYenes + " Yenes");
                break;
            case 'h':
            case 'H':
                double cambioDirham = euros*10.64;
                System.out.println("Convirtiendolo serán " + cambioDirham + " Dirhams");
                break;
            default:
            System.out.println("Opción no válida.");
            }
        sc.close();
    }

}