import java.util.Scanner;
public class Ex12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   char color;

        System.out.println("De quin color està el semàfor? (V - Verd, T - Taronja, R - Roig):");
        color = sc.nextLine().charAt(0);
        if (color == 'V') {
            System.out.println("Pots passar");
        } else if (color == 'T') {
            System.out.println("Corre");
        } else if (color == 'R') {
            System.out.println("Espera");
        } else {
            System.out.println("Color Incorrecte");
        }
}
}
