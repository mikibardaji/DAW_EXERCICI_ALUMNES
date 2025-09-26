import java.util.Scanner;

public class TeoriaCondicionales {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

        
            System.out.println("Escribe la nota : ");
            double nota = sc.nextDouble();
            if (nota<5)
                    {
                    
                          System.out.println("Has suspendido");
                    
                    
                    }
                    
                    else if (nota>=5 && nota<7)
                    
                    {
                        System.out.println("Aprobado");

                    }
                    else if(nota>=7 && nota<9){

                        System.out.println("Notable");
                    }
                    else if (nota>=9 && nota<=10){

                        System.out.println("Excelent");
                    }
           
       
            



    }
}
