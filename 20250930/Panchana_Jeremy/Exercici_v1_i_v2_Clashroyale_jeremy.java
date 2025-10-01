import java.util.Scanner;

public class Exercici_v1_i_v2_Clashroyale_jeremy {




    /*
     * Una de les funcionalitats al  clash royale quan vas sumant copes,
     * és que quant arribes a un cert número de copes, et deixa elegir entre dues cartes
     *  per afegir-les al teu mazo. 
     *   La versió 1 del programa , simularem l'elecció de dues cartes.
     *Elegirem entre les cartes, del Mago Electrico i del esbirro mega. 
     *   El programa ha de preguntar quina carta vols Mago Electrico(0) o esbirro mega(1).
     * Quant la triis , et sortirà la frase “Has escollit XXXX(nom de la carta escollida)”.

     */

    public static void main(String[] args) {
        int carta,copes;
        Scanner sc = new Scanner (System.in);
        System.out.println(" Quantes copes tens aconseguides");
        copes =sc.nextInt();
        if (copes <2000){

             System.out.println("Quina carta vols Mago Electrico(0) o MegaEsbirro (1)");
        carta = sc.nextInt();

        switch (carta) {
            case 0:
                System.out.println(" Has escollit  Mago Electrico ");
                break;

               case 1:
                System.out.println(" Has escollit  MegaEsbirro ");
                break;
            default:
                System.out.println("Eleccion incorrecta ");
                break;
        }
        }

        else if (copes>=2000) {
               System.out.println("Quina carta vols Caballero (0) o Bandida(1)");
        carta = sc.nextInt();

        switch (carta) {
                case 0:
                System.out.println(" Has escollit  Caballero ");
                break;

               case 1:
                System.out.println(" Has escollit Bandida ");
                break;
            default:
                System.out.println("Eleccion incorrecta ");
                break;
        }




        }





    }
}
