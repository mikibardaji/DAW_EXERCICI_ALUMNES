public class Funcion3 {

    public static void imp_jugada(String quien_juega, int choose) {
        String jugada;

        switch (choose) {
            case 0:
                jugada = "Piedra";
                break;
            case 1:
                jugada = "Papel";
                break;
            case 2:
                jugada = "Tijera";
                break;
            default:
                jugada = "Valor no válido";
                break;
        }

        System.out.println(quien_juega + " ha sacado: " + jugada);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        imp_jugada("Jugador", 0);
        imp_jugada("Máquina", 2);
    }
}
