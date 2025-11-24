package Objetos;

public class vaso {

    private int ml_liquido;
    private int ml_capacidad;
    private String material;

    public vaso(int capacidad, String material) {
        this.ml_capacidad = capacidad;
        this.material = material;
        this.ml_liquido = 0;
    }

    public vaso() {
        this(20, "cristal");
    }

    public int getContenido() {
        return ml_liquido;
    }

    public void llenar(int cantidad) {

        if (ml_liquido + cantidad > ml_capacidad) {
            ml_liquido = ml_capacidad;
        } else {
            ml_liquido += cantidad;
        }
    }
}
