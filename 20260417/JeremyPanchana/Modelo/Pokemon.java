/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jpa2698
 */
public class Pokemon {
    private int id;
    private  String nom;
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

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public int getCapturats() {
        return capturats;
    }

    public void setCapturats(int capturats) {
        this.capturats = capturats;
    }

    @Override
    public String toString() {
        return " El Pokemon  con id=" + id + ", nombre =" + nom + " de tipus=" + tipus + "  i  nivell=" + nivell + " i tens  capturats=" + capturats ;
    }
    
    
    
    
}
