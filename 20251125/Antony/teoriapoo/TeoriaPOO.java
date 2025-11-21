package teoriapoo;

import Objectes.Botella;

public class TeoriaPOO {
    
    
    public static void main(String[] args) {
        Botella  bottle;
        bottle = new Botella();
        System.out.println("capacidad botella" + bottle.getCapacidad());
        System.out.println("ml liquido: " +  bottle.getMlLiquido());
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("Tapon: " + bottle.estaAbierta());
        
        System.out.println("Intento poner 70 ");
        bottle.setLiquido(70);
        System.out.println("ml liquido: " + bottle.getMlLiquido());

        System.out.println("intento poner 10 ");
        bottle.setLiquido(10);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("intento poner 5 ");
        bottle.setLiquido(5);
        System.out.println("ml liquido:  " + bottle.getMlLiquido());
        System.out.println("relleno con 5 ");
        bottle.rellenar(5);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        





    }
}
