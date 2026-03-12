/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rasu2
 */
public class MenuConsola {
    private String titol;
    private List<String> opcions;
    private int opcioSortida;
    private Scanner lector;

    public MenuConsola(String titol) {
        this.titol = titol;
        this.opcions = new ArrayList<>();
        this.opcioSortida = 0; 
        this.lector = new Scanner(System.in);
    }

    public int getOpcioSortida() {
        return opcioSortida;
    }

    public void setOpcioSortida(int opcioSortida) {
        this.opcioSortida = opcioSortida;
    }

    public void anyadirOpcio(String text) {
        if (!opcions.contains(text)) {
            opcions.add(text);
        }
    }

    public void mostrarMenu() {
        System.out.println(titol);
        for (int i = 0; i < opcions.size(); i++) {
            System.out.println(i + ". " + opcions.get(i));
        }
        System.out.print("Selecciona una opció: ");
    }

    public int llegirOpcioValida() {
        int seleccio;
        try {
            seleccio = Integer.parseInt(lector.nextLine());
            
            if (seleccio < 0 || seleccio >= opcions.size()) {
                System.out.println("Error: Opció fora de rang.");
                return opcioSortida;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Has d'introduir un número vàlid.");
            seleccio = opcioSortida;
        }
        return seleccio;
    }

    public int getOpcionSortida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setOpcionSortida(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

