import java.util.Random;
import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) throws InterruptedException {
        
         Scanner sc = new Scanner(System.in);
        int danyo=0;
        System.out.println("Pon el nivell ");
        int nivel_lenyador = sc.nextInt();
        if (nivel_lenyador==9)
        {
            danyo = 212;
        }
        else if (nivel_lenyador==10)
        {
            danyo = 233;
        }
        else if (nivel_lenyador==11)
        {
            danyo = 256;
        }
        else if (nivel_lenyador==12)
        {
            danyo = 281;
        }
        else if (nivel_lenyador==13)
        {
            danyo = 309;
        }        
        System.out.println("Tu leñador tiene " + danyo + " ataque");
        Random rd = new Random();
        int nivel_torre = rd.nextInt(9, 13);
        int vida_torre=0;
        
          if (nivel_torre == 9) {
            vida_torre = 2534;
        } else if (nivel_torre == 10) {
            vida_torre = 2786;
        } else if (nivel_torre == 11) {
            vida_torre = 3052;
        } else if (nivel_torre == 12) {
            vida_torre = 3346;
        } else if (nivel_torre == 13) {
            vida_torre = 3668;
        } else {
            System.out.println("Nivell no vàlid!");
            return;
        }
        
        System.out.println("Tu torre tiene " + vida_torre + " vida");
        
        
               int golpes = 0;

      
        while (vida_torre > 0) {
            vida_torre -= danyo;
            golpes++;

            if (vida_torre < 0) vida_torre = 0;

            System.out.println("Leñador ataca amb força " + danyo + ". Vida de la torre = " + vida_torre);

            Thread.sleep(500); 
        }

        System.out.println("La torre ha estat destruïda!");
        System.out.println("El llenyataire ha necessitat " + golpes + " cops per tombar-la.");
    }
}
