package Objetos;


public class Pelicula{

    private int id;
    private String nom;
    private int any;
    private String genere;

    public Pelicula(int id, String nom, int any, String genere) {

        this.id = id;
        this.nom = nom;
        this.any = any;
        setGenere(genere);
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAny() {
        return any;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        if (genere.equals("Ciència-Ficció") ||
            genere.equals("Bèl·lica") ||
            genere.equals("Terror")) {
            this.genere = genere;
        } else {
            this.genere = "Terror"; 
        }
    }

    @Override
        public boolean equals(Object obj) {
            if (this == obj)
             return true;
            if (!(obj instanceof Pelicula))
             return false;
            Pelicula p = (Pelicula) obj;
            return this.id == p.id;
        }

   @Override
    public String toString() {
        return "ID: " + id + " | Nom: " + nom +   " | Any: " + any +  " | Gènere: " + genere;
    }
    }



    





    


