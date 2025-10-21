import java.util.Random;
import java.util.Scanner;

public class exrcici2 {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Pon el nivell (9-13): ");
        int nivel_lenyador = sc.nextInt();

        int danyo_lenyador = 0;
        int vida_lenyador = 0;
        int danyo_torre = 0;
        int vida_torre = 0;

      
        if (nivel_lenyador == 9) {
            danyo_lenyador = 212;
            vida_lenyador = 1060;
        } else if (nivel_lenyador == 10) {
            danyo_lenyador = 233;
            vida_lenyador = 1166;
        } else if (nivel_lenyador == 11) {
            danyo_lenyador = 256;
            vida_lenyador = 1282;
        } else if (nivel_lenyador == 12) {
            danyo_lenyador = 281;
            vida_lenyador = 1409;
        } else if (nivel_lenyador == 13) {
            danyo_lenyador = 309;
            vida_lenyador = 1548;
        } else {
            System.out.println("Nivell no vàlid!");
            sc.close();
            return;
        }

        
        int nivel_torre = rd.nextInt(5) + 9;

        if (nivel_torre == 9) {
            vida_torre = 2534;
            danyo_torre = 90;
        } else if (nivel_torre == 10) {
            vida_torre = 2786;
            danyo_torre = 99;
        } else if (nivel_torre == 11) {
            vida_torre = 3052;
            danyo_torre = 108;
        } else if (nivel_torre == 12) {
            vida_torre = 3346;
            danyo_torre = 117;
        } else if (nivel_torre == 13) {
            vida_torre = 3668;
            danyo_torre = 127;
        }

        System.out.println("\nEl teu llenyataire (nivell " + nivel_lenyador + ") té " + vida_lenyador + " de vida i " + danyo_lenyador + " dany per cop.");
        System.out.println("La torre enemiga (nivell " + nivel_torre + ") té " + vida_torre + " de vida i " + danyo_torre + " dany per cop.\n");

        int volta = 1;
        int copsLleny = 0;
        int copsTorre = 0;

        while (vida_lenyador > 0 && vida_torre > 0) {
            System.out.println("VOLTA " + volta);

           
            vida_torre -= danyo_lenyador;
            if (vida_torre < 0) vida_torre = 0;
            copsLleny++;
            System.out.println("Leñador ataca amb força " + danyo_lenyador + ". Vida de la torre = " + vida_torre);

          
            if (vida_torre <= 0) break;

            Thread.sleep(500); 

           
            vida_lenyador -= danyo_torre;
            if (vida_lenyador < 0) vida_lenyador = 0;
            copsTorre++;
            System.out.println("Torre respon amb atac de " + danyo_torre + ". Vida del llenyataire = " + vida_lenyador);

            Thread.sleep(500); 
            volta++;
            System.out.println();
        }

      
        System.out.println();
        if (vida_torre <= 0 && vida_lenyador > 0) {
            System.out.println("El llenyataire ha destruït la torre!");
            System.out.println("Cops del llenyataire: " + copsLleny + "   |   Cops de la torre: " + copsTorre);
        } else if (vida_lenyador <= 0 && vida_torre > 0) {
            System.out.println("La torre ha vençut el llenyataire!");
            System.out.println("Cops del llenyataire: " + copsLleny + "   |   Cops de la torre: " + copsTorre);
        } else {
            System.out.println("Els dos han caigut alhora!");
            System.out.println("Cops del llenyataire: " + copsLleny + "   |   Cops de la torre: " + copsTorre);
        }
    }
}
