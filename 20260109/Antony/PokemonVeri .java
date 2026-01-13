package Objetos;

public final class PokemonVeri extends Pokemon {
    private boolean defensaActiva = false;

    public PokemonVeri(int lifePoint, boolean viu, String nomPoke) {
        super(lifePoint, viu, nomPoke);
    }
    
    public PokemonVeri() {
        super();
        lifePoint = 50; // LP inicial para Veneno
    }
    
    public boolean isDefensaActiva() {
        return defensaActiva;
    }
    
    // Método para mostrar características
    public String mostrarCaracteristiques() {
        return "Tipo: Veneno, Defensa activa: " + defensaActiva + ", LP: " + lifePoint;
    }
    
    @Override
    public void recibirImpacto(Pokemon atacante) {
        int dany = atacante.atacar();

        // Activar defensa si LP < 15
        if (lifePoint < 15) {
            defensaActiva = true;
        }

        if (defensaActiva) {
            System.out.println(nomPokemon + " activa defensa! Daño reducido a la mitad");
            dany = dany / 2;
        }

        aplicarDany(dany, atacante);
        mostrarDespuesImpacto();
    }
}
