package Objetos;

public class PokemonAigua extends Pokemon {
    private int corassa = 3;

    public PokemonAigua(int lifePoint, boolean viu, String nomPokemon) {
        super(lifePoint, viu, nomPokemon);
    }
    
    public PokemonAigua() {
        super();
        lifePoint = 35; // LP inicial para Agua
    }
    
    public int getCorassa() {
        return corassa;
    }
    
    // Método para mostrar características
    public String mostrarCaracteristiques() {
        return "Tipo: Agua, Corassa: " + corassa + ", LP: " + lifePoint;
    }
    
    @Override
    public void recibirImpacto(Pokemon atacante) {
        double damage = atacante.atacar();

        if (corassa > 0) {
            System.out.println(nomPokemon + " bloqueja el dany, Corassa restant: " + (corassa-1));
            corassa--;
            mostrarDespuesImpacto(); // Mostrar estado después de bloquear
            return;
        }

        aplicarDany(damage, atacante);
        mostrarDespuesImpacto();
    }
    if (Pokemon instanceof PokemonVeri)
        {
            valor = valor*0,75;
        }
        LP -= valor;
        if (LP<=0)
        {
            vida=false
        }
}
