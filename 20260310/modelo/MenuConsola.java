package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConsola {

    private String titol;
    private List<String> opcions;
    private int opcioSalida;

    public MenuConsola(String titol) {
        this.titol = titol;
        this.opcions = new ArrayList<>();
        this.opcioSalida = 0;
    }

    public void anyadirOpcio(String text) {
        if (!opcions.contains(text)) {
            opcions.add(text);
        } else {
            System.out.println(" L'opció ja existeix i no s'ha afegit.");
        }
    }

    public void setOpcioSalida(int opcioSalida) {
        this.opcioSalida = opcioSalida;
    }

    public int getOpcioSalida() {
        return this.opcioSalida;
    }

    public void mostrarMenu() {
        System.out.println("\n===== " + titol + " =====");
        for (int i = 0; i < opcions.size(); i++) {
            System.out.println(i + ". " + opcions.get(i));
        }
    }

    public int llegirOpcioValida() {
        Scanner sc = new Scanner(System.in);
        int opcio;

        System.out.print("Introdueix una opció: ");

        try {
            opcio = sc.nextInt();
            sc.nextLine();

            if (opcio < 0 || opcio >= opcions.size()) {
                System.out.println(" Opció fora de rang. S'assigna l'opció de sortida.");
                opcio = opcioSalida;
            }

        } catch (Exception e) {
            System.out.println(" Error: Has introduït text en lloc d'un número.");
            sc.nextLine();
            opcio = opcioSalida;
        }

        return opcio;
    }
}