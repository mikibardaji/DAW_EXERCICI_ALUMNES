import java.util.Scanner;

public class Ex_inventat {
    public static void main(String[] args) {
        /**
         * Un usuari vol saber quantes calories ha consumit en un dia. 
         * Escriu un programa que demani a l’usuari introduir les calories de 
         * cada àpat. Quan l’usuari escrigui 0, el programa ha de 
         * mostrar el total de calories consumides aquell dia.
         */
        Scanner sc = new Scanner(System.in);
        int calories;
        int total = 0;

        while (true) {
            System.out.print("Introdueix calories (0 per acabar): ");
            calories = sc.nextInt();

            if (calories == 0) {
                break;
            }

            total += calories;
        }

        System.out.println("\nTotal calories del dia: " + total);
        sc.close();
    }
}

