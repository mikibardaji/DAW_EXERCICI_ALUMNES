import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        double base;
        System.out.print("Cuanto mide la base del rectangulo? ");
        base = sc.nextDouble();

        double altura;
        System.out.print("Cuanto mide la altura del rectangulo? ");
        altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El area mide " + area);
        
    }
}

