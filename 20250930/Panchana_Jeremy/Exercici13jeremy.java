import java.util.Scanner;

public class Exercici13jeremy {



    public static void main(String[] args) {
        
        double euros , cambio_divisa;
        int moneda;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la cantidad de euros : ");
        euros = sc.nextDouble();


        //MOSTRAR MENU
        System.out.println(" Escribe el numero para el Cambio divisas : 1- Dolares , 2- Yenes , 3-Dirham  ");
        moneda = sc.next().charAt(0);
        //moneda = sc.nextInt();
        switch (moneda) {
            case 'D':
            //case 1:
               cambio_divisa =  euros * 1.17;
               System.out.println("El cambio a dolares es " + cambio_divisa);        
                break;

               // case 2:
                case 'Y':
               cambio_divisa =  euros * 173.90;
               System.out.println(cambio_divisa);        
                break;
                case 'H': 
              //  case 3:
               cambio_divisa =  euros * 10.64;
               System.out.println(cambio_divisa);        
                break;
        
            default:
            System.out.println("Opcion incorrecta");
                break;
        }








    }



}
