package objetos;
import java.util.Random;

public abstract class Pokemon implements AccionesCombate {
    protected final String nomPokemon;
    protected int lifePoint;
    protected boolean viu;
    protected static final Random rand = new Random();
    
    // Constructor principal (usado por tus clases)
    public Pokemon(int lifePoint, boolean viu, String nomPokemon) {
        this.nomPokemon = nomPokemon;
        this.lifePoint = lifePoint;
        this.viu = viu;
    }
    
    // Constructor por defecto (Pikachu)
    public Pokemon() {
        this(0, true, "Pikachu");
    }
    
    // Getters
    public String getNomPokemon() { return nomPokemon; }
    public int getLifePoint() { return lifePoint; }
    public boolean isViu() { return viu; }
    
    // Método atacar() para compatibilidad con tus clases
    public int atacar() {
        int fuerza = rand.nextInt(11);
        System.out.println(nomPokemon + " ataca con " + fuerza);
        return fuerza;
    }
    
    // Método atac() para la interfaz
    @Override
    public int atac() {
        return atacar(); // Llama al mismo método
    }
    
    // Método recibirImpacto de la interfaz
    @Override
    public void recibirImpacto(Pokemon atacante) {
        // Las clases hijas sobrescribirán esto
        int dany = atacante.atacar();
        aplicarDany(dany, atacante);
        mostrarDespuesImpacto();
    }
    
    // Método para aplicar daño (usado por aplicarDany en clases hijas)
    protected void aplicarDany(int dany, Pokemon atacante) {
        // Reducción del 25% según tipos
        if ((atacante instanceof PokemonAigua && this instanceof PokemonElectric) ||
            (atacante instanceof PokemonElectric && this instanceof PokemonVeri) ||
            (atacante instanceof PokemonVeri && this instanceof PokemonAigua)) {
            dany = (int)(dany * 0.75);
            System.out.println("¡Daño reducido! Solo " + dany + " puntos");
        }
        
        lifePoint -= dany;
        
        if (lifePoint <= 0) {
            lifePoint = 0;
            viu = false;
            System.out.println(nomPokemon + " está fuera de combate");
        }
    }
    
    // Método para mostrar estado
    private void mostrarEstadoPokemon() {
        String estat = (viu && lifePoint > 0) ? "viu" : "mort";
        System.out.print(nomPokemon + " " + lifePoint + " LP " + estat + " ");
        for (int i = 0; i < lifePoint; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    // Método final para mostrar después del impacto
    protected final void mostrarDespuesImpacto() {
        mostrarEstadoPokemon();
    }
    
    // Método para mostrar datos generales
    public String mostrarDadesGenerals() {
        return nomPokemon + " " + lifePoint + " LP";
    }
    
    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Pokemon)) return false;
        
        Pokemon other = (Pokemon) obj;
        return this.nomPokemon.equals(other.nomPokemon);
    }
}