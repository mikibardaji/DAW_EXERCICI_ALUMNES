package Objecte;

public class botella {

    // declaracion de atributos
    // variables tipus primitiu o variables altres objectes

    private int ml_liquido;
    private int ml_capacidad;
    private boolean tapon;
    private String material;
    // int cm_alto;
    // String marca;


    public botella(){
        ml_capacidad = 25;
        tapon = true;
        ml_liquido = 0;
        material = "Cristal";
    }



    // ** metodes GETTERS develven el valor de un solo atributo ***
    public int getMlLiquido() {
        return ml_liquido;
    }

    public int getCapacidad() {
        return ml_capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public boolean estaAbierta() {
        return tapon;
    }

    // ** metodes SETTERS cambian el valor de un atributo y pueden tener valicacion
    // para cambiarlo **
    public void setMaterial(String nuevo_material) {
        material = nuevo_material;
    }

    public void setLiquido(int nuevo_ml) {
        if (nuevo_ml <= ml_capacidad && nuevo_ml>ml_liquido) {
            ml_liquido = nuevo_ml;
        } else {
            System.out.println("No tiene suficiente capacidad la botella");
        }
    }

    

    /**
     * FUNCIONES
     * poner el liquido de la botella al maxindo de su capacidad
     * 
     * @return ml necesarios para que este llena
     */
    public int llenar() {
        int llenado = ml_capacidad - ml_liquido;
        ml_liquido = ml_capacidad;
        return llenado;
    }

    public int verter() {
        ml_liquido = ml_liquido - 5;
        return 5;
    }

    public void abrirBotella() {
        tapon = false;
    }

    public void cerrarBotella() {
        tapon = true;
    }

}
