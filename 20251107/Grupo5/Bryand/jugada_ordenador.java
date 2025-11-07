import java.util.Random;

public class jugada_ordenador {
public static void main(String[] args) {
    int turno_ordenador=valorAatorioOrdenador();
}
    public static int valorAatorioOrdenador()
        {
            Random rd = new Random();
            int ordenador;
            ordenador = rd.nextInt(0, 3);
            return ordenador;

        }

}
