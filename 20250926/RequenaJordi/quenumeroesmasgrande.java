import java.util.Scanner;

public class quenumeroesmasgrande {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 

System.out.println(" Introduce el número 1 ");   
int numero1 = sc.nextInt();

System.out.println(" Introduce el número 2 ");
int numero2 = sc.nextInt();

System.out.println(" Introduce el número 3 ");
int numero3 = sc.nextInt();

if (numero1>numero2 && numero1>numero3) {
System.out.println(" El número más grande és el " + numero1 + ".");
}
else if (numero2>numero1 && numero2>numero3) {
System.out.println(" El número más grande és el " + numero2 + ".");    
}
else if (numero3>numero1 && numero3>numero2) {
System.out.println(" El número más grande és el " + numero3 + ".");    
}


}

}
