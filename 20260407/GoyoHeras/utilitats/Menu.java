package utilitats;

import java.util.*;

public class Menu {
    private String titol;
    private List<String> opcions;
    private int opcioSalida;


    public Menu(String titol) {
        this.titol = titol;
        this.opcions = new ArrayList<>();
        opcioSalida = 0; // OpciÃ³ de sortida per defecte
    }    

    public Menu(String titol, boolean afegirOpcioSortida) {
        this.titol = titol;
        this.opcions = new ArrayList<>();
        if(afegirOpcioSortida) {
            opcions.add("Sortir");
            this.opcioSalida = 1;
        }    
    }

    public void afegirOpcio(String text) {
        if (!opcions.contains(text)) {
            opcions.add(text);
        }
    }

    public void setOpcioSalida(int opcioSalida) {
        this.opcioSalida = opcioSalida;
    }

    public int getOpcioSalida() {
        return opcioSalida;
    }

    public void mostrarMenu() {
        System.out.println("=== " + titol + " ==== ");
        for (int i = 0; i < opcions.size(); i++) {
            System.out.println((i + 1) + ". " + opcions.get(i));
        }
        System.out.println("====================");
    }

    public int llegirOpcioValida() {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Selecciona una opció: ");
                int opcio = scanner.nextInt();
                scanner.nextLine(); // Neteja el buffer
                if (opcio >= 1 && opcio <= opcions.size()) {
                    valid   = true;
                    return opcio;
                } else {
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
                    valid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Has d'introduir un número.");
                scanner.nextLine(); // Consumir la lÃ­nia errÃ²nia
                valid = false;
            }
            
        }
        return 0;
    }
}
