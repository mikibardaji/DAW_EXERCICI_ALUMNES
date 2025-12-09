package objetos;

import java.util.Random;

public class Juego {
    private Jugador jugador;
    private String nivel;

    public Juego(String nombreJugador, String nivel) {

        if (nivel.equalsIgnoreCase("facil") || nivel.equalsIgnoreCase("dificil")) {
            this.nivel = nivel;
        } else {
            this.nivel = "facil";
        }

        this.jugador = new Jugador(nombreJugador);
    }


    public void jugar() {

        System.out.println("----- COMIENZA EL JUEGO -----");
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Nivel: " + nivel);
        System.out.println("-----------------------------");

        Random rand = new Random();

        while (jugador.getEnergia() > 0) {

            jugador.correr();

            int dificultad = rand.nextInt(5) + 1;
            Obstaculo obstaculo = new Obstaculo("barrera", dificultad);

            obstaculo.interactuar(jugador);

            Moneda moneda = new Moneda();
            jugador.recogerMoneda(moneda);

            if (jugador.tienePowerUp()) {
                System.out.println("Power-Up ACTIVADO: ¡corres el triple!");
            } else {
                System.out.println("Power-Up DESACTIVADO");
            }

            System.out.println(
                "Distancia: " + jugador.getDistancia() +
                " | Energía: " + jugador.getEnergia() +
                " | Puntos: " + jugador.getPuntuacion()
            );

            System.out.println("----------------------------------------");
        }

        System.out.println("===== FIN DE LA PARTIDA =====");
        System.out.println("Metros recorridos: " + jugador.getDistancia());
        System.out.println("Monedas conseguidas: " + jugador.getPuntuacion());
    }
}
