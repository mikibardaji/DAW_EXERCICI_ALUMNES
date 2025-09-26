import java.util.Scanner;

public class alexvazquezex9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe los segundos: ");
        int segundos = sc.nextInt();

        System.out.print("Escribe los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Escribe la hora: ");
        int hora = sc.nextInt();
        segundos += 1;


        if (segundos >=60 ) {
            segundos = 0;
            minutos += 1;
            

            if (minutos>= 60) {
                minutos = 0;
                hora += 1;
               

                if (hora >= 24) {
                    hora = 0;
                    minutos = 0;
                    hora = 0;
                    

                    
                }
                
                
            }
            
      
            
        }

        System.out.println(hora+":"+minutos+":"+ segundos);



    
        






        sc.close();
    }    

}
