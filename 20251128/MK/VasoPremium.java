

public class VasoPremium {
    private int capacitat = 6; // capacidad fija 6 ml
    private String material;
    private int contenido = 0;

    public VasoPremium(String material) {
        this.material = material;
    }

    public void rellenar(int cantidad) {
        contenido = Math.min(capacitat, contenido + cantidad);
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

    public int getCapacitat() {
        return capacitat;
    }

    public String getMaterial() {
        return material;
    }

    public int getContenido() {
        return contenido;
    }
}
