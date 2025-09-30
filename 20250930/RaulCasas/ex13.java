import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double euros, diferencia;
        char moneda;

        System.out.println("Cuantos euros tienes?");
        euros = sc.nextDouble();
        sc.nextLine();

        System.out.println("Tenemos 3 tipos de monedas: ");
        System.out.println("1. Dolar (D)");
        System.out.println("2. Yen (Y)");
        System.out.println("3. Dirham (H)");
        System.out.println("A que moneda quieres convertirlo?");
        moneda = sc.nextLine().charAt(0);

        switch(moneda){
            case 'd':
            case 'D':
                diferencia = euros * 1.17;
                System.out.println("Tus euros en dolares serian " + diferencia + " Dolares");
                break;
            case 'y':
            case 'Y':
                diferencia = euros * 173.91;
                System.out.println("Tus euros en yenes serian " + diferencia + " Yenes");
                break;
            case 'm':
            case 'M':
                diferencia = euros * 10.64;
                System.out.println("Tus euros en dirhams serian " + diferencia + " Dirhams");
                break;
            default:
                System.out.println("Letra incorrecta");
                break;
        }
    }
}
