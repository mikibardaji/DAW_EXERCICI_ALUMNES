
// 1. Declarar variable opcion
// 2. Mostrar el menú de comidas:
//      1. Pizza
//      2. Hamburguesa
//      3. Ensalada
//      4. Sushi
// 3. Pedir al usuario que introduzca una opción (1-4)
// 4. Evaluar la opción introducida:
//      Si opción = 1 → mostrar "Has elegido pizza"
//      Si opción = 2 → mostrar "Has elegido hamburguesa"
//      Si opción = 3 → mostrar "Has elegido ensalada"
//      Si opción = 4 → mostrar "Has elegido sushi"
//      Si otra opción → mostrar "Opción no válida"



import java.util.Scanner;
public class Actividadlibre2marcelo {
   public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int opcion;
    System.out.println("Menú de comidas:");
    System.out.println("1. Pizza");
    System.out.println("2. Hamburguesa");
    System.out.println("3. Ensalada");
    System.out.println("4. Sushi");
    System.out.println("Introduce una opción (1-4):");
    opcion = sc.nextInt();
    switch (opcion) {
        case 1:
            System.out.println("Has elegido pizza. ¡Deliciosa elección!");
            break;
        case 2:
            System.out.println("Has elegido hamburguesa. ¡Clásico y sabroso!");
            break;
        case 3:
            System.out.println("Has elegido ensalada. ¡Muy saludable!");
            break;
        case 4:
            System.out.println("Has elegido sushi. ¡Exquisito!");
            break;
        default:
            System.out.println("Opción no válida. Debes elegir un número del 1 al 4.");
            break;
    }  

   }   
}
