
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuConsola {

  private String titol ;
  private List<String> opcions ;
  private int opcionSortida;
  
   Scanner sc = new Scanner(System.in);

    public MenuConsola(String titol) {
        this.titol = titol;
        this.opcions = new ArrayList<>();
        this.opcionSortida = opcionSortida;
    }
    
        public void anyadirOpcio(String text) {
        if (!opcions.contains(text)) {
            opcions.add(text);
        } else {
            System.out.println(" Aquesta opcio ja existeix al menu.");
        }
    }

    public int getOpcionSortida() {
        return opcionSortida;
    }

    public void setOpcionSortida(int opcionSortida) {
        this.opcionSortida = opcionSortida;
    }
   
   public void mostrarMenu() {
        System.out.println("\n==== " + titol + " ====");

        for (int i = 0; i < opcions.size(); i++) {
            System.out.println(i + " - " + opcions.get(i));
        }
    }
  
   public int llegirOpcioValida() {
        int opcio;

        try {
            System.out.print("Escull una opció: ");
            opcio = sc.nextInt();
            sc.nextLine(); 

            if (opcio < 0 || opcio >= opcions.size()) {
                System.out.println("Opcio fora de rang. Sortint del menu.");
                return opcionSortida;
            }

        } catch (Exception e) {
            System.out.println("Entrada no valida. Sortint del menu");
            sc.nextLine(); 
            return opcionSortida;
        }

        return opcio;
    }
}

