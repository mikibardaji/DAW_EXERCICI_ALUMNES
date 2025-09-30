import java.util.Scanner;

public class TiposdeMonedas {
public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);
 System.out.println(" Euros: ");
 double euros = sc.nextDouble();
 double si;

 System.out.println(" 1. Dollar (D) ");
 System.out.println(" 2. Yene (Y) ");
 System.out.println(" 3. Pesos mexicanos (P) ");
System.out.println(" Introduce al tipo de moneda que quieras cambiar (D/Y/P)");
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
        System.out.println(" Tienes " + si + " Yenes");
        break;

    case 'p':
    case 'P':
si = euros  * 21.55;
System.out.println(" Tienes " + si + " Pesos mexicanos ");
break;

default:
System.out.println(" Opción incorrecta ");


}





}
}
