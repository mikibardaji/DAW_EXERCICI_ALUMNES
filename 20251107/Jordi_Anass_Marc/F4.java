public class F4 {

        
    public static void imp_ganador(int ganador) {
        if (ganador == 0) {
            System.out.println("Hay empate");
        } else if (ganador == 1) {
            System.out.println("Has ganado");
        } else if (ganador == 2) {
            System.out.println("Ha ganado el ordenador");
        } else {
            System.out.println("Valor no válido (debe ser 0, 1 o 2)");
        }
    }

    public static void main(String[] args) {
        
        imp_ganador(0); 
        imp_ganador(1); 
        imp_ganador(2); 
        imp_ganador(5); 
    }
}
