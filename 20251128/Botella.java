public class Botella {
    private int capacitat;
    private int contingut;
    private boolean tapada;

    public Botella(int capacitat, int contingut, boolean tapada) {
        this.capacitat = capacitat;
        this.contingut = contingut;
        this.tapada = tapada;
    }

    public int verter() { return verter(5); }

    public int verter(int quantitat) {
        if (tapada) return 0;
        if (contingut <= 0) return 0;

        int real = Math.min(quantitat, contingut);
        contingut -= real;
        return real;
    }

    public void tapar() { tapada = true; }
    public void destapar() { tapada = false; }

    public int getContingut() { return contingut; }

    // NUEVO: para devolver agua sobrante
    public void devolver(int cantidad) {
        contingut = Math.min(capacitat, contingut + cantidad);
    }
}
