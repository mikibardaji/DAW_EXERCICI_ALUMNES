package Tarjetas;

import java.util.Random;

public class PalCartaAleatori {
    public static int palCartaAleatori() {
        Random rand = new Random();
        return rand.nextInt(4) + 1; // 1-4
    }
}
