import java.util.Scanner;

public class Ejercicio_deberes_lliure_switch_Marcos_Gundin {
    public static void main(String[] args) throws Exception {

        // Pedir el dia de la semana al usuario

        // Segun el dia de la semana tiene que hacer una cosa diferente
        // Lunes, ir al gimnasio
        // Martes, estudiar programacion
        // Miercoles, Hacer los deberes
        // Jueves, salir a caminar
        // Viernes, Ver una pelicula
        // Sabado, Quedar con los amigos
        // Domingo, Denscansar

        // Mostrar resultado al usuario

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana (1 = Lunes, 7 = Domingo): ");

        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes: Ir al gimnasio ");
                break;
            case 2:
                System.out.println("Martes: Estudiar programacion ");
                break;
            case 3:
                System.out.println("Miércoles: Hacer los deberes ");
                break;
            case 4:
                System.out.println("Jueves: Salir a caminar ");
                break;
            case 5:
                System.out.println("Viernes: Ver una película ");
                break;
            case 6:
                System.out.println("Sábado: Quedar con amigos ");
                break;
            case 7:
                System.out.println("Domingo: Descansar ");
                break;
            default:
                System.out.println("Número de día no válido. Debe ser entre 1 y 7.");
        }

    }
}
