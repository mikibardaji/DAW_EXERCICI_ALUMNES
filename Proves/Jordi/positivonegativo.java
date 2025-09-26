import java.util.Scanner;

public class positivonegativo {

public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("Introduce un número ");
int numero = sc.nextInt();

if (numero> 0)
{
System.out.println(" El número és positivo.");

}
else if (numero<- 0) {
System.out.println(" El número és negativo.");
}

else if (numero==0) {
System.out.println(" El número és zero. ");    
}



}
}
