import java.util.Random;
import java.util.Scanner;

public class Bucles_ClashRoyale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        
        int daño = 0;
        int vida = 0;
        int leñador;
        
        do {
        System.out.print("Que nivel es tu leñador? ");
        leñador = sc.nextInt();

        if (leñador < 9 || leñador > 13) {
             System.out.println("Nivel no permitido, Vuelve a intentarlo.");
            }

                } while (leñador < 9 || leñador > 13);


        if (leñador == 11){
            daño = 256;
            vida = 1282;
        }
        
        else if (leñador == 12){
            daño = 281;
            vida = 1409;
            System.out.println("");
        }

        else if (leñador == 13){
            daño = 309;
            vida = 1547;
            System.out.println();
        }

        else if (leñador == 14){
            daño = 339;
            vida = 1696;
            System.out.println();
        }


        System.out.println("Tu leñador tiene " + daño + " ataque");
        System.out.println("Tu leñador tiene " + vida + " vida");

        int torre = rd.nextInt(15 - 11 + 1) + 11;
        int vida_torre = 0;
        int torre_daño = 0;

        if (torre == 11){
            vida_torre = 3052;
            torre_daño = 218;
        }

        else if (torre == 12){
            vida_torre = 3346;
            torre_daño = 238;
        }

        else if (torre == 13){
            vida_torre = 3668;
            torre_daño = 262;
        }

        else if (torre == 14){
            vida_torre = 4032;
            torre_daño = 288;
        }

        else if (torre == 15){
            vida_torre = 4424;
            torre_daño = 316;
        }


            System.out.println("La torre tiene " + vida_torre + " de vida");
            System.out.println("La torre tiene " + torre_daño + " de daño");

        int golpes = 0;

        while (vida_torre > 0 && vida > 0) {
            golpes++;

           
            vida_torre -= daño;
            if (vida_torre < 0) vida_torre = 0;
            System.out.println("Leñador ataca amb força " + daño + ".    Vida de la torre = " + vida_torre);

            
            if (vida_torre <= 0) break;

          
            vida -= torre_daño;
            if (vida < 0) vida = 0;
            System.out.println("La torre hace " + torre_daño + " de daño.    Vida del llenyataire = " + vida);
            System.out.println();
        }


        if (vida_torre <= 0 && vida > 0) {
            System.out.println("El leñador ha tumbado la torre con " + golpes + " golpes!");
        } else if (vida <= 0 && vida_torre > 0) {
            System.out.println("La torre ha derrotado al leñador despues de " + golpes + " golpes!");
        } 

}
}