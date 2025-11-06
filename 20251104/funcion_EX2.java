
import java.util.Scanner;

public class funcion_EX2 {
    public static void main(String[] args) throws Exception {

    int usuario = preguntarEdad();
    boolean mayorDeEdad = esMayorDeEdadç(usuario);

    }

    public static boolean esMayorDeEdadç(int age){
        if (age >= 18){
            System.out.println("You are an adult");
            return true;
        } else {
            System.out.println("You are a minor");
            return false;
        }


    }
    public static int preguntarEdad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how old are you?");
        int user_age = sc.nextInt();
        sc.close();
        return user_age;
    }

}
