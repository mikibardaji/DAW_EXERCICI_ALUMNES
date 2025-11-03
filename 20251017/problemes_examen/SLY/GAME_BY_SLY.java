import java.util.Random;
import java.util.Scanner;

public class GAME_BY_SLY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        final int rounds = 5;  // Número total de rondas, no se puede cambiar   
        int ronda;
        int player;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + rounds + " rounds to choose numbers between 1 and 10.");
        System.out.println("Try to avoid matching the machine's number! Good luck!");
        System.out.println("----------------------------------------");

        for (ronda = 1; ronda <= rounds; ronda++) {
            
            // Validar número con do-while
            do {
                System.out.print("Round " + ronda + " - Pick your number (1-10): ");
                player = sc.nextInt();
                if (player < 1 || player > 10) {
                    System.out.println("Invalid number! Please choose a number between 1 and 10.");
                }
            } while (player < 1 || player > 10);

            //si el numero es valido, se empieza el juego

            int machine = rand.nextInt(1,11);  // 1 a 10
            System.out.println("You picked: " + player);
            System.out.println("Machine picked: " + machine);

            if (player == machine) {
                System.out.println("Oh no! The machine guessed your number. You lose!");
                break; // Sale del bucle si pierde
            } else {
                System.out.println("Round " + ronda + " complete. No matches yet, keep going!");
                System.out.println("----------------------------------------");
            }
        }

        // Si el bucle terminó todas las rondas, el jugador gana
        if (ronda > rounds) {
            System.out.println("Congratulations! You survived all rounds without a match. You win!");
        }

        sc.close();
    }
}
