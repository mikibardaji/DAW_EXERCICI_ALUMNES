/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Botella {
    //TRABAJO PARA CASA
    //implementar la funcion verter, que por defecto tiene que tirar 5 ml
    //pero hay cosas que pueden afectar a esta funci�n
    //esta tapada, tiene liquido, tiene suficiente, etc etc etc...
    
    //declaracio atributs
    //variables tipus primitiu o variables altres objectes
    private int ml_liquido;    
    private int ml_capacidad;
    private boolean tapon;
    private String material;
//    int cm_alto;
//    String marca;
//    double base;
    
    
    //Constructor vacio 
    public Botella()
    {
        ml_capacidad = 25;
        tapon = true;
        ml_liquido = 0;
        material = "Cristal";
    }
    
    
    //metodes
    //getter devuelven el valor de un solo atributo
    public int getMlLiquido()
    {
        return ml_liquido;
    }
    
    public int getCapacidad()
    {
        return ml_capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public boolean estaCerrada()
    {
        return tapon;
    }
    
    //Setter cambian el valor de un atributo
    //pueden tener validaciones para cambiarlo
    public void setMaterial(String nuevo_material)
    {
        material = nuevo_material;
    }
    
    public void setLiquido(int nuevo_ml)
    {
        if (nuevo_ml<= ml_capacidad 
                && nuevo_ml> ml_liquido)
        {
            ml_liquido = nuevo_ml;
        }
        else
        {
            System.out.println("No tiene suficiente capacidad la botella");
        }
        
    }
    
    public void rellenar(int nuevo_ml)
    {
        if ((ml_liquido+nuevo_ml)>ml_capacidad)
        {
            System.out.println("No puedo rellenarlo");
        }
        else
        {
            ml_liquido += nuevo_ml;
        }
    }
//    public boolean isTapon() {
//        return tapon;
//    }

    
    
    //metodes especificos del objetos
    
    /**
     * poner el liquido de la botella al maximo de su capacidad
     * @return ml necesarios para que este llena
     */
    public int llenar()
    {
        int llenado = ml_capacidad - ml_liquido;
        ml_liquido = ml_capacidad; 
        return llenado;
    }
    
  public int verter() {
    
    if (tapon) {
        System.out.println("No puedo verter, la botella está cerrada.");
        return 0;
    }

 
    if (ml_liquido == 0) {
        System.out.println("No puedo verter, la botella está vacia.");
        return 0;
    }

    int cantidadAVerter = 5;

    if (ml_liquido < 5) {
        cantidadAVerter = ml_liquido; 
    }

    
    ml_liquido -= cantidadAVerter;

    return cantidadAVerter;
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
