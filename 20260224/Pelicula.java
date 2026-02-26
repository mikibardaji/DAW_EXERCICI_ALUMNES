package objetos;

public class Pelicula {
    private int id;
    private String titol;
    private String director;
    private int any;
    private String genere;

    public Pelicula(int id, String titol, String director, int any, String genere) {
        this.id = id;
        this.titol = titol;
        this.director = director;
        this.any = any;
        setGenere(genere);
    }

    public void setGenere(String genere) {
        if (genere.equalsIgnoreCase("Ciència-Ficció") || 
            genere.equalsIgnoreCase("Bèl·lica") || 
            genere.equalsIgnoreCase("Terror")) {
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
    
    public String getDirector() {
        return director;
    }

    public int getAny() {
        return any;
    }

    public String getGenere() {
        return genere;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Títol: " + titol + " | Director: " + director + 
               " | Any: " + any + " | Gènere: " + genere;
    }
}
