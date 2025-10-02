import java.util.Scanner;

public class FiguereoDanielClashRoyale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Clash Royale
        //Establecer variables
        int copas;
        char cartas = ' ';
        
        //Pedir cuantas copas tiene el jugador
        System.out.println("Introduce cuantas copas tienes: ");
        copas = sc.nextInt();

        //Si tienes menos de 2000 copas, elegir entre mago electrico o mega esbirro
        if (copas < 2000) {
            System.out.println("Elige entre el mago electrico (M) o el mega esbirro (E): ");
            cartas = sc.next().charAt(0);
            if (cartas == 'M' || cartas == 'm') {
                System.out.println("Has elegido el mago electrico");
            } else if (cartas == 'E' || cartas == 'e') {
                System.out.println("has elegido el mega esbirro ");
            } else {
                System.out.println("Opcion no valida ");
                cartas = sc.next().charAt(0);
                
            }
        }
        //Si tiene igual o mas de 2000 copas elegir entre caballero o bandida
        else if (copas >= 2000 && copas <= 3000) {
            System.out.println("Elige entre el caballero (C) o la bandida (B): ");
            cartas = sc.next().charAt(0);
            if (cartas == 'C' || cartas == 'c') {
                System.out.println("Has elegido el caballero ");
            }
            else if (cartas == 'B' || cartas == 'b') {
                System.out.println("Has elegido la bandida ");
            }
            else {
                System.out.println("opcion no valida ");
                cartas = sc.next().charAt(0);
            }
            }
    
        //Escoger con la primera letra del nombre
        //tiene que aceptar mayusculas y minusculas
        //Si tienes mas de 3000 copas elegir entre ejercito de esqueletos o gigante noble
        else if (copas > 3000) {
            System.out.println("Elige entre el ejercito de esqueletos (E) o el gigante noble (G): ");
            cartas = sc.next().charAt(0);
            if (cartas == 'E' || cartas == 'e') {
                System.out.println("Has elegido el ejercito de esqueletos ");
            }
            else if (cartas == 'G' || cartas == 'g') {
                System.out.println("Has elegido el gigante noble ");
            }
            else {
                System.out.println("opcion no valida ");
                cartas = sc.next().charAt(0);
            
           }       
        }    
    }

}
