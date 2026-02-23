/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teorialist;

/**
 *
 * @author mabardaji
 */
public class Jugadors {
    private int dorsal;
    private String nom;

    public Jugadors(int dorsal, String nom) {
        this.dorsal = dorsal;
        this.nom = nom;
    }



    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return "Dorsal: " + this.getDorsal() + " nombre: " + this.getNom();
    } //Dorsal: 1 nombre: Ter Stegen
    /*
    jugadors.getDorsal()
            + " - " + jugadors.getNom()
    */


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Jugadors)) {
            return false;
        }
        final Jugadors other = (Jugadors) obj;
        return this.dorsal == other.dorsal;
    }
    
}
