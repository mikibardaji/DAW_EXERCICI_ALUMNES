package Objetos;

public final class PokemonElectric extends Pokemon {
    private int superAtac = 2;

    public PokemonElectric(int lifePoint, boolean viu, String nomPoke) {
        super(lifePoint, viu, nomPoke);
    }
    
    public PokemonElectric() {
        super();
        lifePoint = 40; // LP inicial para Eléctrico
    }
    
    public int getSuperAtac() {
        return superAtac;
    }
    
    // Método para mostrar características
    public String mostrarCaracteristiques() {
        return "Tipo: Eléctrico, SuperAtac: " + superAtac + ", LP: " + lifePoint;
    }
    
    @Override
    public int atacar() {
        int fuerzaBase = rand.nextInt(11);
        int fuerzaTotal = fuerzaBase + superAtac;
        
        System.out.println(nomPokemon + " ataca con " + fuerzaTotal + 
                          " (base: " + fuerzaBase + " + super: " + superAtac + ")");
        
        superAtac++; // Aumenta para próximo ataque
        return fuerzaTotal;
    }
    
    @Override
    public void recibirImpacto(Pokemon atacante) {
        int dany = atacante.atacar();
        aplicarDany(dany, atacante);
        mostrarDespuesImpacto();
    }
}