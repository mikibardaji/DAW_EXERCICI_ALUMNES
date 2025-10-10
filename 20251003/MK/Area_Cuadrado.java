import java.util.Scanner;

public class Area_Cuadrado {
 public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Cuanto mide el lado del cuadrado?");

        int lado = sc.nextInt();

        int area = lado * lado;

    System.out.println("El área del cuadrado es: " + area);
 }      

}
