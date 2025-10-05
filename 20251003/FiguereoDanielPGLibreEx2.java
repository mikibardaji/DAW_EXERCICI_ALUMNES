import java.util.Scanner;

public class FiguereoDanielPGLibreEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Escoger hacer activadad para el dia de hoy
        //Establecer variable actividad
        //Preguntar al ususario que actividad quiere hacer
        //establecer condiciones
        //si elige 1 Dormir
        //Si elige 2 Gimnasio
        //Si elige 3 Jugar a futbol
        int actividad;
        System.out.println("¿Que actividaad quieres hacer en el dia de hoy? 1- Dormir, 2- Gimansio, 3- Jugar a futbol");
        actividad = sc.nextInt();
        switch (actividad) {
            case 1:
            System.out.println("Has elegido la mejor opción ☺️, difruta de una buena siesta");
    
                break;
            case 2:
            System.out.println("Has elegido una buena opción para tu bienestar fisico🏋🏾");
                break;
            case 3:
            System.out.println("Has elegido una buena opción para disfrutar con tus amigos y mantener la salud!!⚽️");
                break;
            default:
                System.out.println("Esta opción no es valida❌");
                break;
        }
    }

}
