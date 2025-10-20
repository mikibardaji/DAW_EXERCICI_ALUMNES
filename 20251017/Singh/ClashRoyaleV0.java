import java.util.Random;
import java.util.Scanner;

public class ClashRoyale {
    public static void main(String[] args) {
     /**
      *(Versió0) Sense bucle , sol preguntarà, quin nivell té el teu llenyataire, 
      i quin nivell té la torre. I el programa mostrara el Daño que fara 
      el teu llenyataire amb funció del nivell i la vida que tindrà la torre, 
      en funció del nivell de la torre(aleatori), que pots consultar aquí. */  
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int danyo=0;
        System.out.print("Introdueix el nivell del llenyataire: ");
        int nivellLlenyataire = sc.nextInt();

        if (nivellLlenyataire==9) {
            danyo = 200;
        }else if(nivellLlenyataire==10) {
            danyo = 220;
        }else if (nivellLlenyataire==11) {
            danyo = 242;
        }else if (nivellLlenyataire==12) {
            danyo = 266;
        }else if (nivellLlenyataire==13) {
            danyo = 292;
        }
        System.out.println("Tu llenyataire tiene " + danyo + " ataque");

        System.out.print("Introdueix el nivell de la torre: ");
        int nivellTorre = sc.nextInt();
        int vida_torre=0;
        if (vida_torre==9) {
            vida_torre = 240;
        }else if (vida_torre==10) {
            vida_torre = 240;
        }else if(vida_torre==11) {
            vida_torre = 240;
        }else if(vida_torre==12) {
            vida_torre = 240;
        }
        System.out.println("Tu torre tiene " + vida_torre + " Vida");


        
    }
}
