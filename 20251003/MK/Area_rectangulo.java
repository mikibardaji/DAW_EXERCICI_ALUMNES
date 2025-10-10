import java.util.Scanner;

public class Area_rectangulo {
 public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuanto mide la base del rectangulo?");
    int base = sc.nextInt();
    System.out.println("Cuanto mide la altura del rectangulo?");
    int altura = sc.nextInt();
    int area = base * altura;

    System.out.println("El área del rectángulo es: " + area);
 }  
}
