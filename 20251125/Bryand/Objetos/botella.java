package Objectos;
public class Botella {

    private int ml_liquido;
    private int ml_capacidad;
    private boolean tapon;
    private String material;
    /**
    int cm_alto;
    String marca;
    double base; */

    public Botella(){
        ml_capacidad = 0;
        tapon = true;
        ml_liquido = 0;
        material = "Cristal";
    }
    // getter
    public int getMlLiquido(){
        return ml_liquido;
    }

    public int getCapacidad(){
        return ml_capacidad;
    }

    public String getMaterial(){
        return material;
    }

    public boolean estaAbierta(){
        return tapon;
    }

    public boolean estaCerrada(){
        return tapon;
    }


    //poner el liquido de la botella al maximo de su capacidad
    public int llenar(){
       int llenado = ml_capacidad - ml_liquido;
       ml_liquido = ml_capacidad;
       return llenado;

    }

    public int verter(){
       // if (tapon == false)

        if (!estaCerrada()){
            if (ml_liquido == 0){
                System.out.println("No hay liquido");
                return 0;
            }
            
            else{

                if (ml_liquido >= 5){
                  ml_liquido = ml_liquido - 5;
                return 5;  
                }

                else{
                    int vertido = ml_liquido;
                    ml_liquido = 0;
                    return vertido;
                }
                
            }

        }

        else{
            System.out.println("No puedo verter");
        }
        return ml_capacidad;
        
    }

    public void abrirBotella(){
        tapon = false;
    }

    public void cerrarBotella(){
        tapon = true;
    }

     //setter cambian el valor de un atributo
    // pueden tener validaciones para cambiarlo
    public void setMaterial(String nuevo_material){
        material = nuevo_material;
    }

    public void setLiquido(int nuevo_ml){
        if (nuevo_ml <= ml_capacidad){
            ml_liquido = nuevo_ml;
        }

        else{
            System.out.println("no tiene suficiente capacidad la botella");
        }


    }

    public void rellenar(int nuevo_ml){
        if ((ml_liquido + nuevo_ml) > ml_capacidad && nuevo_ml < 0) {
            System.out.println("No puedo rellenarlo");
        
            
        }

        else{
            ml_liquido += nuevo_ml;
        }
    }
    }


