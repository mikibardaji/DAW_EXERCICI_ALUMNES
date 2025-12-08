public class Joc {

    private Jugador jugador;
    private String nivell;

    public Joc(String nom, String nivell) {
        if (nivell.equalsIgnoreCase("facil") || nivell.equalsIgnoreCase("dificil")) {
            this.nivell = nivell.toLowerCase();
        } else {
            this.nivell = "facil";
        }
        this.jugador = new Jugador(nom);
    }

    public void jugar() {
        System.out.println("----- COMENÇA EL JOC -----");
        System.out.println("Jugador: " + jugador.getNom());
        System.out.println("Nivell: " + nivell);

        while (jugador.getEnergia() > 0) {
            jugador.correr();

            boolean trobaMoneda;
            if (nivell.equals("facil")) {
                trobaMoneda = Math.random() < 0.7;
            } else {
                trobaMoneda = Math.random() < 0.3;
            }

            if (trobaMoneda) {
                Moneda m = new Moneda();
                jugador.recollirMoneda(m);
            } else {
                Obstacle ob = new Obstacle();
                ob.interactuar(jugador);
            }

            if (jugador.isPowerUp()) {
                System.out.println("Power-Up ACTIVAT");
            } else {
                System.out.println("Power-Up DESACTIVAT");
            }

            System.out.println("Distància: " + jugador.getDistancia() +
                               " | Energia: " + jugador.getEnergia() +
                               " | Punts: " + jugador.getPuntuacio());
            System.out.println("---------------------------");
        }

        System.out.println("===== FI DE LA PARTIDA =====");
        System.out.println("Metres recorreguts: " + jugador.getDistancia());
        System.out.println("Punts totals: " + jugador.getPuntuacio());
    }
}
