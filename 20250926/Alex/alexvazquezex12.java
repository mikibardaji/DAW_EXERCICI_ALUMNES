import java.util.Scanner;

public class alexvazquezex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin color està el semàfor (V-verd/T-Taronja/Roig-Aturar): ");
        char color = sc.next().charAt(0);

        if (color == 'V'){
            System.out.println(" Pots pasar");
        } else if (color == 'T') {
            System.out.println("Pasa amb precaucio");

        } else if (color == 'R') {
            System.out.println("Aturat");

        }else {
            System.out.println("Resposta incorrecte");
        }
        sc.close();

    }
}