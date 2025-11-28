import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Persona pers1 = new Persona();
        Persona pers2 = new Persona();  

                System.out.println("DNI de la primera persona");
                pers1.setDni(sc.nextLine());
                System.out.println("Nombre de la primera persona");
        pers1.setNombre(sc.nextLine());
                System.out.println("Apellido de la primera persona");
        pers1.setApellidos(sc.nextLine());
                    System.out.println("Edad de la primera persona");
        pers1.setEdad(sc.nextInt());
        
            System.out.println("DNI de la segunda persona");
                pers2.setDni(sc.nextLine());
            System.out.println("Nombre de la segunda persona");
                        pers2.setNombre(sc.nextLine());
                System.out.println("Apellido de la segunda persona");
        pers2.setApellidos(sc.nextLine());
                System.out.println("Edad de la segunda persona");
        pers2.setEdad(sc.nextInt());
        
       
        pers1.imprime();
        pers2.imprime();

    }




}
