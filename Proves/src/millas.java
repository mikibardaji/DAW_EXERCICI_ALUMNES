import java.util.Scanner;

public class millas {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int millas;
    System.out.print("Cuantas millas has recorrido? ");
    millas = sc.nextInt();

    double metros = millas * 1.852;
    
    System.out.println("Has recorrido " + metros + " metros");
    }

}
