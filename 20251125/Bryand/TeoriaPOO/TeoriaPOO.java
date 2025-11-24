package TeoriaPOO;

import Objetos.botella;

public class TeoriaPOO {

    public static void main(String[] args) {

        botella b = new botella();

        System.out.println("Botella tapada:");
        System.out.println("Intento verter: " + b.verter() + "ml");
        System.out.println("Contenido actual: " + b.getContingut() + "ml");

        b.abrirBotella();
        System.out.println("\nBotella abierta:");
        System.out.println("Intento verter: " + b.verter() + "ml");
        System.out.println("Contenido actual: " + b.getContingut() + "ml");

        System.out.println("\nIntento verter más de lo que queda:");
        System.out.println("Intento verter 10ml: " + b.verter() + "ml");
        System.out.println("Contenido actual: " + b.getContingut() + "ml");
    }
}
