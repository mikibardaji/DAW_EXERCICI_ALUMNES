import java.util.Scanner;
public class exercic3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int números =1;
        int suma=0;
        boolean num_igual1 = true;

        while (num_igual1) {
            System.out.println("Per saber el següent nombre parell, introduïu 1");
            números  = sc.nextInt();
            if(números <=200 && números == 1){
                suma+=números ;
                System.out.println("El nombre parell és: " + suma*2);
            }
            else{
                num_igual1 = false;
                System.out.println("el nombre no es 1");
            }
        }
        

        /*while (números <=200) {
            System.out.println("Per saber el següent nombre parell, introduïu 1");
            números  = sc.nextInt();
            suma+=números ;
            System.out.println("El nombre parell és: " + suma*2);
             números  += 1;
             
        }*/
        



    }
}    

