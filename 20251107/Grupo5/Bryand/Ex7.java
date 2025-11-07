import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        

        ganador(0, 0);
    }

    private static int ganador(int choose_player1, int choose_player2) {
        if (choose_player1 == choose_player2) {
        return 0;
    } 
    else if (choose_player1 == 0 && choose_player2 == 2){
        return 1;
    }

    else if (choose_player1 == 1 && choose_player2 == 0){
        return 1;
    }

    else if (choose_player1 == 2 && choose_player2 == 1){
        return 1; 
    }

    else {
        return 2;
    }
}
}
