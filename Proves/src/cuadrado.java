import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        int lado;
        System.out.print("Cuanto mide el lado del cuadrado?");
        lado = sc.nextInt();
        int area = lado * 2;
        System.out.println("El area mide " + area);
        
    }
}
