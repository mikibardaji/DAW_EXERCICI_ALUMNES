import java.util.Scanner;
public class exercic2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int números =2;
        int suma=2;
        boolean num_igual2 = true;

        while (num_igual2) {
            System.out.println("Per saber el següent nombre parell, introduïu 2");
            números  = sc.nextInt();
            if (números <=200 && números == 2) {
                
                suma+=números ;
                System.out.println("El nombre parell és: " + suma);
            }
            else{
                num_igual2 = false;
                System.out.println("el nombre no es 2");
            }
        }

        /*while (números <=200) {
            System.out.println("Per saber el següent nombre parell, introduïu 2");
            números  = sc.nextInt();
            suma+=números ;
            System.out.println("El nombre parell és: " + suma);
             números  += 1;
             
        }*/
        



    }
}
