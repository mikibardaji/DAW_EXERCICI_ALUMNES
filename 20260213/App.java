public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            Gato cat = new Gato ("Ky", 2);
            cat.imprimir();
        } catch (Exception e){
            System.out.println("No se ha podido crear al gato: " + e.getMessage());
        }

        try {
            Gato cat2 = new Gato ("Kitty", -2);
            cat2.imprimir();
        } catch (Exception e){
            System.out.println("No se ha podido crear al gato: " + e.getMessage());
        }

    }
}
