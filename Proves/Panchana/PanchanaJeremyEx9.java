import java.util.Scanner;

public class PanchanaJeremyEx9 {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int hora,minuto,segundo;


            System.out.println("Escribe la hora : ");
            hora = sc.nextInt();    

             System.out.println("Escribe el minuto : ");
            minuto = sc.nextInt();    
            System.out.println("Escribe el segundo : ");
            segundo = sc.nextInt();    



            segundo = segundo +1;



            if (segundo >=60){
                segundo=0;
                minuto = minuto + 1;
            
            }
            if (minuto >=60){
            
                minuto = 0;
                hora = hora + 1;
            
            }

            if (hora >=24){

                hora =0;
                


            }



            System.out.println(" hora , "  + hora + " , minutos " + minuto + " , segundos " + segundo);




    }
}
