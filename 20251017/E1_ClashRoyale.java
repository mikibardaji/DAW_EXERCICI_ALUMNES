

import java.util.Scanner;

    public class E1_ClashRoyale {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            int nivelLeñador;
            int vidaLeñador = 0;
            int dañoLeñador = 0 ;
            do{
                System.out.println("Cual es el nivel de tu leñador? (11-13)");
                nivelLeñador = sc.nextInt();
                if (nivelLeñador == 11 ){
                    dañoLeñador = 242;
                    vidaLeñador = 1282;

                }
                else if (nivelLeñador == 12){
                    dañoLeñador = 266;
                    vidaLeñador = 1409;
                }
                else if (nivelLeñador == 13){
                    dañoLeñador = 292;
                    vidaLeñador = 1547;
                }
                else {
                    System.out.println("Nivel de leñador invalido");
                } 
            }while (nivelLeñador < 11 || nivelLeñador > 13);
                
            

            int nivelTorre;
            int vidaTorre = 0;
            int dañoTorre = 0;
            do{
                System.out.println("Cual es el nivel de tu torre? ");
                nivelTorre = sc.nextInt();
                if (nivelTorre == 13){
                    vidaTorre = 3668; 
                    dañoTorre = 131;
                }
                else if (nivelTorre == 14){
                    vidaTorre = 4032;
                    dañoTorre = 144;
                }
                else if (nivelTorre == 15){
                    vidaTorre = 4424;
                    dañoTorre = 158;
                }
                else {
                    System.out.println("Nivel de torre no valido ");
                }
            }while (nivelTorre < 13 || nivelTorre > 15); 
            
        
            dañoTorre = dañoTorre * 2;

            int golpes = 0;
            while (vidaTorre>0 && vidaLeñador > 0 ) {
            vidaTorre = vidaTorre - dañoLeñador;
            golpes++;  
             if (vidaTorre>0){
                System.out.println("Leñador ataca amb força " + dañoLeñador + " Vida de la torre= " + vidaTorre);
             }
             if (vidaTorre <= 0) {
                System.out.println("Golpes = " + golpes + " Torre derribada");
             }
             vidaLeñador = vidaLeñador - dañoTorre;
             if (vidaLeñador>0) {
                System.out.println("Torre ataca amb força " + dañoTorre + " Vida leñador= " + vidaLeñador);
                
             }
             if (vidaLeñador <= 0) {
                System.out.println("Golpes = " + golpes + " Leñador eliminado, Ganador TORRE");
                
             }
            }
sc.close();

           
        }
}
