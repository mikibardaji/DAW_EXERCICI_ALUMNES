package Objetos;

import java.util.Objects;

public class ypeli {

    private int id;
    private String nom;
    private String genero;
    private int any;

    public ypeli(int id, String nom, String genero, int any) {
        this.id = id;
        this.nom = nom;
        this.any = any;

        if (genero.equals("Ciència-Ficció") || 
            genero.equals("Bèl·lica") || 
            genero.equals("Terror")) {
            this.genero = genero;
        } else {
            this.genero = "Terror";
        }
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getGenero() {
        return genero;
    }

    public int getAny() {
        return any;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setGenero(String genero) {
        if (genero.equals("Ciència-Ficció") || 
            genero.equals("Bèl·lica") || 
            genero.equals("Terror")) {
            this.genero = genero;
        } else {
            this.genero = "Terror";
        }
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "id=" + id + 
               ", nom=" + nom + 
               ", genero=" + genero + 
               ", any=" + any;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ypeli)) return false;
        ypeli other = (ypeli) obj;
        return id == other.id &&
               any == other.any &&
               Objects.equals(nom, other.nom) &&
               Objects.equals(genero, other.genero);
    }
}