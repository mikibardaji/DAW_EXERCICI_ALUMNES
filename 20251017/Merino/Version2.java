import java.util.Scanner;

public class Version2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nivel tiene tu leñador?");
        int leñador = sc.nextInt();
        int daño_leñador = 0;
        int vida_leñador = 0;
        int vida_torre = 0;
        int daño_torre = 0;

        if (leñador == 9) {
            daño_leñador = 212;
            vida_leñador = 1060;
        }
        else if (leñador == 10) {
            daño_leñador = 233;
            vida_leñador = 1166;
        }
        else if (leñador == 11) {
            daño_leñador = 256;
            vida_leñador = 1282;
        }
        else if (leñador == 12) {
            daño_leñador = 281;
            vida_leñador = 1409;
        }

        System.out.println("¿Qué nivel tiene la torre?");
        int torre = sc.nextInt();
          
        if (torre == 1) {
            vida_torre = 1400;
            daño_torre = 50;
        }
        else if (torre == 2) {
            vida_torre = 1512;
            daño_torre = 54;
        }
        else if (torre == 3) {
            vida_torre = 1624;
            daño_torre = 58;
        }
        else if (torre == 4) {
            vida_torre = 1750;
            daño_torre = 62;
        }
        else if (torre == 5) {
            vida_torre = 1890;
            daño_torre = 67;
        }
        else if (torre == 6) {
            vida_torre = 2030;
            daño_torre = 72;
        }
        else if (torre == 7) {
            vida_torre = 2184;
            daño_torre = 78;
        }
        else if (torre == 8) {
            vida_torre = 2352;
            daño_torre = 84;
        }

        System.out.println("Tu leñador infringe " + daño_leñador + " de daño y tiene " + vida_leñador + " de vida.");
        System.out.println("La torre infringe " + daño_torre + " de daño y tiene " + vida_torre + " de vida.");
        
        int golpes_leñador = 0;
        int golpes_torre = 0;
        
        while (vida_torre > 0 && vida_leñador > 0) {

            golpes_leñador++;
            vida_torre -= daño_leñador;
            
            if (vida_torre < 0) {   

                
                System.out.println("El leñador infringe " + daño_leñador + " de daño. La vida de la torre es de " + vida_torre + ".");
                Thread.sleep(500);
            }
            if (vida_torre == 0) 
            
                break;
            
                golpes_torre++;
                vida_leñador -= daño_torre;

            if (vida_leñador < 0) {   
                
                
                System.out.println("La torre infringe " + daño_torre + " de daño. La vida del leñador es de " + vida_leñador + ".");
                Thread.sleep(500);

          }
            }
            if (vida_torre <= 0) {
                System.out.println("¡¡La torre ha perdido!! Ha sido destruida con " + golpes_leñador + " golpes.");
            } else {
                System.out.println("¡¡El leñador ha perdido!! Ha sido destruido con " + golpes_torre + " golpes.");
            }
        }

}
