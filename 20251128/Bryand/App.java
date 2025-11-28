import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Persona pers1 = new Persona();
        Persona pers2 = new Persona();  

        System.out.println("DNI de primera persona");
        pers1.setDni(sc.nextLine());
        System.out.println("Nombre de primera persona");
        pers1.setNombre(sc.nextLine());
        System.out.println("Apellido de primera persona");
        pers1.setApellidos(sc.nextLine());
        System.out.println("Edad priemra persona");
        pers1.setEdad(sc.nextInt());
       
       


        System.out.println("DNI de segunda persona");
        pers2.setDni(sc.nextLine());
        System.out.println("Nombre de segunda persona");
        pers2.setNombre(sc.nextLine());
        System.out.println("Apellido de segunda persona");
        pers2.setApellidos(sc.nextLine());
        System.out.println("Edad segunda persona");
        pers2.setEdad(sc.nextInt());

       
        pers1.imprime();
        pers2.imprime();

    }



}