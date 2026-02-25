package re;

public class Pelicula {
    private int ID;
    private String nom;
    private int ano;
    private String genero;

    public Pelicula(int iD, String nom, int ano, String genero) {
        this.ID = iD;
        this.nom = nom;
        this.ano = ano;
        setGenero(genero); 
    }

    public int getID() { return ID; }
    public String getNom() { return nom; }
    public int getAno() { return ano; }
    public String getGenero() { return genero; }

    public void setGenero(String genero) {
        // Validem segons l'enunciat: si no és un dels tres, posem Terror
        if (genero.equalsIgnoreCase("Ciència-Ficció") || 
            genero.equalsIgnoreCase("Bèl·lica") || 
            genero.equalsIgnoreCase("Terror")) {
            this.genero = genero;
        } else {
            this.genero = "Terror";
        }
    }

    @Override
    public String toString() {
        return "ID: " + ID + " | Títol: " + nom + " | Any: " + ano + " | Gènere: " + genero;
    }
}
