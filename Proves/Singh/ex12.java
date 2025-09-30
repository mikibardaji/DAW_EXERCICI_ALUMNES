import java.util.Scanner;

public class ex12 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demanar el color del semàfor
        System.out.print("De quin color està el semàfor? (V=Verd / T=Taronja / R=Roig): ");
        String resposta = sc.nextLine().toUpperCase();

        // Decidir acció segons la resposta
        if (resposta.equals("V")) {
            System.out.println("Pots passar.");
        } else if (resposta.equals("T")) {
            System.out.println("Millor espera.");
        } else if (resposta.equals("R")) {
            System.out.println("Atura't!");
        } else {
            System.out.println("Color no vàlid. Introdueix V, T o R.");
        }
    }
}
