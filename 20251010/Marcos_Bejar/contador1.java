public class contador1{
    public static void main(String[] args) {
        // Iniciamos el contador en 1
        int contador = 1;

        // Bucle que recorre todos los números del 1 al 200
        while (contador <= 200) {
            // Verificamos si el número es par
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++; // Incrementa de 1 en 1
        }
    }
}

