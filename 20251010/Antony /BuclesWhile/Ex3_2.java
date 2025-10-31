import java.util.Random;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num_pensado_maquina = rd.nextInt(1,101);
        int usuario, contador = 0;
        //System.out.println("He pensado " + num_pensado_maquina);
         do
        {
        System.out.println("Que numero crees que he pensado");
        usuario = sc.nextInt();
            contador++;
        if (usuario==num_pensado_maquina) 
        {
            System.out.println("acertaste");    
        }
        else if (usuario<num_pensado_maquina) 
        {
            System.out.println("El numero es mayor");    
        }
        else if (usuario>num_pensado_maquina) 
        {
            System.out.println("El numero es menor");   
        }
        }   while(usuario!=num_pensado_maquina && contador<=6);
        if (usuario!=num_pensado_maquina) 
        {
            System.out.println("Has Acertado");    
        }
        if (usuario!=num_pensado_maquina) 
        {
            System.out.println("Has perdido");    
        }
            sc.close();
    }
}
