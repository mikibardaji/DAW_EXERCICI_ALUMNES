//Pedir euros
//Mostrar menu "diferentes monedas"
//Si mo moneda= 1 euros * cambio dolares(1,17)
//sino si 1 euro por yenes   173,75
//sino si 1 euro por lempira   30,77



import java.util.Scanner;

public class Actividad13 {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
 final double dolares = 1.17;
 final double yenes = 173.75;
 final double lempira = 30.77;
 double euros;
 char moneda;

 System.out.println("   Cuantos vas a cambiar  ? ");
 euros = sc.nextDouble();
System.out.println(" A que moneda quieres cambiar? (D-dolares.Y-yenes,L-lempira )");
moneda= sc.next().charAt(0);
 switch (moneda) {
        case 'D' :
        case '1':
        euros=euros * 1.17;
        System.out.println("El cambio a dolares es de " + euros);
            break;
        case 'Y':
        case '2':
        euros=euros * 173.89;
        System.out.println("EL cambio a yenes es de " + euros);
        break;

        case 'L':
        case '3':
        euros=euros * 30.77;
        System.out.println("El cambio a lempira es de " + euros);
        break;
    
        default:
        System.out.println("Opcion incorrecta ");
            break;
      }
}
}
