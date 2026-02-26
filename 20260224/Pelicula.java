/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author rasu2
 */
public class Pelicula {
    private int id;
    private String titol;
    private int any;
    private String genere;

    public Pelicula(int id, String titol, int any, String genere) {
        this.id = id;
        this.titol = titol;
        this.any = any;
        setGenere(genere);
    }

    public void setGenere(String genere) {
        if (genere.equalsIgnoreCase("Ciència-Ficció") || genere.equalsIgnoreCase("Bèl·lica") || genere.equalsIgnoreCase("Terror")) {
            this.genere = genere;
        } else {
            this.genere = "Terror";
        }
    }

    public int getId() {
        return id;
    }

    public String getTitol() {
        return titol;
    }

    public int getAny() {
        return any;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "ID: " + id + " titol: " + titol + " Any: " + any + " Genere: " + genere;
    }
    
    

}
