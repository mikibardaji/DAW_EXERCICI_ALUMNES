package utilitats;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int anyo;
    private double precio;
    private String color;

    public Coche(String matricula, String marca, String modelo, int anyo, double precio, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.precio = precio;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return marca + " " + modelo + " | Matricula: " + matricula + " | Año: " + anyo + " | Precio: " + precio + "€ | Color: " + color;
    }

    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Coche otro = (Coche) obj;

        if (matricula == null) {
            if (otro.matricula != null) return false;
        } else if (!matricula.equals(otro.matricula)) return false;

        return true;
    }

    public int hashCode() {
        int resultado = 7;
        resultado = 31 * resultado + (matricula == null ? 0 : matricula.hashCode());
        return resultado;
    }
}