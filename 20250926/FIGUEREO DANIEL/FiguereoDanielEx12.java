import java.util.Scanner;

public class FiguereoDanielEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cuando debo de cruzar
        //Establecer variables
        char valorSemaforo;
        //Pedir valor V-verde, A-Amarillo, R-Rojo
        System.out.println("Introduce el valor del semaforo (V-verde, A-Amarillo, R-Rojo): ");
        valorSemaforo = sc.next().charAt(0);
      

        //Establecer condiciones
        if (valorSemaforo == 'V'|| valorSemaforo == 'v') 
        {
            System.out.println("Puedes Cruzar");
        } else if (valorSemaforo == 'A' || valorSemaforo == 'a') 
        {
            System.out.println("Cruza con mucha precaucion, si no has comenzado a cruzar, espera a que se ponga verde");
        } else if (valorSemaforo == 'R'|| valorSemaforo == 'r') 
        {
            System.out.println("No cruces, espera a que se ponga verde");
        } else {
            System.out.println("Valor incorrecto, introduce V, A o R");
        }


    }

}
