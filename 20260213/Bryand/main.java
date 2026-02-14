import Objetos.Gato;

public class Main {
    public static void main(String[] args)  {


      try {
            Gato g1 = new Gato(3, "Wilson");
            System.out.println(g1.imprimir());
        } catch (Exception e) {
            System.out.println("Error al crar al gato1: " + e.getMessage());
        }

        try {
            Gato g2 = new Gato(-2, "Milson");
            System.out.println(g2.imprimir());
        } catch (Exception e) {
            System.out.println("Error al crear al gato 2: " + e.getMessage());
        }

    }
}
