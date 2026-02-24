import java.util.Objects;

public class Jugadors {

    private int dorsal;
    private String nom;

    //constructor
    public Jugadors(int dorsal, String nom) {
        this.dorsal = dorsal;
        this.nom = nom;
    }

    //getters
    public int getDorsal() {
        return dorsal;
    }

    public String getNom() {
        return nom;
    }

    //setters
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //toString
    @Override
    public String toString() {
        return dorsal + " - " + nom;
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugadors jugadors = (Jugadors) o;
        return dorsal == jugadors.dorsal && Objects.equals(nom, jugadors.nom);
    }
}