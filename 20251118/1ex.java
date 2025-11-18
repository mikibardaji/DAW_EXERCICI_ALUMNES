import java.util.Scanner;
public class 1ex {
    public static void main(String[] args) throws Exception {
        
    }

    public static String elegir_lado_jugador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elige lado (Left/Right/Center): ");
        return sc.nextLine();
    }
}

