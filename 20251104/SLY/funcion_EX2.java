
import java.util.Scanner;

public class funcion_EX2 {
    public static void main(String[] args) throws Exception {

        int usuario = preguntarEdadValida();
        boolean mayorDeEdad = esMayorDeEdadç(usuario);
        mostrarResultado(mayorDeEdad);

    }

    private static void mostrarResultado(boolean mayorDeEdad) {
        if (mayorDeEdad){
            System.out.println("you are an adult");

        }else{
            System.out.println("you are a minor");
        }
    }

    public static boolean esMayorDeEdadç(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * 
     * @return edad positiva;
     */
    public static int preguntarEdadValida() {
        int user_age;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("how old are you? ");
            user_age = sc.nextInt();
        } while (user_age <= 0);
        return user_age;
    }

}
