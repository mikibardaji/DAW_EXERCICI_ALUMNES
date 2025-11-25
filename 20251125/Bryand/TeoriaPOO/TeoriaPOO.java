package TeoriaPOO;

import Objectos.Botella;

public class TeoriaPOO {
        public static void main (String[] args){
            Botella bottle;
            bottle = new Botella();
            System.out.println("Capacidad botella " + bottle.getCapacidad());
            System.out.println("ml liquido: " + bottle.getMlLiquido());
            System.out.println("Tapon " + bottle.estaAbierta());
            System.out.println("Intento poner 70");
            bottle.setLiquido(70);
            System.out.println("ml liquido: " + bottle.getMlLiquido());

            System.out.println("Intento poner 10");
            bottle.setLiquido(10);
            System.out.println("ml liquido: " + bottle.getMlLiquido());

        }
    }

