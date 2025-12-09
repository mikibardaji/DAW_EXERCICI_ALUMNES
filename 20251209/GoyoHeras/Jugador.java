package objetos;

public class Jugador {
    private String nombre;
    private int puntuacion;
    private int distanciaRecorrida;
    private int energia;
    private boolean powerUp;

    public Jugador(String nombre) {
        this.nombre = nombre;
        puntuacion = 0;
        distanciaRecorrida = 0;
        energia = 50;
        powerUp = false;
    }

    public void correr() {
        if (powerUp) {
            distanciaRecorrida += 2 * 3;
        } else {
            distanciaRecorrida += 2;
        }
    }

    public void recogerMoneda(Moneda moneda) {
        puntuacion += moneda.getValor();

        if (moneda.tienePowerUp()) {
            powerUp = true;
        } else {
            powerUp = false;
        }
    }

    public void chocar(Obstaculo obstaculo) {
        energia -= obstaculo.getDificultad();
        powerUp = false;
    }

    public int getEnergia() {
        return energia;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getDistancia() {
        return distanciaRecorrida;
    }

    public boolean tienePowerUp() {
        return powerUp;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }
}
