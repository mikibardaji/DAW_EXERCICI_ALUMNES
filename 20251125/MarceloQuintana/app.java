import Objetos.botella;
public class app {

    
public static void main(String[] args) {
    
      botella bottle = new botella();
        System.out.println("Capacidad botella: " + bottle.getCapacidad());
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("Tapon: " + bottle.estaCerrada());

        System.out.println(" Intentamos verter estando cerrada ");
        int vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());

        System.out.println(" Abrimos la botella ");
        bottle.abrirBotella();
        System.out.println("Tapon: " + bottle.estaCerrada());

        System.out.println(" Intentamos verter con botella vacía ");
        vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());

        System.out.println(" Rellenamos 3 ml y vertemos ");
        bottle.rellenar(3);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());
        vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());

        System.out.println(" Rellenamos 10 ml y vertemos ");
        bottle.rellenar(10);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());
        vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());
    }
}
