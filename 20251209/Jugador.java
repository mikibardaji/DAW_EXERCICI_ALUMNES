public class Jugador {

    private String nombre;
    private int puntuacion;
    private int distancia_acumulada = 0;
    private int energia = 50;
    private boolean power_up;

    public Jugador(String nombre, int puntuacion){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre(){
        return nombre;
    }
    
    public int getPuntuacion(){
        return puntuacion;
    }

    public int getDistancia_acumulada(){
        return distancia_acumulada;
    }

    public int getEnergia(){
        return energia;
    }

    public boolean isPowerUp(){
        return power_up;
    }

    public void correr(){
        int metros = 2;

        if (power_up) {
            metros = metros * 3;
        }

        distancia_acumulada = distancia_acumulada + metros;

        System.out.println("El jugador ha corrido " + metros + " metros. Total: " + distancia_acumulada);
    }

    public void recogerMoneda(Moneda coin){
        puntuacion = puntuacion + coin.getValor();

        System.out.println("Has recogido una moneda de " + coin.getValor() + " puntos.");

        if (coin.hasPowerUp()) { 
            power_up = true;
            System.out.println("¡Power up activado!");
        } else {
            power_up = false;
            System.out.println("Power up desactivado.");
        }
    }

    public void chocar(Obstaculo obs){
        energia = energia - obs.getDificultad();

        System.out.println(
            "Has chocado contra un/a " + obs.getTipo() +
            " y has perdido " + obs.getDificultad() + " de energía."
        );

        if (power_up) {
            power_up = false;
            System.out.println("Power up desactivado");
        }
    }
}