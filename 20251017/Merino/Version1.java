import java.util.Scanner;

public class Version1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nivel tiene tu leñador?");
        int leñador = sc.nextInt();
        int daño = 0;

        if (leñador == 9) {
            daño = 212;
        }
        else if (leñador == 10) {
            daño = 233;
        }
        else if (leñador == 11) {
            daño = 256;
        }
        else if (leñador == 12) {
            daño = 281;
        }

        System.out.println("Tu leñador ejerce " + daño + " de daño.");

         System.out.println("¿Qué nivel tiene la torre?");
        int torre = sc.nextInt();
        int vida_torre = 0;

        if (torre == 1) {
            vida_torre = 1400;
        }
        else if (torre == 2) {
            vida_torre = 1512;
        }
        else if (torre == 3) {
            vida_torre = 1624;
        }
        else if (torre == 4) {
            vida_torre = 1750;
        }

        int resultado_vida = vida_torre - daño;
        System.out.println(" La vida de la torre es " + vida_torre + ". Tu leñador le hará " + daño + " de daño. La vida de la torre queda en " + resultado_vida + ".");
    
        int vueltas_golpes = 0;
        

        while (vida_torre > 0) {
            
            vida_torre -= daño;
            vueltas_golpes++;

            if (vida_torre < 0) {   
                vida_torre = 0; 
                
                System.out.println("El leñador infringe " + daño + " de daño. La vida de la torre es de " + vida_torre + ".");
                Thread.sleep(500);
            }
        }

        System.out.println("La torre ha sido destruida con " + vueltas_golpes + " golpes.");
    }

}
