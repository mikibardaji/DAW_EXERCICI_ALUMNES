
import Objetos.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");



   try {
            Gato gato1 = new Gato( 3, "AB"); // nombre invalido con menos de 3 caracteres)
            gato1.imprimir();
        } catch (Exception e) {
            System.out.println("Error al crear gato: " + e.getMessage());
        }




     try {
            Gato gato2 = new Gato( -1, "Michi"); // edad invalido
            gato2.imprimir();
        } catch (Exception e) {
            System.out.println("Error al crear gato2: " + e.getMessage());
        }    

    

        //Ejemplo con setters 
     try {
            Gato gato3 = new Gato( 1,"Garfield");
            gato3.imprimir();

          
            gato3.setEdad(-4);
            gato3.imprimir();
        } catch (Exception e) {
            System.out.println("Error en gato3: " + e.getMessage());
        }


    }


}
