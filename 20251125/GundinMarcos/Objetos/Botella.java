package objetos;

public class botella {

    private int ml_liquido;
    private int ml_capacidad;
    private boolean tapon;
    private String material;
    // int cm_alto;
    // String marca;
    // double base;

    // Constructor vacio
    public botella() {
        ml_capacidad = 25;
        tapon = true;
        ml_liquido = 0;
        material = "Cristal";
    }

    public int getMlLiquido() {
        return ml_liquido;
    }

    public int getCapacidad() {
        return ml_capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public boolean estaCerrada() {
        return tapon;
    }

    public void setMaterial(String nuevo_material) {
        material = nuevo_material;
    }

    public void setLiquido(int nuevo_ml) {
        if (nuevo_ml <= ml_capacidad
                && nuevo_ml > ml_liquido) {
            ml_liquido = nuevo_ml;
        } else {
            System.out.println("No tiene suficiente capacidad la botella");
        }

    }

    public void rellenar(int nuevo_ml) {
        if ((ml_liquido + nuevo_ml) > ml_capacidad) {
            System.out.println("No puedo rellenarlo");
        } else {
            ml_liquido += nuevo_ml;
        }
    }

    public int llenar() {
        int llenado = ml_capacidad - ml_liquido;
        ml_liquido = ml_capacidad;
        return llenado;
    }

    public int verter() {
        if (tapon == true) {
            System.out.println("La botella está cerrada. No puedo verter.");
            return 0;
        }

        if (ml_liquido == 0) {
            System.out.println("La botella está vacía.");
            return 0;
        }

        int cantidadAVerter = 5;

        if (ml_liquido < cantidadAVerter) {
            cantidadAVerter = ml_liquido;
        }

        ml_liquido -= cantidadAVerter;

        return cantidadAVerter;
    }

    public void abrirBotella() {
        tapon = false;
    }

    public void cerrarBotella() {
        tapon = true;
    }

}
