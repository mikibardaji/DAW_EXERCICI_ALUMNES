import java.util.Random;

public class Joc {

    private Jugador jugador;
    private Guardia guardia;
    private String nivell;

    public Joc(String nom, String nivell) {
        jugador = new Jugador(nom);
        guardia = new Guardia();

        if (nivell.equalsIgnoreCase("facil") || nivell.equalsIgnoreCase("dificil")) {
            this.nivell = nivell;
        } else {
            this.nivell = "facil";
        }

        System.out.println("Joc iniciat en nivell: " + this.nivell);
    }

    public void jugar() {
        Random r = new Random();

        while (jugador.getEnergia() > 0) {

            jugador.correr();
            guardia.correr();

            int random = r.nextInt(100) + 1;

            boolean esMoneda;
            if (nivell.equals("facil")) {
                esMoneda = random <= 70;
            } else {
                esMoneda = random <= 30;
            }

            if (esMoneda) {
                Moneda m = new Moneda();
                jugador.recollirMoneda(m);
            } else {
                String tipus = r.nextInt(2) == 0 ? "barrera" : "tren";
                Obstacle o = new Obstacle(tipus);
                jugador.xocar(o);
            }

            if (guardia.detingut(jugador)) {
                break;
            }

            System.out.println("----------------------------------");
        }

        System.out.println("🎯 FI DEL JOC");
        System.out.println("Distància recorreguda: " + jugador.getDistanciaAcumulada());
        System.out.println("Puntuació final: " + jugador.getPuntuacio());
    }
}
