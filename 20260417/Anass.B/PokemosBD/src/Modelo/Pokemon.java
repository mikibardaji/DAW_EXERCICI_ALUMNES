/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author aba7500
 */
public class Pokemon {
    private int id;
    private String nom;
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
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
      return "Ficha de Pokémon [" + "ID: " + id + " | Nombre: " + nom + " | Tipo: " + tipus +  " | Nivel: " + nivell + 
           " | Total Capturados: " + capturats + 
           "]";
    }
  
}
