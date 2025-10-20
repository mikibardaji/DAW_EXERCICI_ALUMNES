import java.util.Scanner;

public class ClashRoyale {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int nivelleñador;
        int niveltorre;
        int dañoLeñador = 0;
        int dañoTorre = 0;
        int vidaLeñador = 0;
        int vidaTorre = 0;
        int golpes = 0;

        
        System.out.println("¿Qué nivel tiene la torre? (9-13) ");
        niveltorre = sc.nextInt();
        System.out.println("¿Qué nivel tiene el leñador? (9-13)");
        nivelleñador = sc.nextInt();

        
        if (nivelleñador == 9) 
        {
            dañoLeñador = 200;
            vidaLeñador = 1060;

        } else if (nivelleñador == 10) 
        {
            dañoLeñador = 220;
            vidaLeñador = 1166;

        } else if (nivelleñador == 11)
         {
            dañoLeñador = 242;
            vidaLeñador = 1282;

        } else if (nivelleñador == 12) 
        {
            dañoLeñador = 266;
            vidaLeñador = 1410;

        } else if (nivelleñador == 13) 
        {
            dañoLeñador = 292;
            vidaLeñador = 1549;
        }

        System.out.println("Tu leñador tiene " + dañoLeñador + " de ataque y " + vidaLeñador + " de vida");

        
        if (niveltorre == 9) 
        {
            vidaTorre = 2534;
            dañoTorre = 90;

        } else if (niveltorre == 10) 
        {
            vidaTorre = 2786;
            dañoTorre = 99;
            
        } else if (niveltorre == 11) 
        {
            vidaTorre = 3052;
            dañoTorre = 109;

        } else if (niveltorre == 12) 
        {
            vidaTorre = 3346;
            dañoTorre = 120;

        } else if (niveltorre == 13) 
        {
            vidaTorre = 3668;
            dañoTorre = 133;
        }

        System.out.println("La torre de nivel " + niveltorre + " tiene " + vidaTorre + " de vida y " + dañoTorre + " de ataque");

        
        while (vidaTorre > 0 && vidaLeñador > 0) {
            golpes++;

            vidaTorre -= dañoLeñador;
            if (vidaTorre < 0) vidaTorre = 0; 
            System.out.println("Golpe " + golpes + ": Leñador ataca con fuerza " + dañoLeñador + " -> Vida de la torre: " + vidaTorre);

            if (vidaTorre <= 0) break;

            vidaLeñador -= dañoTorre;
            if (vidaLeñador < 0) vidaLeñador = 0;
            System.out.println("Golpe " + golpes + ": Torre contraataca con fuerza " + dañoTorre + " -> Vida del leñador: " + vidaLeñador);

            Thread.sleep(500); 
        }

        System.out.println();
        if (vidaTorre <= 0 && vidaLeñador <= 0) {
            System.out.println(" Empate Ambos han caído al mismo tiempo.");
        } else if (vidaTorre <= 0) {
            System.out.println(" La torre ha sido destruida en " + golpes + " golpes Gana el leñador.");
        } else {
            System.out.println(" El leñador ha caído en " + golpes + " golpes Gana la torre.");
        }
    }
}