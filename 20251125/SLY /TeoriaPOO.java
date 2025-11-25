import java.util.Scanner;

import Objecte.botella;

public class TeoriaPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    
        botella bottle;
        bottle = new botella();

        botella bottleDos;
        bottleDos = new botella();


        
        System.out.println("capacidad botella " + bottle.getCapacidad());
        System.out.println("Liquido " + bottle.getMlLiquido());
        System.out.println("Material " + bottle.getMaterial());
        System.out.println("Tapado " );

        System.out.println("La botella 2 tiene de capacidad " + bottleDos.getCapacidad() );
        
    }

}
