/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Pelicula {
    private int codiPel;
    private String Titol;
    private String genere;
    private boolean segundaParte;

    public Pelicula(int codiPel, String Titol, String genere, boolean segundaParte) {
        this.codiPel = codiPel;
        this.Titol = Titol;
        this.setGenere(genere);
        this.segundaParte = segundaParte;
    }

    public int getCodiPel() {
        return codiPel;
    }

    public void setCodiPel(int codiPel) {
        this.codiPel = codiPel;
    }

    public String getTitol() {
        return Titol;
    }

    public void setTitol(String Titol) {
        this.Titol = Titol;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        //genere = genere.toUpperCase();
        if ("WESTERN".equalsIgnoreCase(genere) 
                || "CIENCIA FICCIO".equalsIgnoreCase(genere)
                || "TERROR".equalsIgnoreCase(genere) )
        {
            this.genere = genere;
        }
        else
        {
            System.out.println("Genero incorrecto, lo paso a terrro " + genere);
            this.genere = "TERROR";
        }
    }

    public boolean isSegundaParte() {
        return segundaParte;
    }

    public void setSegundaParte(boolean segundaParte) {
        this.segundaParte = segundaParte;
    }

    @Override
    public String toString() {
        return  Titol + "  genere " + genere + ", segundaParte=" + segundaParte;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pelicula)) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return this.codiPel == other.codiPel;
    }
    
    
    
    
}
