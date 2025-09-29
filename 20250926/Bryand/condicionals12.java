import java.util.Scanner;

public class condicionals12 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Que color esta el semáforo? (V - verde, A - Amarillo, R - rojo): ");
     char letra = sc.nextLine().charAt(0);

    if (letra == 'V'){

        System.out.println("Puedes pasar");

        
    }
    else if (letra == 'R') {
        System.out.println("No passes, espera");
    }

    else if (letra == 'A') {
        System.out.println("Date prisa, puedes pasar");
    }
    else {
        System.out.println("Color no vàlid. Si us plau, introdueix V, T o R.");
    }

 }
}