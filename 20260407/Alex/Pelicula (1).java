/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class Pelicula implements Comparable<Pelicula>{
    private int codiPel;
    private String Titol;
    private String genere;
    private int duracion;
    private boolean segundaParte;

    public Pelicula(int codiPel, String Titol, String genere, int duracion, boolean segundaParte) {
        this.codiPel = codiPel;
        this.Titol = Titol;
        this.genere = genere; //
        this.duracion = duracion;
        this.segundaParte = segundaParte;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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

    public void setGenere(String genere) throws InvalidGeneroException {
        //genere = genere.toUpperCase();
        if ("WESTERN".equalsIgnoreCase(genere) 
                || "CIENCIA FICCIO".equalsIgnoreCase(genere)
                || "TERROR".equalsIgnoreCase(genere) )
        {
            this.genere = genere;
        }
        else
        {
            throw new InvalidGeneroException();
            
        }
    }

    public boolean getSegundaParte() {
        return segundaParte;
    }

    public void setSegundaParte(boolean segundaParte) {
        this.segundaParte = segundaParte;
    }

    @Override
    public String toString() {
        return    codiPel + "-" +  Titol + "  genere " + genere + ", segundaParte=" + segundaParte;

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

    @Override
    public int compareTo(Pelicula segunda) {
        //return this.Titol.compareTo(segunda.Titol); //positivo primero y negativo el segundo es mas grande
        return this.codiPel - segunda.codiPel; //devuelve la operacion
    }
    
    
    
    
}
