package Objetos;

public final class  PokemonElectric extends Pokemon{
    
       private int superAtac = 2;

    public PokemonElectric(int lifePoint, boolean viu, String nomPoke) {
        super(lifePoint, viu, nomPoke);
    }
    
    
      public PokemonElectric() {
         super();
        
        lifePoint = 40;
    }
    

   public void recibirImpacto(Pokemon atacante) {
        int dany = atacante.atacar();
        aplicarDany(dany, atacante);
    }
    
}
