package objetos;

public class Botella {
    //declarocion de atributos
    //variables tipus primitius o variables altres objectes
    private int capacidad;
    private int liquidoDentro;
    private String material;
    private boolean tapon;
    int alto;
    String marca;
    double base;
    
    public Botella(){
        capacidad=25;
        tapon=true;
        liquidoDentro=0;
        material="cristal";
    }
    
    public void rellenar (int nuevoliquido){
        if ((nuevoliquido+ liquidoDentro) > capacidad) {
            liquidoDentro = liquidoDentro + nuevoliquido;
        
        }
    
    
    
    
    
    
    
    
    public int  llenar(){
        int llenadpos=capacidad - liquidoDentro;
        liquidoDentro=capacidad;
        return llenadpos;

    }
    public int verter(){
        liquidoDentro= liquidoDentro - 5;
        return 5;
    }
    public void cerrarBotella(){
        tapon=true;
    }  
    public void abrirBotella(){
        tapon=false;
    }
    public int getliquidoDentro(){
        return capacidad;
    }
    public int  getCapacidad(){
        return capacidad;
    }
    public boolean getTapon(){
        return tapon;
    }
    public String getMaterial(String nuevoMaterial){
        material=nuevoMaterial;
        return material;
    }
    public void setCapacidad(int nuevaCapacidad){
        capacidad=nuevaCapacidad;
    }
    public void setMaterial(String nuevoMaterial){
        material=nuevoMaterial;
    }
    public void setTapon(boolean nuevoTapon){
        tapon=nuevoTapon;
    }
    public void setLiquidoDentro(int nuevoLiquido){
        if (nuevoLiquido <= capacidad) {
            liquidoDentro = nuevoLiquido;
        
            
        }else{
            System.out.println("Error: La cantidad de líquido excede la capacidad de la botella.");
        }
        liquidoDentro=nuevoLiquido;
    }
    


}
