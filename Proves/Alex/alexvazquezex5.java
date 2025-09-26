import java.util.Scanner;

public class alexvazquezex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Escriu un numero: ");
        int numero1 = sc.nextInt();

        System.out.print(" Escriu un altre numero: ");

        int numero2 = sc.nextInt();

        if (numero1 >numero2) {
            System.out.println(numero1 +", "+ numero2);
            
        } else if (numero2>numero1) {
            System.out.println(numero2 +", "+ numero1);
            
        }else{
            System.out.println("Els dos numeros son iguals");
        }











        sc.close();
    }    

}
