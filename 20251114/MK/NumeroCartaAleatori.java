package Tarjetas;

import java.util.Random;

public class NumeroCartaAleatori {
    public static int numeroCartaAleatori() {
        Random rand = new Random();
        int numero = rand.nextInt(10) + 1; 

        if (numero == 8) {
            numero = 10;
        } else if (numero == 9) {
            numero = 11;
        } else if (numero == 10) {
            numero = 12;
        }

        return numero;
    }
}
