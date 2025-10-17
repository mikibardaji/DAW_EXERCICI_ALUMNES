import java.util.Random;
import java.util.Scanner;

public class IteratiusEx13 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int ordenador_piensa = rd.nextInt(1,101);
        int usuario;
        int contador = 1;

        do{
        System.out.println("Que numero crees que he elegido ");
        usuario = sc.nextInt();

        if (usuario == ordenador_piensa){
            System.out.println("Acertaste");
        }

        else if (usuario < ordenador_piensa){
            System.out.println("El numero es mayor");
        }

        else if ( usuario > ordenador_piensa){
            System.out.println("El numero es menor");
        }

        contador = contador + 1; 
    }while(usuario!=ordenador_piensa && contador<=6);

    if (usuario == ordenador_piensa) {
        System.out.println("Has ganado");
        
    }

    else{
        System.out.println("Has perdido");
    }
      
    }

}
