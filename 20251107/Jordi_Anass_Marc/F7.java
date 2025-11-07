public class F7 {


    public static int ganador(int choose_player1, int choose_player2) {
        
        if (choose_player1 == choose_player2) {
            return 0;
        }

        
        if ((choose_player1 == 0 && choose_player2 == 2) ||  
            (choose_player1 == 1 && choose_player2 == 0) ||  
            (choose_player1 == 2 && choose_player2 == 1)) {  
            return 1;
        }

        
        return 2;
    }

    public static void main(String[] args) {
        
        System.out.println("Piedra vs Piedra → " + ganador(0, 0)); 
        System.out.println("Piedra vs Papel → " + ganador(0, 1));  
        System.out.println("Piedra vs Tijera → " + ganador(0, 2)); 
        System.out.println("Papel vs Tijera → " + ganador(1, 2));  
        System.out.println("Tijera vs Papel → " + ganador(2, 1));  
    }
}
