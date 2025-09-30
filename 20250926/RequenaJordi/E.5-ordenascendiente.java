import java.util.Scanner;

public class ordenascendiente {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println(" Introduce el número 1 ");
int numero1 = sc.nextInt();

System.out.println(" Introduce el número 2 ");
int numero2 = sc.nextInt();

if (numero1>numero2) {
System.out.println("En orden ascendente és " + numero1 + " , " + numero2 +  " . ");    
}
else if (numero2>numero1) {
System.out.println(" En orden ascendente és " + numero2 + " , " + numero1 + " ." );    
}



}
}
