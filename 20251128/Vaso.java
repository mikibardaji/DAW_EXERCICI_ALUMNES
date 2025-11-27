


public class Vaso {
    private int capacitat = 8;
    private String material = "plastico";
    private int contenido = 0;

    public Vaso() {}

    public Vaso(int capacitat, String material) {
        this.capacitat = capacitat;
        this.material = material;
    }

    // Devuelve el sobrante
    public int rellenar(int cantidad) {
        int espacio = capacitat - contenido;
        int usado = Math.min(espacio, cantidad);
        contenido += usado;
        return cantidad - usado; // sobrante
    }

    public int verterDeDos() {
        int real = Math.min(2, contenido);
        contenido -= real;
        return real;
    }

    public int beberDeGolpe() {
        int bebido = contenido;
        contenido = 0;
        return bebido;
    }

    public int getCapacitat() { return capacitat; }
    public String getMaterial() { return material; }
    public int getContenido() { return contenido; }
}
