import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int numerosEnteros [];
        numerosEnteros = new int[10];

    
        String opcion;
        
            
        do{
        System.out.println("Que opcion quieres hacer?");
        System.out.println("A->  Mostrar valores");
        System.out.println("B-> Introducir valor");
        System.out.println("C-> Salir ");
        opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("a")) {
             mostrarNumeros(numerosEnteros);
        } else if (opcion.equalsIgnoreCase("b")) {
            cambiarValor(numerosEnteros);
        } 
        }while (!opcion.equalsIgnoreCase("c"));
    }
    
    private static void mostrarNumeros(int [] numerosEnteros){
        for (int i = 0; i < numerosEnteros.length; i++){
            System.out.print(numerosEnteros[i] + "-");
         }
         System.out.println();
    }

     private static void cambiarValor (int [] numerosEnteros){
      Scanner sc = new Scanner(System.in);
        System.out.println("Que posicion de valor quieres cambiar?");
        int posicionCambio = sc.nextInt();

        System.out.println("Que valor le quieres cambiar a la posicion?");
        int valorCambio = sc.nextInt();

        numerosEnteros[posicionCambio-1] = valorCambio;     
        }

}
