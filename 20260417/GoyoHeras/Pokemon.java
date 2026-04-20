/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokedex;

/**
 *
 * @author ghe2503
 */
public class Pokemon {

    private int id;
    private final String nom;
    private String tipus;
    private int nivell;
    private int capturats;

    public Pokemon(int id, String nom, String tipus, int nivell, int capturats) {
        this.id = id;
        this.nom = nom;
        this.tipus = tipus;
        this.nivell = nivell;
        this.capturats = capturats;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getTipus() {
        return tipus;
    }

    public int getNivell() {
        return nivell;
    }

    public int getCapturats() {
        return capturats;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public void setCapturats(int capturats) {
        this.capturats = capturats;
    }

    @Override
    public String toString() {
        return "El Pokemon con ID " + id + " (" + nom + ") de nivel " + nivell + ", tipo " + tipus + " - Capturados: " + capturats;
    }
}
