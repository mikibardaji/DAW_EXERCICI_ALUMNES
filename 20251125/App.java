import Objetos.Botella;

public class App {
    public static void main(String[] args) throws Exception {
             Botella bottle;
        bottle = new Botella();
    System.out.println("Abro la botella");
bottle.abrirBotella();
bottle.rellenar(10);   

System.out.println("Vierto: " + bottle.verter() + " ml");
System.out.println("ml liquido después: " + bottle.getMlLiquido());

    }
}
