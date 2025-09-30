import java.util.Scanner;

public class Semaforo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Quin color està el semàfor ( V-Verd / T-Taronja/ R-Vermell ): ");
        char color = sc.next().charAt(0);

        if (color == 'V'){
            System.out.println(" Pots pasar");
        } else if (color == 'T') {
            System.out.println("Pasa amb precaucio");

        } else if (color == 'R') {
            System.out.println("Para't");

        }else {
            System.out.println("Resposta incorrecta");
        }

    }
}


