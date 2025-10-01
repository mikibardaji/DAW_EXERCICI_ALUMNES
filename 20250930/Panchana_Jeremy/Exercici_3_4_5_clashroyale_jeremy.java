import java.util.Scanner;

public class Exercici_3_4_5_clashroyale_jeremy {



    public static void main(String[] args) {
        int copes;
        char carta;
        Scanner sc = new Scanner (System.in);
        System.out.println(" Quantes copes tens aconseguides");
        copes =sc.nextInt();
        if (copes <2000){

             System.out.println("Quina carta vols Mago Electrico(m) o MegaEsbirro (e)");
        carta = sc.nextLine().charAt(0);

        switch (carta) {
            case 'm':
            case 'M'
                      :
                System.out.println(" Has escollit  Mago Electrico ");
                break;

               case 'e':
               case 'E': 
                System.out.println(" Has escollit  MegaEsbirro ");
                break;
            default:
                System.out.println("Eleccion incorrecta ");
                break;
        }
        }

        else if (copes>=2000) {
               System.out.println("Quina carta vols Caballero (c) o Bandida(b)");
        carta = sc.next().charAt(0);;

        switch (carta) {
                case 'c':
                case 'C':
                System.out.println(" Has escollit  Caballero ");
                break;

               
                case 'b':
                case 'B': 
                System.out.println(" Has escollit Bandida ");
                break;
            default:
                System.out.println("Eleccion incorrecta ");
                break;
        }




        }

             else if (copes>=3000) {
               System.out.println("Quina carta vols Ejercito de esqueletos (e) o Gigante Noble (g)");
            carta = sc.next().charAt(0);;

        switch (carta) {
                case 'e':
                case 'E':
                System.out.println(" Has escollit  Ejercito de esqueletos ");
                break;

               
                case 'g':
                case 'G': 
                System.out.println(" Has escollit Gigante Noble  ");
                break;
            default:
                System.out.println("Eleccion incorrecta ");
                break;
        }




        }

    }
}
