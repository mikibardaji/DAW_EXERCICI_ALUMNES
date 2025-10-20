import java.util.Random;
import java.util.Scanner;

public class Exercici_clash_royale_Marcelo_Quintana_versio4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

  
        // Versión 0 

        int nivelLenyador;
        int dano = 0;

        // Validación del nivel del leñador (Versión 4)
        do {
            System.out.println("Introduce el nivel del leñador (9-13): ");
            nivelLenyador = sc.nextInt();
            if (nivelLenyador < 9 || nivelLenyador > 13) {
                System.out.println("Nivel no válido. Debe estar entre 9 y 13.");
            }
        } while (nivelLenyador < 9 || nivelLenyador > 13);

        if (nivelLenyador == 9) {
            dano = 200;
        } else if (nivelLenyador == 10) {
            dano = 220;
        } else if (nivelLenyador == 11) {
            dano = 242;
        } else if (nivelLenyador == 12) {
            dano = 266;
        } else if (nivelLenyador == 13) {
            dano = 292;
        }

        System.out.println("Tu leñador tiene " + dano + " puntos de ataque.");

     
        int nivelTorre = rd.nextInt(9, 13);
        int vidaTorre = 0;
        int ataqueTorre = 0;

     
        if (nivelTorre == 1) {
            vidaTorre = 1400;
            ataqueTorre = 50;
         } else if (nivelTorre == 2) {
            vidaTorre = 1512;
            ataqueTorre = 54;
        } else if (nivelTorre == 3) {
            vidaTorre = 1624;
            ataqueTorre = 58;
        } else if (nivelTorre == 4) {
            vidaTorre = 1750;
            ataqueTorre = 62;
        } else if (nivelTorre == 5) {
            vidaTorre = 1890;
            ataqueTorre = 67;
        } else if (nivelTorre == 6) {
            vidaTorre = 2030;
            ataqueTorre = 72;
        } else if (nivelTorre == 7) {
            vidaTorre = 2184;
            ataqueTorre = 78;
        } else if (nivelTorre == 8) {
            vidaTorre = 2352;
            ataqueTorre = 84;
        } else if (nivelTorre == 9) {
            vidaTorre = 2534;
            ataqueTorre = 90;
        } else if (nivelTorre == 10) {
            vidaTorre = 2786;
            ataqueTorre = 99;
        } else if (nivelTorre == 11) {
            vidaTorre = 3052;
            ataqueTorre = 109;
        } else if (nivelTorre == 12) {
            vidaTorre = 3346;
            ataqueTorre = 119;
        } else if (nivelTorre == 13) {
            vidaTorre = 3668;
            ataqueTorre = 131;
        }

        System.out.println("La torre enemiga es de nivel " + nivelTorre + " y tiene " + vidaTorre + " puntos de vida.");


        // Versión 1 - Bucle
        int vidaActualTorre = vidaTorre;
        int golpes = 0;



        while (vidaActualTorre > 0) {
            golpes++;
            System.out.println("Leñador ataca con fuerza " + dano + ". Vida de la torre = " + vidaActualTorre);
            vidaActualTorre = vidaActualTorre - dano;
            Thread.sleep(500);
        }

        System.out.println("La torre ha sido destruida después de " + golpes + " golpes.");

   
        // Versión 2 
        int vidaTorreV2 = vidaTorre;
        int vidaLenyador = 1000; 
        int golpes2 = 0;

      
        while (vidaTorreV2 > 0 && vidaLenyador > 0) {
            golpes2++;
            System.out.println("Leñador ataca con fuerza " + dano + ". Vida de la torre = " + vidaTorreV2);
            vidaTorreV2 = vidaTorreV2 - dano;

            if (vidaTorreV2 <= 0) {
                break; 
            }

            System.out.println("La torre se defiende y hace " + ataqueTorre + " de daño al leñador.");
            vidaLenyador = vidaLenyador - ataqueTorre;
            Thread.sleep(500);
        }

        if (vidaTorreV2 <= 0 && vidaLenyador > 0) {
            System.out.println("El leñador ha destruido la torre después de " + golpes2 + " golpes.");
        } else if (vidaLenyador <= 0 && vidaTorreV2 > 0) {
            System.out.println("El leñador ha muerto. La torre gana.");
        } else {
            System.out.println("Los dos han caído al mismo tiempo.");
        }

     
        // Versión 3
        int vidaTorreV3 = vidaTorre;
        int vidaLenyadorV3 = 1000;
        int golpes3 = 0;
        int ataqueTorreRapida = ataqueTorre * 2;


        while (vidaTorreV3 > 0 && vidaLenyadorV3 > 0) {
            golpes3++;
            System.out.println("Leñador ataca con fuerza " + dano + ". Vida de la torre = " + vidaTorreV3);
            vidaTorreV3 = vidaTorreV3 - dano;

            if (vidaTorreV3 <= 0) {
                break;
            }

            System.out.println("La torre ataca dos veces e inflige " + ataqueTorreRapida + " de daño al leñador.");
            vidaLenyadorV3 = vidaLenyadorV3 - ataqueTorreRapida;
            Thread.sleep(500);
        }

        if (vidaTorreV3 <= 0 && vidaLenyadorV3 > 0) {
            System.out.println("El leñador ha destruido la torre después de " + golpes3 + " golpes.");
        } else if (vidaLenyadorV3 <= 0 && vidaTorreV3 > 0) {
            System.out.println("El leñador ha muerto. La torre gana.");
        } else {
            System.out.println("Los dos han caído al mismo tiempo.");
        }

    }
}
