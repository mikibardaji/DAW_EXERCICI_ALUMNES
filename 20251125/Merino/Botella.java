package Objetos;

public class Botella {

    //declaración de atributos
    //variables tipo primitivo o variables otros objetos

    //los atributos pueden ser: //private /public
    //si no se especifica lo contrario, siempre son private

    private int ml_liquido;
    private int ml_capacidad;
    private boolean tapon;
    private String material;
    //int cm_alto;
    //String marca;
    //double base;



    // Constructor vacío, se tiene que llamar igual que la clase
    public Botella()
    {
        ml_capacidad = 25;
        tapon = true;
        ml_liquido = 0;
        material = "Cristal";
    }

    //métodos

    /*
    getter = devuelven el valor de un solo atributos
    setter = modifican/ cambian el valor de los atributos
    pueden tener validaciones para cambiarlo
     */

    public int getMlLiquido()
    {
        return ml_liquido;
    }

    public int getCapacidad()
    {
        return ml_capacidad;
    }

    public boolean estaCerrada ()
    {
        return tapon;
    }
    
    //public boolean isTapon() //al ser boolean se pone isTapon
    //{
    //    return tapon;
    //}

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String nuevo_material)
    {
        material = nuevo_material;
    }

    public void setLiquido (int nuevo_ml)
    {
        if (nuevo_ml <= ml_capacidad && nuevo_ml > ml_liquido) {
            ml_liquido = nuevo_ml;
        }
        else{
            System.out.println("La botella no tiene suficiente capacidad.");
        }
    }

    public void rellenar (int nuevo_ml)
    {
        if (ml_liquido + nuevo_ml > ml_capacidad) {
            System.out.println("No puedo rellenarlo");
        }
        else
        {
            ml_liquido += nuevo_ml;
        }
    }

    //los métodos son las acciones, pueden ser: //private /public
    //si no se especifica lo contrario, siempre son public
    //dejan de ser static

   /**
    * poner el líquido de la botella al máximo de su capacidad 
    * @return ml necesarios para que esté llena
    * 
    */

   /**
    * Métodos específicos de los atributos
    * @return
    */

    public int llenar()
    {
        int llenado = ml_capacidad - ml_liquido;
        ml_liquido = ml_capacidad;
        return llenado;
    }

    public int verter()
    {
        int LiquidoVertido = 5;

        if (estaCerrada() == true) {
            return 0;
        }
        else if (estaCerrada() == false && ml_liquido <=5) {
            LiquidoVertido = ml_liquido;
            ml_liquido = 0;
            return LiquidoVertido;
        }
        else if (estaCerrada() == false && ml_liquido >= LiquidoVertido) {
            ml_liquido = ml_liquido - LiquidoVertido;
            return LiquidoVertido;
        }

        return 0;
    }

    public void abrirBotella()
    {
        tapon = false;
    }

    public void cerrarBotella()
    {
        tapon = true;
    }

}
