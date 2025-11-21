package Objectes;

public class Botella {
    //declaracion de atribustos
    //variables tipos primitivos o variables otros objetos
      private  int ml_liquid, ml_capacidad;
      private  boolean tapon;
      private  String material;
    /*int cm_alto;
    String marca;
    double base;*/

    //Constructor vacio
    public Botella()
    {
        ml_capacidad = 25;
        tapon = true;
        ml_liquid = 0;
        material = "Cristal";
    }
    //Metodos
    //getter devuelven el valor de un solo atributo
    public int getMlLiquido()
    {
        return ml_liquid;
    }

    public int getCapacidad()
    {
        return ml_capacidad;
    }

    public String getMaterial()
    {
        return material;
    }
    public boolean estaAbierta()
    {
        return tapon;
    }
    /*public boolean isTapon()
    {
        return tapon;
    }*/
    //stter ambian el valor de un atributo 
    //pueden tener validaciones para cambiarlo
    public void setMaterial(String nuevo_material)
    {
        material = nuevo_material;
    }

    public void setLiquido(int nuevos_ml)
    {
        if (nuevos_ml<= ml_capacidad && nuevos_ml>ml_liquid) 
        {
          ml_liquid = nuevos_ml;  
        }
        else
        {
            System.out.println("No tiene suficiente capacidad la botella ");
        }
    }
    public void rellenar (int nuevo_ml)
    {
        if ((ml_liquid+nuevo_ml)>ml_capacidad) 
        {
        System.out.println("No puedo rellenarlo");    
        }
        else
        {
            ml_liquid+=nuevo_ml;
        }
    }
    //Metodo especificos del objeto
    //poner el liquido de la botella al maximo de su capacidad
    //ML neesarios para que etse llena
    public int llenar()
    {
        int llenado = ml_capacidad - ml_liquid;
        ml_liquid = ml_capacidad;
        return llenado;
    }

    public int verter()
    {
         ml_liquid = ml_liquid - 5;
         return 5;
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
