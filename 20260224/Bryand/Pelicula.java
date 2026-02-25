class Pelicula {
    private int id;
    private String nom;
    private String genere;
    private int any;

    public Pelicula(int id, String nom, String genere, int any) {
        this.id = id;
        this.nom = nom;
        this.any = any;
        // Validació del gènere segons el teu requeriment
        if (!genere.equals("Ciència-Ficció") 
            && !genere.equals("Bèl·lica") 
            && !genere.equals("Terror")) {
            this.genere = "Terror";
        } 
        
        else {
            this.genere = genere;
        }
    }


    public int getId() { 
        return id; 
    }

    public String getNom() { 
        return nom; 
    }

    public String getGenere() { 
        return genere; 
    }

    public int getAny() { 
        return any; 
    }

    @Override
    public String toString() {
        return "ID: " + id + 
               " | Nom: " + nom + 
               " | Gènere: " + genere + 
               " | Any: " + any;
    }
}
