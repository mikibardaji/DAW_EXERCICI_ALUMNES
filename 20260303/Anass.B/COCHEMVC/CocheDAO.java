package COCHEMVC;

import java.util.*;
public class CocheDAO {
   
   
   
List <Coche> listaCoches;

    public CocheDAO() {
        this.listaCoches = new ArrayList<>();
        this.anyadirCochesIniciales();
       
    }
private void anyadirCochesIniciales(){
listaCoches.add(new Coche("9585KLM", "Ford", "Kuga", 2005, 15256, "Blanco"));
listaCoches.add(new Coche("0012MNN", "Mercedes", "Clase A", 2002, 35200, "Negro"));
listaCoches.add(new Coche("1152KLL", "Mercedes", "Clase B", 2022, 12400, "Gris Plata"));
listaCoches.add(new Coche("9841CFT", "Opel", "Zafira", 2003, 150500, "Azul"));
listaCoches.add(new Coche("3005NJD", "Cupra", "Terramar", 2026, 50, "Rojo Mate"));
listaCoches.add(new Coche("1532HRX", "Citroen", "C4 Picasso", 2002, 185000, "Dorado"));
listaCoches.add(new Coche("6589DFG", "Citroen", "C3", 2013, 95400, "Verde"));
listaCoches.add(new Coche("0000DSF", "Citroen", "C4 Spacetourer", 2018, 62000, "Granate"));

}

    public boolean anyadirCoche(Coche coche1) throws marcaNotValidException {
        //1 paso opcional VALIDACIONES DATOS
      if(coche1.getMarca().equalsIgnoreCase("Renault") || coche1.getMarca().equalsIgnoreCase("BMW"))
      {
      throw new marcaNotValidException(coche1.getMarca());
      }
      //2 paso llamada al metode clave Estrcuturas DAtos (arrayLis)
      return listaCoches.add(coche1);

    }
    public boolean cocheVendido(String matricula) {
        Coche delete = new Coche(matricula, null, null, 0, 0, null); //campo equals informado
        
        return listaCoches.remove(delete);
    }

public boolean dejarTrabajarMarca(String marca) {
    Coche borrar = new Coche(null, marca, null, 0, 0, null);
    return listaCoches.remove(borrar);
}

public List<Coche> getLisTodosLosCoches(){

    return listaCoches;

}

public List<Coche> getCochesDiezMilE(double valor){
List<Coche> precio = new ArrayList<>();
    for (Coche co : listaCoches) {
        if (co.getPrecio()<valor) {
            precio.add(co);
        }
    }
    return precio;

}

    public List<Coche> getDevueltaCochesMarca(String marca) {
        List<Coche> seleccionados = new ArrayList<>();
       
        for (Coche sel : listaCoches) {
            if (sel.getMarca().equalsIgnoreCase(marca)){
            seleccionados.add(sel);
            }  
           
        }
        return seleccionados;
    }

public List<Coche> getCohesRangoPrecio(double minimo, double maximo){
List<Coche> rango = new ArrayList<>();

    for (Coche coche : listaCoches) {
        if (coche.getPrecio() < maximo && coche.getPrecio() > minimo) {
            rango.add(coche);
        }
    }
    return rango;
}
   
   public List<Coche> getListCochesEtiquetaMedioambiental(int anyo){
   List<Coche> tienen = new ArrayList<>();
   
       for (Coche tien : listaCoches) {
           if(tien.getAnyo()>=anyo)
           {
           tienen.add(tien);
           }
       }
   return tienen;
   }
   

}
