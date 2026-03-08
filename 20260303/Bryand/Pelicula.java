public class Pelicula {

    private int id;
    private String titulo;
    private String genero;
    private boolean segundaParte;

    public Pelicula(int id, String titulo, String genero, boolean segundaParte) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.segundaParte = segundaParte;
    }

    public int getCodiPel() {
        return id;
    }

    public void setCodiPel(int id) {
        this.id = id;
    }

    public String getTitol() {
        return titulo;
    }

    public void setTitol(String titulo) {
        this.titulo = titulo;
    }

    public String getGenere() {
        return genero;
    }

    public void setGenere(String genero) throws InvalidGeneroException {

        if (genero.equalsIgnoreCase("WESTERN")
                || genero.equalsIgnoreCase("CIENCIA FICCIO")
                || genero.equalsIgnoreCase("TERROR")) {

            this.genero = genero;

        } else {

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

        return titulo + " | genero: " + genero + " | segunda parte: " + segundaParte;
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

        Pelicula otra = (Pelicula) obj;

        return this.id == otra.id;
    }
}