/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package festivalburbujas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aba7500
 */
public class FestivalRepository {
private Map<String, Assistent> festi = new HashMap<>();

public boolean registrarAssistent(Assistent a){
    if (festi.containsKey(a.getCodiTicket())) {
        return false;
    } else festi.put(a.getCodiTicket(), a);
         return true;
}


public Assistent buscarPerTicket(String codi){
    if (festi.containsKey(codi)) {
        return festi.get(codi);
    } return null;

}

public Collection<Assistent> obtenirLlista(){
return festi.values();
}

public List<Assistent> obtenirLlistaMayores(){

  List<Assistent> lii = new ArrayList<>();
  
  for (Map.Entry<String, Assistent> entrada : festi.entrySet()) {
    Assistent valor = entrada.getValue();
    if (valor.getEdat()>=18) {
        lii.add(valor);
    }     
} 
return lii;

}

public boolean cancelarEntrada(String codi){
    festi.remove(codi);

    if (festi.remove(codi) != null) {
        return true; 
    } else {
        return false;
    }
    
}

public double calcularEdatMitjana(){
    double suma = 0;

    for (Assistent a : festi.values()) { //el values devuelve una colection <Assitent>
        suma += a.getEdat();
    }

    return (double) suma / festi.size(); 

}

public double calcularEdatMitjanaDos(){
    double suma = 0;
//colection <Assitent>
    for (Map.Entry<String, Assistent> entrada : festi.entrySet()) { 
        Assistent a = entrada.getValue();
        
        suma += a.getEdat();
    }

    return (double) suma / festi.size(); 

}


}
